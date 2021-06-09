import java.util.*;

public class Menu extends MenuComponent {
    List<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) { this.menuComponents.add(menuComponent); }

    public void remove(MenuComponent menuComponent) { this.menuComponents.remove(menuComponent); }

    public MenuComponent getChild(int i) { return this.menuComponents.get(i); }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public void print() {
        System.out.println("\n" + getName());
        System.out.println(getDescription());
        System.out.println("--------------------");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
