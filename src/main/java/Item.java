public class Item {
    private final double price;
    private final String name;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (!(otherObject instanceof Item item)) {
            return false;
        }

        if (Double.compare(item.price, price) != 0) {
            return false;
        }
        return name.equals(item.name);
    }

    public int compareTo(Item other) {
        if(other == null) {
            return 1;
        }
        int comparision = this.getName().compareTo(other.getName());
        if(comparision !=0){
            return comparision;
        }
        return Double.compare(this.getPrice(), other.getPrice());
    }

}
