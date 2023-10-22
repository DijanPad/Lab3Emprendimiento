/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Lab2, Herencia
 * 21-10-2323
 * @return Emprendimiento
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    
    public static void main(String[] args){
        ArrayList<Producto> productos = new ArrayList<Producto>();

        //variables de setteo
        boolean run = true;
        int inputOption = 0;

        String database = "dataEmp.csv";
        String menu = "Emprendimiento"+"\n"+
        "1. Buscar un producto por id\n" + 
        "2. Listar los productos de una categoría"+"\n"+
        "3. Mostrar las ventas actuales de la tienda"+"\n"+
        "4. Salir";

        Scanner scanner = new Scanner(System.in);

        //;ector de csv
        try (BufferedReader br = new BufferedReader(new FileReader(database))) {
                String encabezado = br.readLine();
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] valores = linea.split(",");
                    
                    // Extraer los valores del CSV
                    String type = valores[0];
                    int id = Integer.parseInt(valores[1]);
                    String nombre = valores[2];
                    int stock = Integer.parseInt(valores[3]);
                    int vendidos = Integer.parseInt(valores[4]);
                    boolean disponible = Boolean.parseBoolean(valores[5]);
                    float price = Float.parseFloat(valores[6]);
                    
                    //clasificar por objeto
                    if ("B".equals(type)) {
                        int vol = Integer.parseInt(valores[7]);
                        String tipo = valores[8];
                        productos.add(new Bebida(id,nombre,stock,vendidos,disponible,price,vol,tipo));
                    } else if ("S".equals(type)) {
                        int gramos = Integer.parseInt(valores[7]);
                        String sabor = valores[8];
                        String tamanio = valores[9];
                        productos.add(new Snack(id,nombre,stock,vendidos,disponible,price,gramos,sabor,tamanio));
                    } else if ("D".equals(type)) {
                        int unidades = Integer.parseInt(valores[7]);
                        String sabor = valores[8];
                        String tipoDulce = valores[9];
                        float comision = Float.parseFloat(valores[10]);
                        productos.add(new Dulce(id,nombre,stock,vendidos,disponible,price,unidades,sabor,tipoDulce,comision));
                    }

                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            //iniciar menu loop
            while (run == true){
                System.out.println(menu);
            
                System.out.println("Ingresa una opcion del menu: ");
                inputOption = scanner.nextInt();

                System.out.println("\n ");

                //buscar objeto por id
                if (inputOption == 1) {
                    System.out.println("Ingrese el id del producto que desea busacar: ");
                    int search = scanner.nextInt();
                        for (int i = 0; i < productos.size(); i++){
                            if (productos.get(i).getId() == search){
                                System.out.println(productos.get(i).toString());
                            }
                        }
                //productos por categoria
                } if (inputOption == 2) {
                    System.out.println("Listado de productos por categoria:\n");
                    System.out.println("Bebidas");
                    for (int i = 0; i < productos.size(); i++){
                        //solo imprime los objetos Bebida
                        if (productos.get(i) instanceof Bebida){
                            System.out.println("- "+productos.get(i).getNombre());
                        }
                    }
                    System.out.println("\n");
                    System.out.println("Snacks");
                    for (int i = 0; i < productos.size(); i++){
                        //solo imprime los objetos Snack
                        if (productos.get(i) instanceof Snack){
                            System.out.println("- "+productos.get(i).getNombre());
                        }
                    }
                    System.out.println("\n");
                    System.out.println("Dulces");
                    for (int i = 0; i < productos.size(); i++){
                        //solo imprime los objetos Dulce
                        if (productos.get(i) instanceof Dulce){
                            System.out.println("- "+productos.get(i).getNombre());
                        }
                    }
                } if (inputOption == 3){

                    //contar productos de cada tipo
                    System.out.println("Listado de categorías con el total de productos");
                    int total = 0;
                    for (int i = 0; i < productos.size(); i++){
                        if (productos.get(i) instanceof Bebida){
                            total = total + productos.get(i).getStock();
                        }
                    }
                    System.out.println("Bebidas: "+ total);
                    total = 0;
                    for (int i = 0; i < productos.size(); i++){
                        if (productos.get(i) instanceof Snack){
                            total = total + productos.get(i).getStock();
                        }
                    }
                    System.out.println("Snacks: "+ total);
                    total = 0;
                    for (int i = 0; i < productos.size(); i++){
                        if (productos.get(i) instanceof Dulce){
                            total = total + productos.get(i).getStock();
                        }
                    }
                    System.out.println("Dulces: "+ total);

                    System.out.println("\n");
                    
                    //suma de ventas totales
                    System.out.println("Total de ventas");
                    float Tventas = 0;
                    float comision = 0;

                    //encontrar la comision percibida
                    for (int i = 0; i < productos.size(); i++){
                        Tventas = Tventas + (productos.get(i).getPrice()*productos.get(i).getVendidos());
                        if(productos.get(i) instanceof Dulce){
                            comision = comision + (productos.get(i).getPrice()*((Dulce) productos.get(i)).getComision()*productos.get(i).getVendidos());
                        }
                    }
                    System.out.println("Ventas totales Q"+Tventas);
                    System.out.println("Porcentaje por categoría Dulce : Q"+comision);
                    System.out.println("\n");
                    //salir :/
                } if(inputOption == 4){
                    run = !run;
                }else{
                    System.out.println("Ingrese una opcion valida");
                }
            }

    }
}
