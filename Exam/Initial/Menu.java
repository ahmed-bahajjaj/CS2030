//import java.util.PriorityQueue;
import java.util.ArrayList;

public class Menu {
    //private static PriorityQueue<Food> menu = new PriorityQueue<Food>(new MenuComparator());
    private static ArrayList<Food> menu = new ArrayList<Food>();
    private static ArrayList<Burger> burgers = new ArrayList<Burger>();
    private static ArrayList<Drink> drinks = new ArrayList<Drink>();
    private static ArrayList<Snack> snacks = new ArrayList<Snack>();
    private static ArrayList<Food> menu2 = new ArrayList<Food>();
    private static ArrayList<Combo> combos = new ArrayList<Combo>();

    public Menu() {}

    public static void addFood(String cat, String desc, int price) {
        if (cat.equals("Burger")) {
            burgers.add(new Burger(cat, desc, price));
        } else if (cat.equals("Snack")) {
            snacks.add(new Snack(cat, desc, price));
        } else if (cat.equals("Drink")) {
            drinks.add(new Drink(cat, desc, price));
        } else { }
    }

    public static void addCombo(int c1, int c2, int c3) {
        menu2.clear();

        for (int i = 0; i < burgers.size(); i++) {
            if (burgers.get(i).getId() == c1) {
                menu2.add(burgers.get(i));
            }
        }
        for (int i = 0; i < snacks.size(); i++) {
            if (snacks.get(i).getId() == c2) {
                menu2.add(snacks.get(i));
            }
        }
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).getId() == c3) {
                menu2.add(drinks.get(i));
            }
        }

        if (menu2.size() == 3){
            combos.add(new Combo(menu2));
        } else {
            System.out.println("Error: Invalid combo input " + c1 + " " + c2 + " " + c3);
        }
    }

    public static void execute() {
        /*for (int i = 0; i < burgers.size(); i++) {
            Food f = burgers.get(i);
            System.out.println("#" + f.getId() + " " + f.getCat() + ": " + f.getName() + " (" + f.getPrice() + ")");
        }
        for (int i = 0; i < snacks.size(); i++) {
            Food f = snacks.get(i);
            System.out.println("#" + f.getId() + " " + f.getCat() + ": " + f.getName() + " (" + f.getPrice() + ")");
        }
        for (int i = 0; i < drinks.size(); i++) {
            Food f = drinks.get(i);
            System.out.println("#" + f.getId() + " " + f.getCat() + ": " + f.getName() + " (" + f.getPrice() + ")");
        }*/
        menu2.clear();
        menu2.addAll(burgers);
        menu2.addAll(snacks);
        menu2.addAll(drinks);
        menu2.addAll(combos);
        for (int i = 0; i < menu2.size(); i++) {
            System.out.println(menu2.get(i));
        }
    }

    public static void addOrder(int num) {
        //orders.add(num);
        menu2.clear();
        menu2.addAll(burgers);
        menu2.addAll(snacks);
        menu2.addAll(drinks);
        menu2.addAll(combos);
        for (int i = 0; i < menu2.size(); i++) {
            if (num == menu2.get(i).getId()) {
                menu.add(menu2.get(i));
                break;
            }
        }
        /*
        for (int i = 0; i < menu2.size(); i++) {
            System.out.println(menu2.get(i));
        }

        for (int i = 0; i < burgers.size(); i++) {
            if (num == burgers.get(i).getId()) {
                menu.add(burgers.get(i));
                break;
            }
        }
        for (int i = 0; i < snacks.size(); i++) {
            if (num == snacks.get(i).getId()) {
                menu.add(snacks.get(i));
                break;
            }        
        }
        for (int i = 0; i < drinks.size(); i++) {
            if (num == drinks.get(i).getId()) {
                menu.add(drinks.get(i));
                break;
            }
        }*/
    }

    public static void order() {
        System.out.println("--- Order ---");
        int total = 0;
        for (int i = 0; i < menu.size(); i++) {
            Food f = menu.get(i);
            total += f.getPrice();
            System.out.println(f); 
            /*System.out.println("#" + f.getId() + " " + f.getCat() + 
            ": " + f.getName() + " (" + f.getPrice() + ")");*/
        }
        /*for (int i = 0; i < combos.size(); i++) {
            Combo c = combos.get(i);
            total += c.getPrice();
            c.print();
            System.out.println(c);

            System.out.println("   #" + c.get1().getId() + " " + c.get1().getCat() + 
            ": " + c.get1().getName() + " (" + c.get1().getPrice() + ")");

            System.out.println("   #" + c.get2().getId() + " " + c.get2().getCat() + 
            ": " + c.get2().getName() + " (" + c.get2().getPrice() + ")");

            System.out.println("   #" + c.get3().getId() + " " + c.get3().getCat() + 
            ": " + c.get3().getName() + " (" + c.get3().getPrice() + ")");
        }*/

        System.out.println("Total: " + total);
    }
}
