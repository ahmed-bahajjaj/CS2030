public class Snack extends Food {
    private String cat;
    private String name;
    private int price;
    private int id;
    //private static int count = 0;

    public Snack(String cat, String name, int price) {
        this.cat = cat;
        this.name = name;
        this.price = price;
        id = super.count;
        super.count++;
    }

    public String getName() {
        return this.name;
    }

    public String getCat() {
        return cat;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
