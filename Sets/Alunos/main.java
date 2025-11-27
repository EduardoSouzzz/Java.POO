import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> alunos = new HashSet<>();


        System.out.print("How many students for course A?: ");
        int codeA = sc.nextInt();
        for (int i = 1; i <= codeA; i++) {
            int cA = sc.nextInt();
            alunos.add(cA);

        }

        System.out.print("How many students for course B?: ");
        int codeB = sc.nextInt();
        for (int i = 1; i <= codeB; i++) {
            int cB = sc.nextInt();
            alunos.add(cB);
        }

        System.out.print("How many students for course C?: ");
        int codeC = sc.nextInt();
        for (int i = 1; i <= codeC; i++) {
            int cC = sc.nextInt();
            alunos.add(cC);
        }

        System.out.println("Total Alunos: " + alunos.size());
    }
}
