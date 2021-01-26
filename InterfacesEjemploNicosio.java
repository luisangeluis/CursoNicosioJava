public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;

      System.out.println("Sum of x+y = " + z);
      
      IOperacion operacion =null;
      
      operacion = new CResta(1,2);
      operacion.calcular();
      operacion.mostrarResultado();
    }
}

interface IOperacion{
    void calcular();
    void mostrarResultado();
}

abstract class COperacion{
    private int num1;
    private int num2;
    protected int result;
    //METODOS GET Y SET
    public void setNum1(int pNum){
        num1 = pNum;
    }
    
    public void setNum2(int pNum){
        num2 = pNum;
    }
    
    public int getNum1(){
        return num1;
    }
    
    public int getNum2(){
        return num2;
    }
    //METODO CONSTRUCTOR
    
    public COperacion(int pNum1, int pNum2){
        num1 = pNum1;
        num2 = pNum2;
        result =0;
    }
    
    
    
}

class CSuma extends COperacion implements IOperacion {
    
    public CSuma(int pNum1, int pNum2){
        super(pNum1, pNum2);
        
    }
    
    public void calcular(){
       result = getNum1() + getNum2(); 
    }
    
    public void mostrarResultado(){
        System.out.println("El resultado de la suma es: "+ result);
    }
    
}
//CLASE SUMA
class CResta extends COperacion implements IOperacion{
   
    
    public CResta(int pNum1, int pNum2){
        super(pNum1, pNum2);
        
    }
    //METODO CALCULAR
    public void calcular(){
       result = getNum1() - getNum2(); 
    }
    //METODO PARA MOSTRAR EL RESULTADO DE LA OPERACION
    public void mostrarResultado(){
        System.out.println("El resultado de la resta es: "+ result);
    }
    
}