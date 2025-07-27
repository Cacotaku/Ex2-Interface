
/*
    2 - Escreva um código que calcule o valor de tributos de produtos,
        os produtos disponíveis devem ser dos seguintes tipos:
        Alimentação, Saude e bem estar, Vestuário e Cultura.
        Todos os produtos devem ter um método para retornar o seu valor de imposto,
        de acordo com seu tipo:

    Alimentação 1%;
    Saude e bem estar 1.5%;
    Vestuário 2.5%;
    Cultura 4%.*/

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main
{

    public static void main(String[] args)
    {

        var cultura = new Cultura();
        var vestuario = new Vestuario();
        var saude = new Saude();
        var alimentacao = new Alimentacao();

        System.out.println("==========================");

        System.out.println("Cultura: " + cultura.taxaImposto());
        System.out.println("Vestário: " + vestuario.taxaImposto());
        System.out.println("Saúde: " + saude.taxaImposto());
        System.out.println("Alimentação: " + alimentacao.taxaImposto());

    }
}