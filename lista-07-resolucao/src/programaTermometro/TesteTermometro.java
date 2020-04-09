package programaTermometro;

public class TesteTermometro {
    public static void main(String[] args) {
        //Primeiro objeto
        Termometro temperatura = new Termometro();
        temperatura.setTempAtual(60);
        temperatura.setTempMin(40);
        temperatura.setTempMax(80);

        temperatura.exibirTemperatura();
        temperatura.exibirFahrenheint();
        //
        //Construtor para inicializar já com todos os atributos
        Termometro termometro2 = new Termometro(20,40,30);
        termometro2.exibirTemperatura();
        termometro2.exibirFahrenheint();
    }
}
