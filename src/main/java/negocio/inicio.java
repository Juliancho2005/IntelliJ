package negocio;

public class inicio {
    public static void main(String[] args){

        vehiculo miVehiculo = new vehiculo();
        carro miCarro = new carro();
        moto miMoto = new moto();

        miCarro.Acelerar();
        miMoto.Acelerar();
        miVehiculo.Acelerar();

    }

}
