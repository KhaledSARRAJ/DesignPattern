package fr.first.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    List<Observer> observerList = new ArrayList<>();
    private double compteur;
    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observerList) {
            o.update(this);
        }
    }

    public void setCompteur(double compteur) {
        this.compteur = compteur;
        this.notifyObserver();
    }

    public double getCompteur() {
        return compteur;
    }
}
