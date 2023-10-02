import java.util.Stack;

public class Pila {
    private Stack<Integer> pila;

    public Pila(){
        pila=new Stack<Integer>();
    }

    public void ingresar(Integer dato){
        pila.push(dato);
    }

    public Integer extraer() throws Exception{
        if (pila.empty())
            throw new Exception("pila vacia");
        return pila.pop();
    }

    public Integer elementoTop() throws Exception{
        if (pila.empty())
            throw new Exception("No hay elemntos");
        return pila.peek();
    }

    @Override
    public String toString() {
        String resultado="==Pila==\n";
        for (int i=pila.size()-1;i>=0;i--){
            resultado+=pila.get(i)+"\n";
        }

        return resultado;
    }
}
