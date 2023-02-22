package fr.first.pattern.prototype;

import java.time.Instant;

public class Personne implements Cloneable {
    private Long id;
    private String prenom;
    private String nom;
    private int age;
    private float numeroSecurite;
    private Instant dateDeNaissance;

    public Personne() {
    }

    public Personne(Long id, String prenom, String nom, int age, float numeroSecurite, Instant dateDeNaissance) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.numeroSecurite = numeroSecurite;
        this.dateDeNaissance = dateDeNaissance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getNumeroSecurite() {
        return numeroSecurite;
    }

    public void setNumeroSecurite(float numeroSecurite) {
        this.numeroSecurite = numeroSecurite;
    }

    public Instant getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Instant dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                ", numeroSecurite=" + numeroSecurite +
                ", dateDeNaissance=" + dateDeNaissance +
                '}';
    }

    @Override
    public Personne clone() throws CloneNotSupportedException {
        return (Personne) super.clone();
    }
}
