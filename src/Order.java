import java.util.Arrays;
import java.util.Objects;

public class Order {
    public String customer;
    public Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Корзина покупателя " + this.customer + " " + Arrays.toString(this.basket);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;

        if (!(Objects.equals(customer, order.customer))) {
            return false;
        } else if ( (basket == null) && (order.basket == null) ) {
            return true;
        }else if ( (basket == null) || (order.basket == null) ) {
            return false;
        } else if ( basket.length != order.basket.length) {
            return false;
        } else {
            int i = 0;
            for (final Product current : basket) {
                if (current == null) {
                    return false;
                } else if (current.equals(order.basket[i])) {
                    i++;
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}
