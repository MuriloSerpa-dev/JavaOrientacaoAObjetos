import java.util.ArrayList;
import java.util.List;

public class TestaRetiraElementos {
    public static void main(String[] args) {
        List<Funcionario> nomes = new ArrayList<>();
        nomes.add(new Funcionario("Raimundo"));

      Funcionario f = RetiraElementos.recuperaPrimeiro(nomes);
        System.out.println(f.getNome());
    }
}
