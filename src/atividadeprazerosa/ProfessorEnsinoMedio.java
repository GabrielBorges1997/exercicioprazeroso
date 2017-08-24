/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeprazerosa;

/**
 *
 * @author Eduarda Oliveira
 */
public class ProfessorEnsinoMedio extends Professor {    

    public ProfessorEnsinoMedio(String nome, int idade, Endereco endereco) {
        super(nome, idade, endereco);
    }
    
    @Override
    public double calcularMedia(double nota1, double nota2, double nota3){
        return ((nota1 * 0.3) + (nota2 * 0.3) + (nota3 * 0.4));
    }    
}
