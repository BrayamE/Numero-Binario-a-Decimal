import java.util.Scanner;

public class BinarioAEntero {
    public static int convertirBinarioAEntero(String binario) {
        if (binario.length() == 0) {
            return 0;
        } else {
            char bit = binario.charAt(binario.length() - 1);
            int valorBit = Character.getNumericValue(bit);
            String subBinario = binario.substring(0, binario.length() - 1);
            return valorBit + 2 * convertirBinarioAEntero(subBinario);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Hola, Brayam Edwin Quispe Apaza");
        System.out.print("Ingrese un número en notación binaria: ");
        String binario = scanner.nextLine();
        scanner.close();
        int entero = convertirBinarioAEntero(binario);
        System.out.println("El número binario " + binario + " en decimal es: " + entero);
    }
}
