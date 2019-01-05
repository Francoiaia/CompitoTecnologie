/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provalista;

/**
 *
 * @author thelo
 */
public class Studente {
    String nome;
    String cognome;
    String classe;
    String email;

    public Studente(String nome, String cognome, String classe, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.classe = classe;
        this.email = email;
    }
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Studente{" + "nome=" + nome + ", cognome=" + cognome + ", classe=" + classe + ", email=" + email + '}';
    }
    
    
}
