package exe;

public class Ex8 {
    public static void main(String[] args) {
        String nomeTime = "Tabajara F.C. ";
        int vitoria = 12;
        int empate = 6;
        int derrota = 2;
        int partidas = vitoria + empate + derrota;
        int pontos = (vitoria *3) + (empate * 1);
        System.out.println("o time " + nomeTime + "acumulou " + pontos + " pontos apos jogar " + partidas + " partidas");
    }
}
