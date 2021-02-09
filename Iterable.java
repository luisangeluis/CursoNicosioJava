import java.util.Iterator;

public class MyClass {
    public static void main(String args[]) {
      
      
      CAvesEnZoo grupo1 = new CAvesEnZoo("aguilas",10,25);
    CAvesEnZoo grupo2 = new CAvesEnZoo("buitres",55,45);
    CAvesEnZoo grupo3 = new CAvesEnZoo("halcones",25,55);
        
        CAvesEnZoo[] grupos = {grupo1,grupo2,grupo3};
        
        CGruposDeAvesZoos gruposConjunto = new CGruposDeAvesZoos(grupos);
        
    
        for(CAvesEnZoo grupo : gruposConjunto){
           grupo.calcularTotalAves();
           System.out.println(grupo.ToString());
        }
        
        

      
    }
}

class CAvesEnZoo{
    private String tipoAve;
    private int numAves;
    private int numMachos;
    private int numHembras;
    
    
    public CAvesEnZoo(String pTipoAve, int pNumMachos, int pNumHembras){
        tipoAve=pTipoAve;
        numAves = 0;
        numMachos = pNumMachos;
        numHembras=pNumHembras;
    }
    
    public void calcularTotalAves(){
        numAves = numMachos+numHembras;
    }
    
    public String ToString(){
        
        String datos;
        datos = "tipo: "+tipoAve+ " total: "+numAves+" machos: "+numMachos+" hembras: "+numHembras; 
        return datos; 
    }
}



class CGruposDeAvesZoos implements Iterable<CAvesEnZoo>{
    
    private CAvesEnZoo[] grupoAves;
    
    public CGruposDeAvesZoos(CAvesEnZoo[] pGrupoAves){
        grupoAves = pGrupoAves;
        
    }
    
    public Iterator<CAvesEnZoo> iterator(){
        Iterator it = new miIteratorAves();
        return it;
    }
    
    protected class miIteratorAves implements Iterator<CAvesEnZoo>{
    
        protected int posicion=0;
        
        public miIteratorAves(){
        }
        
        public CAvesEnZoo next(){
            posicion++;
            return grupoAves[posicion-1];
        }
        
        public boolean hasNext(){
            boolean result;
            if(posicion< grupoAves.length){
                result = true;
            }else{
                result = false;
            }
            return result;
        }
        
        
        
        public void remove(){
            throw new UnsupportedOperationException("No soportado.");
        }
    
        
        
    }
    
    
    
    
}