public class ImpostoRenda {
    public static void main(String[] args) {
        double n = 4664.68;
        double liquido;
        System.out.println("11- Calculo de Imposto de Renda (IRRF): ");
        System.out.println("\n\n");
        System.out.println("Tabela IRRF (Imposto de Renda Retido na Fonte): ");
        System.out.println("Até R$1903,98 -> Isento");
        System.out.println("De R$1903,99 a R$2826,65 -> 7,5%");
        System.out.println("De R$2826,66 a R$3751,05 -> 15%");
        System.out.println("De R$3751,06 a R$4664,68 -> 22,5%");
        System.out.println("Acima de R$4664,68 -> 27,5%");
        System.out.println("Salario: R$" +n);
        System.out.println("Aliquota: 22,5%");
        liquido = (n * 0.225);
        System.out.println("Salario líquido: R$" +liquido);
    }  
  }
  