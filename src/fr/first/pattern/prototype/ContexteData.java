package fr.first.pattern.prototype;

import java.time.Instant;

public class ContexteData {


    public void process() throws CloneNotSupportedException {
        Personne personne  = new Personne(1l,"TOUTOU","TITI",12,123647,Instant.parse("2016-08-16T02:06:58.147Z") );
        System.out.println("L'adresse de la personne est : " +personne);
        Personne personne1= personne.clone();
        personne1.setAge(59);
        personne1.setNumeroSecurite(9999);
        System.out.println("L'adresse de la personne cloner est : " +personne1);

    }


}
