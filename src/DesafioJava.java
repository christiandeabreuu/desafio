import java.util.Scanner;

public class DesafioJava {
    public static void main(String[] args) {
            simCity();
    } 
    public static void simCity(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite sua profissão: ");
        String profissao = leitor.nextLine();

        float[] salario = new float[12];

        float[] imposto = new float[salario.length];

        for(int i = 0; i < salario.length; i++) {
            System.out.println("Digite um valor do salario do mês "+ (i+1));
            salario[i] = leitor.nextFloat();

            if(salario[i] <= 2000.00){
            imposto[i] = 0;
            System.out.println("isento");

            }else if(salario[i] <= 3000.00 ){
            imposto[i] = (salario[i] / 100) *8;
            System.out.println(imposto[i]+" reais");
            //System.out.println("8% de contribuição");
            }else if(salario[i] <= 4500.00 ){
            imposto[i] = (salario[i] / 100) *18;
            System.out.println(imposto[i]+" reais");
            //System.out.println("18% de contribuição");
            }else if(salario[i] >= 4500.00 ){
            imposto[i] = (salario[i] / 100) *28;
            System.out.println("imposto pago: "+imposto[i]+" reais");
            //System.out.println("28% de contribuição");
            }
        }
    }
}
 
