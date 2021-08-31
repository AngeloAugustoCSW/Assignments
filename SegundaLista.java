/*
1) FEITO: crie um programa que receba três notas, calcule a média e diga se foi aprovado (nota1 + nota2 + nota3 / 3) e (média maior que 7 para ser aprovado)
2) FEITO: crie um programa que receba um número e indique o mês que representa
3) PESQUISAR: crie um programa que simule um jogo da forca, com a entrada da palavra oculta, a quantidade de tentativas para acerto e depois solicite a entrada da palavra. A cada erro deve imprimir a quantidade de tentativas restantes e o 'membro' que foi marcado. Ao final deve imprimir se acertou ou não a palavra e se foi 'enforcado'
4) FEITO: crie um programa que imprima a tabuada de 0 a 10.
5) FEITO: Crie um programa que receba uma String e imprima linha a linha suas letras
6) FEITO: Crie um programa que de a soma de todos os números ímpares e múltiplos de 7 entre 1 e 500
7) FEITO: Crie um programa que tenha como entrada as notas de um aluno. Somente se encerrará quando for inserida uma nota negativa. Ao final deverá informar a média das notas.
8) FEITO: Crie um programa que receba um valor e imprima o factor desse número. Ex.: 3! = 3 x 2 x 1 = 6
9) FEITO: Crie um programa que receba a altura e o peso e calcule o IMC

tabela IMC:
Abaixo de 18,5	Abaixo do Peso
Entre 18,6 e 24,9	Peso Ideal
Entre 25,0 e 29,9	Levemente acima do peso
Entre 30,0 e 34,9	Obesidade Grau I
Entre 35,0 e 39,9	Obesidade Grau II
Acima de 40	Obesidade Grau III (mórbida)

*/

import java.util.Scanner;
public class SegundaLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chc;
        do{
            System.out.println("=======================================");
            System.out.println("MENU");
            System.out.println("=======================================");
            System.out.println("[0] - Sair do programa");
            System.out.println("[1] - Atividade 1 - Calcular média de notas");
            System.out.println("[2] - Atividade 2 - Indicar mês pelo número");
            System.out.println("[3] - Atividade 3 - Jogo da forca");
            System.out.println("[4] - Atividade 4 - Tabuada de  a 10");
            System.out.println("[5] - Atividade 5 - Print linha por linha de uma string");
            System.out.println("[6] - Atividade 6 - Soma de números ímpares e multiplos de 7");
            System.out.println("[7] - Atividade 7 - Somente notas positivas");
            System.out.println("[8] - Atividade 8 - Fatorial de um número");
            System.out.println("[9] - Atividade 9 - IMC");
            System.out.println("=======================================");
            System.out.print("Sua escolha: ");
            chc = scanner.nextInt();
            switch (chc){
                case 0:
                    System.out.println("Saindo do programa");
                    scanner.close();
                    break;
                case 1:
                    medianota();
                    scanner.next();
                    break;
                case 2:
                    mes();
                    scanner.next();
                    break;
                case 3:
                    forca();
                    scanner.next();
                    break;
                case 4:
                    tabuada();
                    scanner.next();
                    break;
                case 5:
                    printstring();
                    scanner.next();
                    break;
                case 6:
                    soma();
                    scanner.next();
                    break;
                case 7:
                    notapos();
                    scanner.next();
                    break;
                case 8:
                    factor();
                    scanner.next();
                    break;
                case 9:
                    imc();
                    scanner.next();
                    break;
                default:
                System.out.println("Valor invalido");
                break;

            }
        }while (chc!=0);
    }



    public static void medianota() {
        Scanner scanner = new Scanner(System.in);
        int n1,n2,n3,med;
        System.out.println("=======================================");
        System.out.println("Atividade 1 - Calcular média de notas");
        System.out.println("=======================================");
        System.out.println("Digite três notas para calcular a média");
        System.out.print("Digite a 1º nota: ");
        n1 = scanner.nextInt();
        System.out.print("Digite a 2º nota: ");
        n2 = scanner.nextInt();
        System.out.print("Digite a 3º nota: ");
        n3 = scanner.nextInt();
        med = (n1+n2+n3)/3;
        System.out.println("Média: "+med);
        if(med>7){
            System.out.println("Aprovado"); 
        }else{
            System.out.println("Reprovado"); 
        }
        
    }

    public static void mes() {
        Scanner scanner = new Scanner(System.in);
        int mm;
        System.out.println("=======================================");
        System.out.println("Atividade 2 - Mês relacionado ao número inserido");
        System.out.println("=======================================");
        System.out.print("Digite um número de 1 a 12: ");
        mm = scanner.nextInt();
        if(mm==1){
            System.out.println("Número: "+mm+" - Mes: Janeiro");
        }else if(mm==2){
            System.out.println("Número: "+mm+" - Mes: Fevereiro");
        }else if(mm==3){
            System.out.println("Número: "+mm+" - Mes: Março");
        }else if(mm==4){
            System.out.println("Número: "+mm+" - Mes: Abril");
        }else if(mm==5){
            System.out.println("Número: "+mm+" - Mes: Maio");
        }else if(mm==6){
            System.out.println("Número: "+mm+" - Mes: Junho");
        }else if(mm==7){
            System.out.println("Número: "+mm+" - Mes: Julho");
        }else if(mm==8){
            System.out.println("Número: "+mm+" - Mes: Agosto");
        }else if(mm==9){
            System.out.println("Número: "+mm+" - Mes: Setembro");
        }else if(mm==10){
            System.out.println("Número: "+mm+" - Mes: Outubro");
        }else if(mm==11){
            System.out.println("Número: "+mm+" - Mes: Novembro");
        }else if(mm==12){
            System.out.println("Número: "+mm+" - Mes: Dezembro");
        }else{
            System.out.println("Valor Invalido");
        }
        
    }

    public static void forca(){
        int tries=5;
        int correct=0;
        String secret = "******";
        String word = "potato";
        System.out.println("Advinhe a palavra secreta");
        for(int i=tries;i>0;i--){
            System.out.println("Voce tem "+ i +" tentativa(s)");
            String temp = "";
            Scanner scanner = new Scanner(System.in);
            String letter = scanner.next();
            for(int il=0;il<word.length();il++){
                if(letter.equals(Character.toString(word.charAt(il)))){
                    temp += word.charAt(il);
                    correct++;
                }else{
                    temp += secret.charAt(il);
                }
            }
            secret = temp;
            System.out.println(secret);
            if(correct==word.length()){
                break;
            }
        }
        if(correct==word.length()){
            System.out.println("Acertou!");
        }else{
            System.out.println("Enforcado");
        }
    }

    public static void tabuada() {
        int num, i;
        System.out.println("=======================================");
        System.out.println("Atividade 4 - Tabuada entre 1 a 10 ");
        System.out.println("=======================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = scanner.nextInt();
        for(i=1;i<=10;i++){
            System.out.println(num + " * " + i +" = "+num*i);
        }
        
    }

    public static void printstring() {
        System.out.println("=======================================");
        System.out.println("Atividade 5 - String linha por linha ");
        System.out.println("=======================================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um uma string: ");
        String value = scanner.nextLine();
        for(int i=0; i < value.length();i++){
            System.out.println(value.charAt(i));
        }
    }

    public static void soma() {
        System.out.println("=======================================");
        System.out.println("Atividade 6 - Somatoria de números ímpares, divisivel por 7, entre 1 a 500 ");
        System.out.println("=======================================");
        int soma=0;
        for(int i=1; i<=500; i++){
            if((i%2!=0)&&(i%7==0)){
                soma+=i;
            }
        }
        System.out.println("A soma dos números ímpares, divisivel por 7, entre 1 a 500 é: "+soma);
    }

    public static void notapos() {
        Scanner scanner = new Scanner(System.in);
        double n1,n2,n3,med;
        System.out.println("=======================================");
        System.out.println("Atividade 7 - Calcular média de notas positivas");
        System.out.println("=======================================");
        System.out.println("Digite três notas para calcular a média");
        System.out.print("Digite a 1º nota: ");
        n1 = scanner.nextInt();
        if(n1<0){
            System.exit(0);
        }
        System.out.print("Digite a 2º nota: ");
        n2 = scanner.nextInt();
        if(n2<0){
            System.exit(0);
        }
        System.out.print("Digite a 3º nota: ");
        n3 = scanner.nextInt();
        if(n3<0){
            System.exit(0);
        }
        med = (n1+n2+n3)/3;
        System.out.println("Média: "+med);
        if(med>7){
            System.out.println("Aprovado"); 
        }else{
            System.out.println("Reprovado"); 
        }
    }

    public static void factor() {
        Scanner scanner = new Scanner(System.in);
        int num;
        long factor = 1;
        System.out.println("=======================================");
        System.out.println("Atividade 8 - Fatorial de um número inserido");
        System.out.println("=======================================");
        System.out.print("Digite um número: ");
        num = scanner.nextInt();
        for(int i = 1; i <= num; i++){
            factor *=i;
        }
        System.out.println("O fatorial do número: "+ num + " é: " +factor);
        
    }

    public static void imc() {
        Scanner scanner = new Scanner(System.in);
        double h,w,imc;
        System.out.println("=======================================");
        System.out.println("Atividade 9 - IMC");
        System.out.println("=======================================");
        System.out.println("Calculo de IMC");
        System.out.print("Digite sua altura: ");
        h = scanner.nextDouble();
        System.out.print("Digite seu peso: ");
        w = scanner.nextDouble();
        imc=w/(h*h);
        if(imc<18.5){
            System.out.println("Você está abaixo do peso");
        }else if((imc >= 18.5)&&(imc <=25)){
            System.out.println("Você está no peso normal");
        }else if((imc > 25)&&(imc <= 30)){
            System.out.println("Você está acima do peso");
        }else if(imc > 30){
            System.out.println("Você está obeso");
        }


    }
}