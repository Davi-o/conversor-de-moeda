package model;

/**
 *
 * @author Davi Alves
 * @since 19/03 - 11:21
 * @version 1.0 Catelyn Version
 * 
 */
public class Conversor {
   private double reais=1;

    public Conversor() {
    }
    
    /**
     * @param reais is prepared to receive the value of reais. 
     */
    public Conversor(double reais) {
        this.reais = reais;
    }
    //getter
    public double getReais() {
        return reais;
    }

    public void setReais(double reais) {
        this.reais = reais;
    }
    //setter
   
    /**
     * @return converts the value of the reais in dolar
     */
    public double convertToDolar(){
        return this.reais * 0.26;
    }
    
    /**
     * @return converts the value of the reais in euro 
     */
    public double convertToEuro(){
        return this.reais * 0.23;
    }
    
    /** 
     * @return converts the value of the reais in peso
     */
    public double convertToPeso(){
        return this.reais * 10.59;
    }
    
    /** 
     * @return converts the value of the reais in bitcoin
     */
    public double convertToBitcoin(){
        return this.reais * 0.000066;
    }

    @Override
    public String toString() {
        return this.reais + " Reais \n" +
               convertToDolar() + " Dolars\n" +
               convertToEuro() + " Euros\n" +
               convertToPeso() + " Pesos\n"+
               convertToBitcoin() + " Bitcoins";
    }
}