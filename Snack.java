/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Lab2, Herencia
 * 21-10-2323
 * @return Snack
 */

public class Snack extends Producto {

    private int gramos;
    private String Sabor;
    private String tamanio;


    public Snack(int id, String nombre, int strock, int vendidos, Boolean disponible, float price, int gramos,
            String sabor, String tamanio) {
        super(id, nombre, strock, vendidos, disponible, price);
        this.gramos = gramos;
        Sabor = sabor;
        this.tamanio = tamanio;
    }

    public int getGramos() {
        return gramos;
    }
    public void setGramos(int gramos) {
        this.gramos = gramos;
    }
    public String getSabor() {
        return Sabor;
    }
    public void setSabor(String sabor) {
        Sabor = sabor;
    }
    public String getTamanio() {
        return tamanio;
    }
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    
    
}
