/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerberusjava;

/**
 *
 * @author wellington
 */
public class Aluno {
    private String nome;
    private String curso;
    private String matricula;
    private String telefone; 
    private String email;

    public Aluno(String nome, String curso, String matricula, String telefone, String email) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    @Override
    public String toString() {
        return "nome= " + nome + "\ncurso= " + curso + "\nmatricula= " + matricula + "\ntelefone= " + telefone + "\nemail= " + email;
    }
}