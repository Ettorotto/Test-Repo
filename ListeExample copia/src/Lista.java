public class Lista {
    private Nodo head;  //riferimento al nodo iniziale della lista (head è l'inizio, non la fine)
    
    private int elementi;   //numero di elementi (nodi) della lista


    public Lista()  //costruttore
    {
        head = null;
        elementi = 0;
    }

    public void visitaLista()   //praticamente sarebbe un toString, che dichiara p come se fosse i in un for
    {
        Nodo p = head;  //cosi gli dico di cominciare all inizio 
        while(p != null)    //cosi gli dico di continuare finchè non ce piu un prossimo nodoa qui andare
            {
                System.out.println(p.getInfo());  //stampo o faccio quello che mi pare con la info del nodo
                p = p.getLink();

            }
    }


    public void inserisciInTesta(String info)
    {
        Nodo n = new Nodo(info);    //creazione di un nuovo nodo che per ora chiamo n

        n.setLink(head);    //adesso la componente link del nodo si rifersci a head

        head = n;   //n diventa il nuovo primo nodo
        elementi++; //aggiorno il contatore dei nodi (visto che questo metodo ne aggiunge uno, faccio elementi+1)
    }


    public void inserisciInCoda(String info)
    {
        Nodo p = head;  //riferimento per scorrere la lista
        Nodo n = new Nodo(info);    //creazione del nuovo nodo

        if(p==null) //nel caso la lista sia vuota
            {
                inserisciInTesta(info);
            }
            else
            {
                while (p.getLink() != null) //scorro tuuuuutta la lista e arrivo fino alla fine.
                    {
                    p = p.getLink();
                    }

                n.setLink(null);    //cosi questo nuovo nodo n che stiamo creando sarà l'ultimo della lista
                p.setLink(n);
                elementi++;

            }
    }


    public void eliminaInTesta()    //elimina il primo elemento di una lista
    {
        if(head == null)    //controllo che la lista non sia vuota, se lo è non faccio niente (tanto è vuota)
            {
                return;
            }
        head=head.getLink();
        elementi--;
        
    }


    public void eliminaInCoda()
    {
        if(head == null)    //controllo che la lista non sia vuota, se lo è non faccio niente (tanto è vuota)
            {
                return;
            }
        if(head.getLink() == null)  //se ce un solo unico nodo serve fare il metodo piu semplice eliminaInTesta()
            {
                eliminaInTesta();
            }
            else
            {
                //scorrimento della lista con due riferimenti a nodi consecutivi fino a fine lista
                Nodo p = head;
                Nodo pp = head.getLink();
                while(pp.getLink() != null)
                    {
                        p = pp;
                        pp = pp.getLink();
                    } 
                p.setLink(null);
                elementi--;
            }
    }

























}
