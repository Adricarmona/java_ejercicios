package ejercicio_3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ejercicio3 {
    public static void main(String[] args) throws IOException {
        int num = (int)(Math.random() * 5 + 1);
        switch (num) {
            case 1:
                throw new NumberFormatException();
            case 2:
                throw new IOException();
            case 3:
                throw new FileNotFoundException();
            case 4:
                throw new IndexOutOfBoundsException();
            case 5:
                throw new ArithmeticException();
            default:
                break;
        }
    }
}
