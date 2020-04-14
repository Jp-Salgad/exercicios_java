import java.util.Scanner;

public class trab2 {

        private static Scanner leitor;

		public static void main(String[] args) {

           String nome, cidade;
           int idade;
           
           
           leitor = new Scanner (System.in);
           System.out.println("Digite o seu nome: ");
           nome = leitor.next();
           System.out.println("Bem vindo," +nome);
           
           System.out.println("Digite a sua idade: ");
           idade = leitor.nextInt();
           
           System.out.println("Digite a cidade ao qual você reside: ");
           cidade = leitor.next();
           
           System.out.println("Nome: " +nome);
           System.out.println("Idade: " +idade);
           System.out.println("Cidade: " +cidade);
		}
           }
           