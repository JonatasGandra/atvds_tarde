public class Quadrado {
    //declarando as variáveis
    private float lado;

    public void setLado(float lado) { //parte do encapsulamento para selecionar a variável
        this.lado = lado;
    }

    public float calcularArea() { // função que calcula a área do quadrado
        return lado * lado;
    }

    public void contaQ(){
        System.out.println( "A conta foi feita da seguinte forma: " + lado + " * " + lado + " = " + calcularArea());     
    }//método construtor que mostra a meneira que a conta foi feita

    public void imprimir() {
        System.out.println("Lado: " + lado);
        System.out.println("Área: " + calcularArea()); 
    }//método construtor que apresenta o lado e o resultado

   
}

