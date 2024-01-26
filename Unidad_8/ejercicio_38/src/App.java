import funciones.*;

public class App {
    public static void main(String[] args) throws Exception {
        int[] test = {1321,442244,102021};
        test = filtraCapicuas(test);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }

    public static int[] filtraCapicuas(int[] x) {
        int[] tmp = new int[x.length];
        int logtmp = 0;
        for (int i = 0; i < x.length; i++) {
            if (generales.esCapicua(x[i])) {
                tmp[logtmp] = x[i];
                logtmp++;
            }
        }
        
        // el resto en -1
        for (int i = logtmp; i < tmp.length; i++) {
            tmp[i] = -1;
        }

        return tmp;
    }
}
