package uniderp.poo.escola.Domínio;

import java.util.ArrayList;
import java.util.Scanner;

public class Opcao {
    protected ArrayList<Integer> lista;
    protected Scanner scan;

    {
        this.lista = new ArrayList<Integer>();
        this.scan = new Scanner(System.in);
    }

    public Opcao() {

        int continuar = 99;
        while (continuar != 0) {
            System.out.println("Informe um numero inteiro, ou 0 para sair: ");
            int num = this.scan.nextInt();
            if (num != 0) {

            }
        }
    }
}
// }
// private void ExecutorOpcao2(){
// int tam = this.lista.size();
// for (int )
// }
// private void ExecutorOpcao3(){
// int tam = this.lista.size();
// System.out.println("Lista (0.,"t(tam-1) + ");
// System.out.println("Informe uma posicao na lista:");
// int pos = this.lista.size() -1;
// int val = this .lista.get(pos);
// System.out.println:val + ("um quadrado vale " + (val*val) + ".");
// }
// private void ExecutorOpcao4(){
// int val = this.lista.get(0);
// int dobro = val * 2;
// int triplo = val * 3;
// double raiz = math.sqrt(val);
// System.out.println("dobro =") + dobro ;
// }

// private void ExecutarOpcao5(){
// int pos = this.lista.size() -1;
// int val = this .lista.get(pos);
// System.out.println("Informe a potencial");
// int pot = this.scan.nextInt();
// int
