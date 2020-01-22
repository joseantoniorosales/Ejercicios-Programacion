package ej10t9;

public class Ameba {
    
    int peso;

    public Ameba() {
        
        this.peso = 3;
        
    }
    
    void come (int pesoComida) {
        this.peso += pesoComida - 1;
    }
    
    void come (Ameba a) {
        this.peso = a.peso - 1;
        a.peso = 0; //A la ameba comida se le quita el peso, pues lo absorbe la otra
    }

    @Override
    public String toString() {
        return "Hola soy una ameba y peso " + peso + " microgramos";
    }
    
    

   


    


    
    
}
