package fr.first.pattern.observer;

public class ObserverImplStrategy2 implements Observer {
    double res;
    @Override
    public void update(Observable observable) {
        System.out.println("Bienvenu dans la strategy 2");
        if(((ObservableImpl)(observable)).getCompteur() > Math.random()){
            res = ((ObservableImpl)(observable)).getCompteur()*2;
        }else{
            res = ((ObservableImpl)(observable)).getCompteur()/2;
        }
        System.out.println("La mise à jour dans la strategy 2, rend le salaire égal à : "+res );

        System.out.println("Fin de vérification dans la strategy 2");

    }
}
