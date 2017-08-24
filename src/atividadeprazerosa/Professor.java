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
public class Professor {
    private String nome;
    private int idade;
    private Endereco endereco;

    public Professor(String nome, int idade, Endereco endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public double calcularMedia(double nota1, double nota2, double nota3){
        return (nota1+nota2+nota3) / 3;
    }
}
