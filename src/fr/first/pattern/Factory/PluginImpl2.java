package fr.first.pattern.Factory;

public class PluginImpl2 implements AbstractPlugin{
    @Override
    public void traitement() {
        System.out.println("Traitement de plugin B");
    }
}
