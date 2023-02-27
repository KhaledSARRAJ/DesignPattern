package fr.first.pattern.Factory;

public class FactoryImplB implements AbstractFactory{

    @Override
    public AbstractPlugin getInstance() {
        return new PluginImpl2();
    }
}
