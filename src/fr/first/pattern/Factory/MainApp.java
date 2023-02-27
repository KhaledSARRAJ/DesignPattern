package fr.first.pattern.Factory;

public class MainApp {
    public static void main(String[] args) throws Exception {
        //Client instanciation statique
        AbstractFactory factoryImplA = new FactoryImplA();
        AbstractPlugin plugin = factoryImplA.getInstance();
        plugin.traitement();
        //Client instanciation statique
        AbstractFactory factoryImplb = new FactoryImplB();
        AbstractPlugin pluginb = factoryImplb.getInstance();
        pluginb.traitement();


        //instantiation dynamique
        AbstractFactory  factory = (AbstractFactory)Class.forName("fr.first.pattern.Factory.FactoryImplA").newInstance();

        AbstractPlugin plugin3 = factory.getInstance();
        plugin3.traitement();

        AbstractFactory  factory2 = (AbstractFactory)Class.forName("fr.first.pattern.Factory.FactoryImplB").newInstance();

        AbstractPlugin plugin4 = factory2.getInstance();
        plugin4.traitement();
    }
}
