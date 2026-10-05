package negocio;

public class Carro {
    public int potencia;
    public double velocidad;

    /* metodo set() (establecer valores)
      "siempre" es void, siempre tiene parametro y este es el mismo tipo del atributo */

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

    public void setVelocidad(double velocidad){
        this.velocidad = velocidad;
    }

    /* metodo get() (obtener información)
    siempre retorna un valor, el tipo de retorno siempre es del mismo tipo del atributo
     */

    public int getPotencia(){
        return potencia;
    }

    public double getVelocidad(){
        return velocidad;
    }

    public void acelerar(){
        velocidad += potencia;
    }

    void frenar(){
        velocidad /= potencia;
    }
}