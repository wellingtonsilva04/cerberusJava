/* Na presente versão foi assumido que cada lab disponibiliza apenas uma chave para emprétimo
 */
package cerberusjava;

import java.util.ArrayList;

/**
 *
 * @author wellington
 */
public class Sala {

    private String denomincao;
    private ArrayList<Professor> professores = new ArrayList();
    private ArrayList<Aluno> alunos = new ArrayList();
    private int qtChaves;

    public Sala() {
    }

    public Sala(String denomincao, int qtChaves) {
        this.denomincao = denomincao;
        this.qtChaves = qtChaves;
    }

    public String getDenomincao() {
        return denomincao;
    }

    public void setDenomincao(String denomincao) {
        this.denomincao = denomincao;
    }

    public ArrayList getProfessorlista() {
        return professores;
    }

    public void setProfessorlista(ArrayList professorlista) {
        this.professores = professorlista;
    }

    public ArrayList getAlunolista() {
        return alunos;
    }

    public void setAlunolista(ArrayList alunolista) {
        this.alunos = alunolista;
    }

    public int getQtChaves() {
        return qtChaves;
    }

    public void setQtChaves(int qtChaves) {
        this.qtChaves = qtChaves;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);

    }

    public void adicionarProfessor(Professor prof) {
        professores.add(prof);
    }

    public void imprimir_dados() {
        if (this.getProfessorlista() == null || this.getProfessorlista().isEmpty() ) {
            System.out.println(this.denomincao + ":");
            System.out.println("Nenhum professor associado");
        } else {
            System.out.println("Sala: " + this.denomincao);
            System.out.println("Professores Responsaveis:");
            for (Professor prof : professores) {
                System.out.println(prof.getNome());
            }
        }
        
        if (this.professores == null || this.alunos.isEmpty()) {
            System.out.println("Nenhum aluno associado a sala");
        } else {
            System.out.println("Alunos associados a Sala:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
            System.out.println("Numero de chaves :" + this.qtChaves);
        }
    }

}
