package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

public class ItemComparator {

    public static final Comparator<Item> ID = new IdComparator();
    public static final Comparator<Item> NAME = new NameComparator();

    public static final Comparator<Item> PRICE = new PriceComparator();

    static class IdComparator implements Comparator<Item> {
        public int compare(Item o1, Item o2) {
            return (int) (o1.getId() - o2.getId());
        }
    }

    static class NameComparator implements Comparator<Item> {

        public int compare(Item o1, Item o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    static class PriceComparator implements Comparator<Item> {

        public int compare(Item o1, Item o2) {
            if (o1.getPrice() - o2.getPrice() > 0) {
                return 1;
            } else if (o1.getPrice() - o2.getPrice() < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }

}
