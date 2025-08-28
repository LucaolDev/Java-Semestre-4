import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste01 {
    public static void main(String[] args) {


        List<Aluno> lista = new ArrayList<>();
        lista.add(new Aluno(54,"Marcos","ADS"));
        lista.add(new Aluno(55,"Ana","SI"));
        lista.add(new Aluno(53,"Edu","DC"));

        lista.forEach(aluno ->{
            System.out.println(aluno);
        });

        lista.sort(Comparator.comparing(Aluno::getNome).thenComparing(Aluno::getRm));

        System.out.println();
        lista.forEach(aluno ->{
            System.out.println(aluno);
        });

    }
}
