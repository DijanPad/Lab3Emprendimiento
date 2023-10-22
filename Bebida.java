/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Lab2, Herencia
 * 21-10-2323
 * @return Bebida
 */

public class Bebida extends Producto {
    
    private int vol;
    private String tipo;

    

    public Bebida(int id, String nombre, int strock, int vendidos, Boolean disponible, float price, int vol,
            String tipo) {
        super(id, nombre, strock, vendidos, disponible, price);
        this.vol = vol;
        this.tipo = tipo;
    }
    
    public int getVol() {
        return vol;
    }
    public void setVol(int vol) {
        this.vol = vol;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

}
