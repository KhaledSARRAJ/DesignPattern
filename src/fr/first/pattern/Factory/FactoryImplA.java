package fr.first.pattern.Factory;

public class FactoryImplA implements AbstractFactory{

    @Override
    public AbstractPlugin getInstance() {
        return new PluginImpl1();
    }
}
