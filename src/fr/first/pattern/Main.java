package fr.first.pattern;

import fr.first.pattern.strategy.ContexteApp;
import fr.first.pattern.strategy.EnregistrerImplDoc;
import fr.first.pattern.strategy.EnregistrerImplDocx;
import fr.first.pattern.strategy.EnregistrerImplPdf;

public class Main {

    public static void main(String[] args) {
        //Partie Strategy
        ContexteApp contexteApp = new ContexteApp();
        contexteApp.setiEregistrer(new EnregistrerImplPdf());
        contexteApp.process();
        contexteApp.setiEregistrer(new EnregistrerImplDoc());
        contexteApp.process();
        contexteApp.setiEregistrer(new EnregistrerImplDocx());
        contexteApp.process();

    }
}
