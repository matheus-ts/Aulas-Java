package programaCinema;

public class TesteCinema {
    public static void main(String[] args) {
        //Objeto 1
        CalculaDesconto primeiroCliente = new CalculaDesconto(2,10,40,"Mickey",true,11);
        primeiroCliente.exibirResultados();
        //Objeto 1
        //Objeto 2
        CalculaDesconto cliente = new CalculaDesconto(17,10,40,"Donald",true,20);
        cliente.exibirResultados();
        CalculaDesconto cliente2 = new CalculaDesconto(18,10,40,"Pateta",false,10);
        cliente2.exibirResultados();
        CalculaDesconto cliente3 = new CalculaDesconto(18,10,40,"Pluto",true,22);
        cliente3.exibirResultados();
    }
}
