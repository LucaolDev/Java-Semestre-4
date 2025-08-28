import java.util.HashSet;
import java.util.Set;

public class Teste02 {
    public static void main(String[] args) {
        Set<Aluno> lista = new HashSet<>();

        lista.add(new Aluno(54,"Marcos","ADS"));
        lista.add(new Aluno(55,"Ana","SI"));
        lista.add(new Aluno(53,"Edu","DC"));
        lista.add(new Aluno(51,"Luis","SI"));
        lista.add(new Aluno(50,"Ana","Engenharia"));

        lista.forEach(aluno -> System.out.println(aluno));
    }
}
