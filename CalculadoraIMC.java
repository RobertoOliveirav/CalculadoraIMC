package projetos;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraIMC 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in).useLocale(java.util.Locale.US);

        double peso;
        double altura;
        
    while (true) 
    {

        System.out.println("Insira seu peso em KG: ");
        peso = scanner.nextDouble();

        System.out.println("Agora insira a sua altura em METROS: ");
        altura = scanner.nextDouble();

        double classificacao = peso / (altura * altura);
        String transfClassificacao = String.format("%.2f", classificacao);

            if (altura <= 0 || peso <= 0)
            {
                System.out.println("Insira altura e peso maior que ZERO.");
            } 

            else if (classificacao < 18.5)
            {
                System.out.println("Resultado da classificação: " +  transfClassificacao + ". ");
                System.out.println("Você Está abaixo do peso.");
                break;
            }

            else if (classificacao >= 18.5 && classificacao <= 24.9) 
            {
                System.out.println("Resultado da classificação: " + transfClassificacao + ". ");
                System.out.println("Você está no peso ideal.");
                break;   
            }

            else if (classificacao >= 25 && classificacao < 29.9)
            {
                System.out.println("Resultado da classificação: " + transfClassificacao + ". ");
                System.out.println("Você está acima do peso.");
                break;
            }

            else if (classificacao >= 30)
            {
                System.out.println("Resultado da classificação: " + transfClassificacao + ". ");
                System.out.println("Você está em estado de obesidade.");
                break;
            }   

            else
            {
                System.out.println("Resposta não identificada. Tente novamente");
            }

        }

        scanner.close();
    }
}
