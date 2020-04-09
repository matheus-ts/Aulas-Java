
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matheus
 */
public class desafioClass {

    Random gerador = new Random(100);
    
    Integer valor = 0;
    String Status1 = "";
   
    
    void gerar(){
   
   
        if(valor > 0 && valor <=20){
           Status1 = "Status = Suave";
        }
        else if(valor > 20 && valor <=70 ){
           Status1 = "Status = Atenção";
        }
        else{
           Status1 = "Status = critico";
        }
      valor = gerador.nextInt(100);   
    }
    
}
