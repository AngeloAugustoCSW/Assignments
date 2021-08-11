public class ListaExercicio {
    //
    public static void main(String[] args) {
        System.out.println("Lista de exercícios\n");
        System.out.println("Exercício 1: ");
        media();
        System.out.println("Exercício 2: ");
        area();
        System.out.println("Exercício 3: ");
        volume();
        System.out.println("Exercício 4: ");
        maiordobro();
        System.out.println("Exercício 5: ");
        bhaskara();
        System.out.println("Exercício 6: ");
        speed();
        System.out.println("Exercício 7: ");
        imposto();
        System.out.println("Exercício 8: ");
        parimpar();
        System.out.println("Exercício 9: ");
        comstring();
        System.out.println("Exercício 10: ");
        stringtoint();
    }
    public static void media() {;
        int nota1 = 10;
        int nota2 = 10;
        int nota3 = 10;
        int total = (nota1+nota2+nota3)/3;
        System.out.println("1- Cálculo de media: ");
        System.out.println("As notas: " + nota1 + " " + nota2 + " " + nota3);
        System.out.println("A media: " + total);
        System.out.println("\n");
    }
    public static void area() {
        int lado1 = 32;
        int lado2 = 2;
        int total = lado1*lado2;
        System.out.println("2- Cálculo de area: ");
        System.out.println("As medidas: " + lado1 + " " + lado2);
        System.out.println("A area: " + total);
        System.out.println("\n");
    }
    public static void volume() {
        int largura = 3;
        int altura = 6;
        int profundidade = 9;
        int total = (largura * altura * profundidade);
        System.out.println("3- Cálculo de volume: ");
        System.out.println("Largura: " + largura + " Altura: " + altura + " Profundidade: " + profundidade);
        System.out.println("O volume: " + total);
        System.out.println("\n");
    }
    public static void maiordobro() {
        System.out.println("4- Verificar um numero maior que o dobro de outro numero");
        int n1 = 10;
        int n2 = 20;
        String result = n2 >= (n1*2)
            ? "O número " + n2 + " É maior ou igual ao dobro do valor 1: " + n1
            : "O número " + n2 + " Não é maior ou igual ao dobro do valor 1: " + n1;
        System.out.println(result);
        System.out.println("\n");
    }
    public static void bhaskara() {
        int a,b,c;
        double delta,x1,x2;
        a = 1;
        b = -5;
        c = 6;
        delta = (b*b) + (-4*(a*c));
        x1 = ((-(b) + Math.sqrt(delta))/2*a);
        x2 = ((-(b) - Math.sqrt(delta))/2*a);
        System.out.println("5- Cálculo de bhaskara: ");
        System.out.println("Valores (em ordem a -> b -> c): " +a+" "+b+" "+c);
        System.out.println("Resultado x1: " +x1);
        System.out.println("Resultado x2: " +x2);
        System.out.println("\n");
        
    }
    public static void speed() {
        int km,h,speed;
        km = 3330;
        h = 5;
        speed = km/h;
        System.out.println("6- Cálculo de velocidade média: ");
        System.out.println("Distancia: "+km);
        System.out.println("Tempo: "+h);
        System.out.println("Velocidade média: "+speed);
        System.out.println("\n");

    }
    public static void imposto() {
        int salbruto,imposto,restante;
        salbruto = 50000;
        imposto = 250;
        restante = salbruto/imposto;
        System.out.println("7- Cálculo de imposto: ");
        System.out.println("Salário: R$"+salbruto);
        System.out.println("Imposto: R$"+imposto);
        System.out.println("Sobrou: R$"+restante);
        System.out.println("\n");
    }
    public static void parimpar() {
        int n =2;
        System.out.println("8- Verificar se o número é par ou impar: ");
        String result = (n %2) == 0
            ? "O número: " + n + " é par"
            : "O número: " + n + " é impar";
        System.out.println(result);
        System.out.println("\n");
    }
    public static void comstring() {
        String str1 = "teste";
        String str2 = "Oteste".substring(1);
        System.out.println("9- Verificar strings iguais: ");
        System.out.println("str1: " + str1 + ", str2: " + str2);
        String result = (str1.equals(str2))
            ? "As strings são iguais"
            : "As strings não são iguais";
        
        System.out.println(result);
        System.out.println("\n");
        
    }
    public static void stringtoint() {
        String str = "69420";
        int n = Integer.valueOf(str);
        System.out.println("10- Converter string para integer: ");
        System.out.println("String: "+str);
        System.out.println("Integer: "+n);
        System.out.println("\n");
    }
}