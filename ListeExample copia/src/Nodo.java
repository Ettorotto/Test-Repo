public class Nodo {
    private String info;
    private Nodo link;
    
    public Nodo (String info)
    {
        this.info = info;
        link = null;    //head
    }

    public String getInfo()
    {
        return info; 
    }

    public void setLink(Nodo link)
    {
        this.link=link;
    }

    public Nodo getLink()
    {
        return link;
    }

}
