package fr.first.pattern.observer;

public class ObserverImplStrategy1 implements Observer {
    @Override
    public void update(Observable observable) {
        System.out.println("Bienvenu dans la strategy 1");
        String res = ((ObservableImpl)(observable)).getCompteur()%2==0? "La v�rification de la start�gie 1 montre que le montant est: PAIR":"La v�rification de la start�gie 1 montre que le montant est: IMPAIR";
        System.out.println(res);
        System.out.println("Fin de v�rification dans la strategy 1");

    }
}
