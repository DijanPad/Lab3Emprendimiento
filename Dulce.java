/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Lab2, Herencia
 * 21-10-2323
 * @return Dulce
 */

public class Dulce extends Producto{
    
    private int unidades;
    private String sabor;
    private String tipo;
    private float comision;


    public Dulce(int id, String nombre, int strock, int vendidos, Boolean disponible, float price, int unidades,
            String sabor, String tipo, float comision) {
        super(id, nombre, strock, vendidos, disponible, price);
        this.unidades = unidades;
        this.sabor = sabor;
        this.tipo = tipo;
        this.comision = comision;
    }

    public int getUnidades() {
        return unidades;
    }
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public float getComision() {
        return comision;
    }
    public void setComision(float comision) {
        this.comision = comision;
    } 

}
