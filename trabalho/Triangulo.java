public class Triangulo {
    //declarando as variáveis
    private float base;
    private float altura;

    public void setBase(float base) {//parte do encapsulamento para selecionar a variável base
        this.base = base;
    }

    public void setAltura(float altura) {//parte do encapsulamento para selecionar a variável altura
        this.altura = altura;
    }

    public float calcularArea() { //função que calcula a área
        return (base * altura) / 2;
    }

    public void contaT(){
        System.out.println("A conta foi feita da seguinte forma: " + base + " * " + altura + " / 2 = " + calcularArea());
    }//método construtor que mostra a meneira que a conta foi feita
    public void imprimir() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
    }//método construtor que expõe os dados do triângulo e o reultado
}
