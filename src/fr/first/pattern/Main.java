package fr.first.pattern;

import fr.first.pattern.observer.*;
import fr.first.pattern.prototype.ContexteData;
import fr.first.pattern.strategy.ContexteApp;
import fr.first.pattern.strategy.EnregistrerImplDoc;
import fr.first.pattern.strategy.EnregistrerImplDocx;
import fr.first.pattern.strategy.EnregistrerImplPdf;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        //Partie Strategy
        ContexteApp contexteApp = new ContexteApp();
        contexteApp.setiEregistrer(new EnregistrerImplPdf());
        contexteApp.process();
        contexteApp.setiEregistrer(new EnregistrerImplDoc());
        contexteApp.process();
        contexteApp.setiEregistrer(new EnregistrerImplDocx());
        contexteApp.process();

        //Partie Prototype
        ContexteData contexteData = new ContexteData();
        contexteData.process();

        //Partie Observable
        ObservableImpl o = new ObservableImpl();
        Observer observer = new ObserverImplStrategy1();
        Observer observer1 = new ObserverImplStrategy2();
        o.subscribe(observer);
        o.subscribe(observer1);
        o.setCompteur(1000);
        o.setCompteur(2001);
        o.setCompteur(3003);
    }
}
