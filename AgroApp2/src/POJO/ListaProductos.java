
package POJO;


public class ListaProductos {
    public String 	arrayFrescos[]= { "Manzana","Fresa","Snadia","Uva","Pera","Guayaba","Zanahoria","Rabano",};

    public String       arrayRefrigerados[]={"Crema","Leche","Mantequilla","Queso"};
    public String       arrayCongelados[]={"Chuleta","Bistec","Pescado","Lomo de cerdo"};

    public ListaProductos() {
    }
    

    public String[] getArrayRefrigerados() {
        return arrayRefrigerados;
    }

    public void setArrayRefrigerados(String[] arrayRefrigerados) {
        this.arrayRefrigerados = arrayRefrigerados;
    }

    public String[] getArrayCongelados() {
        return arrayCongelados;
    }

    public void setArrayCongelados(String[] arrayCongelados) {
        this.arrayCongelados = arrayCongelados;
    }
   
    
    
    public String[] getArrayFrescos() {
        return arrayFrescos;
    }

    public void setArrayFrescos(String[] arrayFrescos) {
        this.arrayFrescos = arrayFrescos;
    }
    
    
}
