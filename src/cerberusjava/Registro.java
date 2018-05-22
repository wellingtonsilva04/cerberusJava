/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerberusjava;

import java.util.Date;

/**
 *
 * @author wellington
 */
public class Registro {
    //Esta classe gerencia o ato de pegar emprestado a chave de algum laboratorio
    
    private Date data;
    private boolean ChaveEmprestada; // true para emprestada
    private Aluno aluno; // Quem tá emrestando
    private Sala sala; //Sala sendo emprestada
    
}
