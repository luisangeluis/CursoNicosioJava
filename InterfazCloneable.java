public class MyClass {
    public static void main(String args[]) {
      
      
      CPersona persona1 = new CPersona("luis",29,'h');

        try{
            CPersona clonP1 = (CPersona)persona1.clone();
             System.out.println( "clonp1");

            System.out.println( clonP1);
            persona1.setNombre("angel");
                         System.out.println( "objeto original");

            System.out.println(persona1);             
            System.out.println( "clonp1");

            System.out.println(clonP1);
        }catch(CloneNotSupportedException e){
        
        }
        
        

      
    }
}

class CPersona implements Cloneable{
    private String nombre;
    private int edad;
    private char sexo;
    
    public CPersona(String pNombre, int pEdad, char pSexo){
        nombre = pNombre;
        edad = pEdad;
        sexo = pSexo;
    }
    
    public void setNombre(String pNombre){
        nombre = pNombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int pEdad){edad = pEdad;}
    public int getEdad(){return edad;}
    
    public void setSexo(char pSexo){sexo =pSexo;}
    public char getSexo(){return sexo;}
    
    public String toString(){
        String datos;
        datos = "nombre "+nombre +" edad " +edad+ " sexo "+sexo;
        return datos;
    }
    
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}