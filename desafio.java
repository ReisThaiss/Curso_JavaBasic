import java.util.Scanner;

public class desafio {
    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);
        int numconta, numagencia;
        double saldo = 500.54;
        
        System.out.println ("Digite o número da conta: ");
        numconta = ler.nextInt();

        System.out.println ("Digite o número da agência: ");
        numagencia = ler.nextInt();

        if (numconta == 11111 && numagencia == 222) {
            System.out.println ("Olá fulano, obrigado por criar uma conta em nosso banco, sua agência é " + numagencia + " conta " + numconta + " e seu saldo de " + saldo + " já está disponível para saque");
        }

        else {
            System.out.println ("Dados inválidos");
        }
    
}
} 
