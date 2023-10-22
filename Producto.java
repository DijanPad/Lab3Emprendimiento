/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Lab2, Herencia
 * 21-10-2323
 * @return Producto
 */

public class Producto {
    private int id;
    private String nombre;
    private int stock;
    private int vendidos;
    private Boolean disponible;
    private float price;



    public Producto(int id, String nombre, int strock, int vendidos, Boolean disponible, float price) {
        this.id = id;
        this.nombre = nombre;
        stock = strock;
        this.vendidos = vendidos;
        this.disponible = disponible;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int strock) {
        stock = strock;
    }
    public int getVendidos() {
        return vendidos;
    }
    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }
    public Boolean getDisponible() {
        return disponible;
    }
    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "id: " + id + "| nombre: " + nombre + "| stock: " + stock + "| vendidos: " + vendidos + "| price: Q"
                + price ;
    } 

    
    

}
