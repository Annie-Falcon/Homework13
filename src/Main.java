public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(883456,"книга в твердой обложке", 730, "книга");
        Product product2 = new Product(794120,"обложка для паспорта", 480, "аксессуары");
        Product product3 = new Product(883456,"книга, обложка твердая ", 735, "книга");

        System.out.println("Товары:");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        System.out.println("Соответствие первого и второго товара " + product1.equals(product2));
        System.out.println("Соответствие первого и третьего товара " + product1.equals(product3));


        Product product4 = new Product(695130,"ручка", 150, "канцелярия");
        Product product5 = new Product(873354,"карандаш ", 173, "канцелярия");

        Order order1 = new Order("Покупатель 1", new Product[] {product1 , product2 , product4});
        Order order2 = new Order("Покупатель 2", new Product[] {product3 , product2 , product5});
        Order order3 = new Order("Покупатель 1", new Product[] {product3 , product2 , product4});

        System.out.println("Заказы:");
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

        System.out.println("Сравнение первого и второго заказа: " + order1.equals(order2));
        System.out.println("Сравнение первого и третьего заказа: " + order1.equals(order3));
    }
}