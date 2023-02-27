package fr.first.pattern.builder;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Bonjour dans le design pattern Builder");
        Pizza pizza1 = new Pizza.Builder(12)
                .cheese(true)
                .pepperoni(true)
                .bacon(true)
                .build();
        Pizza pizza2 = new Pizza.Builder(20)
                .cheese(false)
                .pepperoni(false)
                .build();
        System.out.println("Le pizza"+pizza1);
        System.out.println("Le pizza"+pizza2);
    }
}
