package programaCinema;

import java.util.function.DoubleToLongFunction;

public class CalculaDesconto {

  private  Integer hora;
  private  Integer sala;
  private  Integer valor;
  private  String nome;
  private  Boolean estudante= true;
  private  Integer idade;

    public CalculaDesconto(){
        System.out.println("Bem vindo ao cinema!");
    }
    public CalculaDesconto(Integer hora, Integer sala, Integer valor, String nome, Boolean Estudante, Integer idade){
        this();
        this.estudante = estudante;
        this.hora = hora;
        this.nome =nome;
        this.sala = sala;
        this.valor = valor;
        this.idade = idade;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getEstudante() {
        return estudante;
    }

    public void setEstudante(Boolean estudante) {
        this.estudante = estudante;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void exibirResultados(){
        System.out.println("==============================================");
        System.out.println("Olá ," + getNome());
        System.out.println("A sua sala é: " + getSala());
        System.out.println("Seu filme começa as: " + getHora()+":00");
        System.out.println("Seu ingresso custa: R$" + getValor());
        meiaEntrada();
        System.out.println("==============================================");

    }
    public void meiaEntrada(){
       Integer inteira = getValor();
       boolean estudante = getEstudante();

       if ( getIdade() < 12){

           Double valor =  inteira - (inteira * 0.50);

           if (getHora() > 16) {
               Double descontoHora = valor - (inteira * 0.10);

               System.out.println("O valor que deve ser pago é: " + descontoHora);
           } else{
           System.out.println("O valor que deve ser pago é: " + valor);
       }
       }
       else if (getIdade() > 12 && getIdade() <= 15 && getEstudante() == true) {
           Double valor = inteira - (inteira * 0.40);
           if (getHora() > 16) {
               Double descontoHora = valor - (inteira * 0.10);
               System.out.println("O valor que deve ser pago é: " + descontoHora);

           }else {
               System.out.println("O valor que deve ser pago é: " + valor);
           }
       }
       else if (getIdade() > 16 && getIdade() <= 20 && getEstudante() == true) {
               Double valor = inteira - (inteira * 0.30);
               if (getHora() > 16) {
                   Double descontoHora = valor - (inteira * 0.10);
                   System.out.println("O valor que deve ser pago é: " + descontoHora);
               } else {
                   System.out.println("O valor que deve ser pago é: " + valor);
               }}

           else if(getIdade() >= 20 || getEstudante() == true)
           {
               Double valor =  inteira - (inteira * 0.20);
               if (getHora() > 16){
               Double descontoHora = valor - (inteira*0.10);
               System.out.println("O valor que deve ser pago é: " + descontoHora);
                                  }
               else {
                   System.out.println("O valor que deve ser pago é: " + valor);
               }
           }
       else if (getHora() > 16 &&  getIdade() > 20){
           Double descontoHora = inteira - (inteira*0.10);
           System.out.println("O valor que deve ser pago é: " + descontoHora);
       }
       else{
           System.out.println("O valor que deve ser pago é: " +inteira);

       }

    }
}
