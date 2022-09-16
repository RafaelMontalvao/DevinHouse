package exe;
import java.time.LocalDate;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print(" Digite o ano que voce nasceu: ");
        int anoNascimento = scanner.nextInt();
        LocalDate hoje = LocalDate.now();
        int anoAtual = hoje.getYear();
        int idade = anoAtual - anoNascimento;
        System.out.println("Sua Idade é de:  " + idade);
    }
}
