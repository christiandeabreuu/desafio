import java.util.Scanner;

public class DesafioJava01 {
    public static void main(String[] args) {
        simCity();
    } 
    public static void simCity(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite sua profissão: ");
        String profissao = leitor.nextLine();

        System.out.println("Digite seu 1º salário: ");
        int sala1 = leitor.nextInt();
    
            if(sala1 <= 2000.00){
            System.out.println("isento");
             }else if(sala1 <= 3000.00 ){
            sala1 = (sala1 / 100) *8;
            System.out.println(sala1+" reais");
            //System.out.println("8% de contribuição");
            }else if(sala1 <= 4500.00 ){
            sala1 = (sala1 / 100) *18;
            System.out.println(sala1+" reais");
            //System.out.println("18% de contribuição");
            }else if(sala1 >= 4500.00 ){
            sala1 = (sala1 / 100) *28;
            System.out.println(sala1+"reais");
            //System.out.println("28% de contribuição");
            }
           
        System.out.println("Digite seu 2º salário: ");
        String sala2 = leitor.nextLine();

        System.out.println("Digite seu 3º salário: ");
        String sala3 = leitor.nextLine();

        System.out.println("Digite seu 4º salário: ");
        String sala4 = leitor.nextLine();

         System.out.println("Digite seu 5º salário: ");
         String sala5 = leitor.nextLine();

        System.out.println("Digite seu 6º salário: ");
        String sala6 = leitor.nextLine();

         System.out.println("Digite seu 7º salário: ");
         String sala7 = leitor.nextLine();

        System.out.println("Digite seu 8º salário: ");
         String sala8 = leitor.nextLine();

         System.out.println("Digite seu 9º salário: ");
        String sala9 = leitor.nextLine();

        System.out.println("Digite seu 10º salário: ");
         String sala10 = leitor.nextLine();

         System.out.println("Digite seu 11º salário: ");
         String sala11 = leitor.nextLine();

        System.out.println("Digite seu 12º salário: ");
        String sala12 = leitor.nextLine();



 }
}
    

