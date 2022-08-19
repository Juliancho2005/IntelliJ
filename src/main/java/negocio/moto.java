package negocio;

public class moto extends vehiculo {

    public moto(){
        super.Acelerar();
        System.out.println("metodo acelerar del carro");
    }

    @Override
    public void Acelerar(){
        System.out.println("la moto acelera");
    }
}
