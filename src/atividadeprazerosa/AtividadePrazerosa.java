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
public class AtividadePrazerosa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Endereco endereco1 = new Endereco("Gastão Vidigal", "215", "São José", "Capivari", "SP", "13360-000");
        ProfessorEnsinoMedio profEnsino = new ProfessorEnsinoMedio("Gabriel Borges", 19, endereco1);
        
        Endereco endereco2 = new Endereco("Francisco Fornazieri", "44", "Morada do Sol", "Capivari", "SP", "13360-000");
        ProfessorGraduacao profGrad = new ProfessorGraduacao("Eduarda Oliveira", 19, endereco1);
        
        Endereco endereco3 = new Endereco("Barão do Rio Branco", "205", "Av. PIO XII", "Capivari", "SP", "13360-000");
        Professor prof = new ProfessorGraduacao("Eduarda Oliveira", 19, endereco1);
        
        System.out.println("Profº: " +prof.calcularMedia(9, 7, 8)); 
        System.out.println("Profº Ensino Médio: " + profEnsino.calcularMedia(9, 7, 8));
        System.out.println("Profº Gradução (3 notas): " + profGrad.calcularMedia(9, 7, 8));
        System.out.println("Profº Gradução (4 notas): " +profGrad.calcularMedia(9, 7, 8, 10));       
    }    
}
