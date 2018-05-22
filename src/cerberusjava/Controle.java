/*Versão 0.1

 */
package cerberusjava;

import java.util.ArrayList;

/**
 *
 * @author wellington
 */
public class Controle {
    private ArrayList<Professor> professores = new ArrayList();
    private ArrayList<Aluno> alunos = new ArrayList();
    private ArrayList<Sala> salas = new ArrayList<>();

    public Controle() {
    }
   
    
    void adicionarAluno(Aluno al){
        this.alunos.add(al);
    }
    void adicionarProfessor(Professor prof){
        this.professores.add(prof);
    }
    void adicionarSala(Sala  sala){
        this.salas.add(sala);
    }
    
    
}
