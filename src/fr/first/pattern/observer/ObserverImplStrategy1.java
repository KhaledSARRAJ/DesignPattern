package fr.first.pattern.observer;

public class ObserverImplStrategy1 implements Observer {
    @Override
    public void update(Observable observable) {
        System.out.println("Bienvenu dans la strategy 1");
        String res = ((ObservableImpl)(observable)).getCompteur()%2==0? "La vérification de la startégie 1 montre que le montant est: PAIR":"La vérification de la startégie 1 montre que le montant est: IMPAIR";
        System.out.println(res);
        System.out.println("Fin de vérification dans la strategy 1");

    }
}
