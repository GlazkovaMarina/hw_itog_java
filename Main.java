
public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy("Car", 2);
        Toy toy2 = new Toy("Doll", 2);
        Toy toy3 = new Toy("Dog", 6);
        Shop shop = new Shop();
        shop.Put(toy1);
        shop.Put(toy2);
        shop.Put(toy3);
        shop.Get();
        shop.Get();
        shop.Get();
        shop.Get();
        shop.Get();
        shop.Get();
        shop.Get();
        shop.Get();
        shop.Get();
        shop.Get();
        shop.Get();
        shop.Get();
        shop.Get();
        shop.Get();
        Toy toy4 = new Toy("Cat", 5);
        shop.Put(toy4);
        shop.Get();
        shop.Get();
        shop.Get();

    }
}
