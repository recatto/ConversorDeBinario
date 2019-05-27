package pkg;

import java.util.Scanner;

public class ImprimirBinario {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num;
    	System.out.println("Insira o n�mero a ser convertido para bin�rio: ");
    	num = sc.nextInt();

    	System.out.println("Convertido: ");
    	converteBinario(num);
    	sc.close();


    }

    public static void converteBinario(int n) {
        if (n / 2 != 0) {
            converteBinario(n / 2);
        }
        System.out.print(n % 2 + " ");
    }

}
