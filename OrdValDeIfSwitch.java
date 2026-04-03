import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        //denominar variaveis
        int val1, val2, val3, opcao;
        int maior, meio, menor;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o 1º número:");
        val1 = sc.nextInt();
        System.out.println("Informe o 2º número:");
        val2 = sc.nextInt();
        System.out.println("Informe o 3º número:");
        val3 = sc.nextInt();
        System.out.println("Informe qual opção deseja - entre 1 a 3");
        opcao = sc.nextInt();

        //descobrindo maior, meio e menor com if
        if (val1 > val2 && val1 > val3) {
            maior = val1;

            if (val2 > val3) {
                meio = val2;
                menor = val3;
            } else {
                meio = val3;
                menor = val2;
            }
        } else if (val2 > val1 && val2 > val3) {
            maior = val2;

            if (val1 > val3) {
                meio = val1;
                menor = val3;
            } else {
                meio = val3;
                menor = val1;
            }
        } else {
            maior = val3;

            if (val1 > val2) {
                meio = val1;
                menor = val2;
            } else {
                meio = val2;
                menor = val1;
            }
        }

        //decisão da ordem com switch
        switch (opcao) {
            case 1:
                System.out.println(+menor+" "+meio+" "+maior);
                break;
            case 2:
                System.out.println(+maior+" "+meio+" "+menor);
                break;
            case 3:
                System.out.println(+meio+" "+maior+" "+menor);
            default: System.out.println("Opção inválida");
                break;
        }
    }
}
