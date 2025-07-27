public class Saude implements Imposto
{
    String name;

    public void setName(String name)
    {
        this.name = name;

    }
    public String getName()
    {
        return name;
    }
    public String taxaImposto()
    {
        return "1.5%";
    }
}
