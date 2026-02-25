/**Autore: Ettore Poletti
 * Obiettivo: capire e implementare una classe lista. (contenente Nodo)
 * questo file sarà usato da me come template per futuri progetti con le liste, quindi cercherò di fare questo il meglio possibile,
 * inserendo anche dei commenti che spiegano i concetti dei metodi complicati
 * 
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {


        Lista L1 = new Lista();



        Scanner input = new Scanner (System.in);

        int domanda = 0;
        while(domanda != 10)
        {
            System.out.println("\nscegli un opzione:\n0: inserimento in testa\n1: Visita lista (stampa)\n2: inserimento in coda\n3:Eliminazione in testa");

            domanda = input.nextInt();
            input.nextLine();


            String info;
            switch(domanda)
            {


                case 0: 
                    System.out.println("\n-----\ninserimento in testa\ninserisci un informazione:");
                    info=input.nextLine();   //chiedo l'informazione
                    L1.inserisciInTesta(info);
                break;

                case 1:
                    System.out.println("Visita (stampa)");
                    L1.visitaLista();
                break;

                case 2:
                    System.out.println("\n----\ninserimento in coda\nquesto elemento sarà aggiunto IN FONDO alla lista\ninserisci un informazione:");
                    info=input.nextLine();
                    L1.inserisciInCoda(info);
                break;

                case 3:
                    System.out.println("elimino il primo elemento della lista... (dopo head)");
                    L1.eliminaInTesta();
                    System.out.println("ELEMENTO ELIMINATO");
                break;
            }
        }

        input.close();

    }
}
