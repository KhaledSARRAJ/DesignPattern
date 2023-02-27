package fr.first.pattern.Decorator;

public class AppBoisson {
    public static void main(String[] args) {
        Boisson boisson = new Expresso();

        boisson = new Lait(boisson);
        boisson= new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        Boisson boisson1 = new Sumatra();
        boisson1= new Chocolat(boisson1);
        System.out.println(boisson1.getDescription());
        System.out.println(boisson1.cout());
    }
}
