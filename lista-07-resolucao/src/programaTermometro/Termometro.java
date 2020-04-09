package programaTermometro;

import java.util.concurrent.DelayQueue;

public class Termometro {
 private  Integer TempMin;
 private  Integer TempMax;
 private  Integer TempAtual;


   public Termometro(){
       System.out.println("Criando um termometro aguarde...");
   }
   //Construtor para todos os atributos
    public Termometro(Integer TempMax,Integer TempAtual,Integer TempMin){
        this();
        this.TempMin = TempMin;
        this.TempMax = TempMax;
        this.TempAtual = TempAtual;
   }

    public Integer getTempMin() {
        return TempMin;
    }

    public void setTempMin(Integer tempMin) {
        TempMin = tempMin;
    }

    public Integer getTempMax() {
        return TempMax;
    }

    public void setTempMax(Integer tempMax) {
        this.TempMax = tempMax;

    }


    public Integer getTempAtual() {
       return TempAtual;
    }

    public Integer validarTempMax(){
        if (getTempAtual() > getTempMax()){
            TempMax = getTempAtual() ;
        }
        return TempMax;
    }

    public void setTempAtual(Integer tempAtual) {
        TempAtual = tempAtual;
    }
    public void exibirTemperatura(){
        System.out.println("+++++++++++++++++++");
        System.out.println("Olá");
        System.out.println("A temperatura minima hoje é : " + getTempMin() +"°");
        System.out.println("A temperatura atual é : " + getTempAtual()+"°");
        System.out.println("A temperatura maxima hoje é : " + validarTempMax()+"°");
   }

   public Double calcularfahrenheintMIN (){
       //*1,8 e +32
       return (getTempMin() * 1.8) +32;
     }
    public Double calcularfahrenheintMAX (){
        //*1,8 e +32
        return (getTempMax() * 1.8) +32;
    }public Double calcularfahrenheintAtual (){
        //*1,8 e +32
        return (getTempAtual() * 1.8) +32;
    }


   public void exibirFahrenheint(){
       Double temperaturaMinima = calcularfahrenheintMIN();
       Double TemperaturaAtual = calcularfahrenheintAtual();
       Double TemperaturaMaxima = calcularfahrenheintMAX();


       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
       System.out.println("A temperatura minima em Fahrenheint hoje é : " + temperaturaMinima +"°");
       System.out.println("A temperatura atual em Fahrenheint hoje é : " + TemperaturaAtual+"°");
       System.out.println("A temperatura maxima em Fahrenheint hoje é : " + TemperaturaMaxima+"°");
   }
}
