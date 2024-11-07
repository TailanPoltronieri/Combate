import java.util.Scanner;
    public class CombatGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String name01 = scan.nextLine();
        System.out.print("Vida inicial: ");
        int health01 = scan.nextInt();
        System.out.print("Ataque: ");
        int attack01 = scan.nextInt();
        System.out.print("Armadura: ");
        int armor01 = scan.nextInt();
        Champion champ01 = new Champion(name01, health01, attack01, armor01);


        scan.nextLine(); 
        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome: ");
        String name02 = scan.nextLine();
        System.out.print("Vida inicial: ");
        int health02 = scan.nextInt();
        System.out.print("Ataque: ");
        int attack02 = scan.nextInt();
        System.out.print("Armadura: ");
        int armor02 = scan.nextInt();
        Champion champ02 = new Champion(name02, health02, attack02, armor02);

 
        System.out.print("Quantos turnos você deseja executar? ");
        int turns = scan.nextInt();


        for (int i = 1; i <= turns; i++) {
            System.out.println("Resultado do turno " + i + ":");
            champ01.takeDamage(champ02);
            champ02.takeDamage(champ01);
            System.out.println(champ01.status());
            System.out.println(champ02.status());

            if (!champ01.isAlive() || !champ02.isAlive()) {
                break;
            }
        }

        System.out.println("### FIM DO COMBATE ###");
        scan.close();
    }
}

