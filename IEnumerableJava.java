import java.util.ArrayList;

public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;

      System.out.println("Sum of x+y = " + z);
    }
}

interface IVehiculo{
    String MostrarInformacion();
    
    void CalcularTenencia();
}


class CAuto implements IVehiculo{
    private String marca;
    private float costo;
    private float tenencia;
    private final float porcentaje=.10f;
    
    
    public CAuto(String pMarca, float pCosto){
        marca = pMarca;
        costo = pCosto;
        tenencia = 0.0f;
    }
    
    public void CalcularTenencia(){
        tenencia = costo*porcentaje;
        
    }
    
    public String MostrarInformacion(){
        String informacion;
        informacion = "El auto marca: "+ marca + " cuesta: "+costo+ " y tiene una tenencia de: "+tenencia;
        return informacion;
    }
}


class CTiendaAutos{
    
       ArrayList<CAuto> autos=null;
        
        public CTiendaAutos(){
            autos = new ArrayList<CAuto>();
            
            CAuto auto1 = new CAuto("ford", 4000);
            CAuto auto2 = new CAuto("Nissan", 3000);

            
            autos.add(auto1);
            autos.add(auto2);

        }
        
        
}