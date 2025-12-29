import java.util.Objects;

public class Product {
    public int id;
    public String name;
    public int price;
    public String category;

    public Product(int id, String name, int price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "[артикул= " + this.id + ", название= " + this.name
                + ", цена= " + this.price + ", категория= " + this.category + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return id == product.id && Objects.equals(category, product.category);
    }

}
