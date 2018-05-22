/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerberusjava;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author wellington
 */
public class CerberusJava {

    Controle control;

    public CerberusJava() {
        this.control = new Controle();
    }

    public void iniciarApp() {
        int op = -1;
        Scanner entrada = new Scanner(System.in);
        while (op != 0) {
            System.out.println("**** Cerberus ****");
            System.out.println("0- sair");
            System.out.println("1- Professor");
            System.out.println("2- Aluno");
            System.out.println("3- Sala");
            System.out.println("4- Emprestar Chave");            

            System.out.print(">: ");
            op = entrada.nextInt();
            switch (op) {
                case 0:
                    System.out.println("bye!!");
                    break;
                case 1:
                    menuProfessor();
                    break;
                case 2:
                    menuAluno();
                    break;

                case 3:
                    menuSala();
                    break;
                case 4:
                    emprestarChave();
                    break;

                default:
                    System.out.println("Valor inválido");
            }

        }

    }

    public void menuProfessor() {
        int op = -1;
        Scanner entrada = new Scanner(System.in);
        while (op
                != 0) {
            System.out.println("0- Voltar para o menu principal");
            System.out.println("1- Cadastrar Professor");
            System.out.println("2- Listar professores");
            System.out.println("3- Editar Professor");
            System.out.println("4- Remover Professor");

            System.out.print(">: ");
            op = entrada.nextInt();
            switch (op) {
                case 0:
                    System.out.println("bye!!");
                    break;
                case 1:
                    cadastrarProfessor();
                    break;
                case 2:
                    listarProfessores();
                    break;

                case 3:
                    editarProfessor();
                    break;
                case 4:
                    removerProfessor();
                    break;

                default:
                    System.out.println("Valor inválido");
            }

        }
    }

    // Métodos do menuProfessor
    public void cadastrarProfessor() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = entrada.next();
        System.out.println("Telefone: ");
        String telefone = entrada.next();
        System.out.println("Email: ");
        String email = entrada.next();
        this.control.adicionarProfessor(new Professor(nome, telefone, email));

    }

    public void listarProfessores() {
        System.out.println("Ainda não implementado");

    }

    public void editarProfessor() {
        System.out.println("Ainda não implementado");

    }

    public void removerProfessor() {
        System.out.println("Ainda não implementado");
    }

    public void menuAluno() {
        int op = -1;
        Scanner entrada = new Scanner(System.in);
        while (op != 0) {
            System.out.println("0- Voltar para o menu principal");
            System.out.println("1- Cadastrar Aluno");
            System.out.println("2- Listar Alunos");
            System.out.println("3- Editar Aluno");
            System.out.println("4- Remover Alunor");

            System.out.print(">: ");
            op = entrada.nextInt();
            switch (op) {
                case 0:
                    System.out.println("bye!!");
                    break;
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;

                case 3:
                    editarAluno();
                    break;
                case 4:
                    removerAluno();
                    break;

                default:
                    System.out.println("Valor inválido");
            }

        }
    }

    //Métodos do menuAluno
    public void cadastrarAluno() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = entrada.next();
        System.out.println("Curso: ");
        String curso = entrada.next();
        System.out.println("Matrícula: ");
        String matricula = entrada.next();
        System.out.println("Telefone: ");
        String telefone = entrada.next();
        System.out.println("Email: ");
        String email = entrada.next();
        this.control.adicionarAluno(new Aluno(nome, curso, matricula, telefone, email));

    }
    
    public void listarAlunos(){
        System.out.println("Ainda não implementado");
        
    }

    public void editarAluno() {
        System.out.println("Ainda não implementado");

    }

    public void removerAluno() {
        System.out.println("Ainda não implementado");

    }

    public void menuSala(){
        int op = -1;
        Scanner entrada = new Scanner(System.in);
        while (op != 0) {
            System.out.println("0- Voltar para o menu principal");
            System.out.println("1- Cadastrar Sala");
            System.out.println("2- Listar Salas");
            System.out.println("3- Editar Sala");
            System.out.println("4- Remover Sala");

            System.out.print(">: ");
            op = entrada.nextInt();
            switch (op) {
                case 0:
                    System.out.println("bye!!");
                    break;
                case 1:
                    cadastrarSala();
                    break;
                case 2:
                    listarSalas();
                    break;

                case 3:
                    editarSala();
                    break;
                case 4:
                    removerSala();
                    break;

                default:
                    System.out.println("Valor inválido");
            }

        }
    }
    //Métodos do menuSala
    public void cadastrarSala() {
        System.out.println("Ainda não implementado");

    }
    
    public void listarSalas(){
        System.out.println("Ainda não implementado");
        
    }
    
    public void editarSala(){
        System.out.println("Ainda não implementado");
        
    }

    public void removerSala(){
        System.out.println("Ainda não implementado");
        
    }
    public void emprestarChave() {
        System.out.println("Ainda não implementado");

    }

    
    
}
