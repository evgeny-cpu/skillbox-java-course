public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40,2,2000);
        basket.add("хлеб", 30,2,500);


        Basket basket1 = new Basket();
        basket1.add("phone", 300,2,120);
        basket1.add("laptop", 600,2,1300);


        Basket basket2 = new Basket();
        basket2.add("phone", 670,2,300);
        basket2.add("laptop", 1670,2,1600);


        System.out.println("Средняя стоимость корзины: " + Basket.averageBasketCost());
        System.out.println("Средняя стоимость товара: " + Basket.averagePrice());
        System.out.println("Количество корзин: " + Basket.getCount());


    }
}
