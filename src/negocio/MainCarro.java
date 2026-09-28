package negocio;

public class MainCarro {
    static void main() {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();

        c1.potencia = 2;
        c1.velocidad = 60;

        c2.potencia = 10;
        c2.velocidad = 25;

        c3.velocidad = 45;
        c3.potencia = 32;

        System.out.println("\nLa potencia del carro es " + c2.potencia + " y su velocidad es " + c2.velocidad);

        c1.frenar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        c2.frenar();
        c2.frenar();

        c3.acelerar();
        c3.acelerar();
        c3.frenar();
        c3.frenar();
        c3.frenar();
        c3.frenar();
        c3.frenar();

        System.out.println("\nLa potencia del carro es " + c2.potencia + " y su velocidad es " + c2.velocidad);
        System.out.println("\nLa potencia del carro es " + c3.potencia + " y su velocidad es " + c3.velocidad);
        System.out.println("\nLa potencia del carro es " + c1.potencia + " y su velocidad es " + c1.velocidad);

    }
}
