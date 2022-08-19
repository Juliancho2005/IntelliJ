package negocio;

public class vehiculo {

    public vehiculo(){

    }

    //Declarar atributos
    private String marca;
    private String color;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Acelerar() {
        System.out.println("Se aceleran");
    }

    public void Frenar(){

    }

    public void Encender() {

    }

}
