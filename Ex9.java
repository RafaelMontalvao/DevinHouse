package exe;

import java.util.Scanner;
import java.util.stream.Stream;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Qual seu Herói favorito? ");
        String resposta = scanner.nextLine();
        System.out.println("Seu Herói favorito é o(a): " + resposta);

    }
}
