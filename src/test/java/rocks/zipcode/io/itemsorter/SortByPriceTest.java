package rocks.zipcode.io.itemsorter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;
import rocks.zipcode.io.comparators.ItemComparator;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class SortByPriceTest {

    @Test
    public void test1() {
        // if
        Item item1 = new Item(1L, "noodles",5.0);
        Item item2 = new Item(1L, "oreos",3.50);
        Item item3 = new Item(1L, "chicken",6.70);
        Item[] itemsInput = {item1, item2, item3};
        Item[] itemsExpected = {item2, item1, item3};
        ItemSorter sorter = new ItemSorter(itemsInput);

        // when
        Item[] itemsReturned = sorter.sort(ItemComparator.PRICE);

        // then
        Assert.assertArrayEquals(itemsExpected, itemsReturned);
    }

    @Test
    public void test2() {
        // if
        Item item1 = new Item(1L, "noodles",6.70);
        Item item2 = new Item(1L, "oreos",3.50);
        Item item3 = new Item(1L, "chicken",5.0);
        Item[] itemsInput = {item1, item2, item3};
        Item[] itemsExpected = {item2, item3, item1};
        ItemSorter sorter = new ItemSorter(itemsInput);

        // when
        Item[] itemsReturned = sorter.sort(ItemComparator.PRICE);

        // then
        Assert.assertArrayEquals(itemsExpected, itemsReturned);
    }

    @Test
    public void test3() {
        // if
        Item item1 = new Item(1L, "noodles",5.0);
        Item item2 = new Item(1L, "oreos",6.70);
        Item item3 = new Item(1L, "chicken",5.0);
        Item[] itemsInput = {item1, item2, item3};
        Item[] itemsExpected = {item1, item3, item2};
        ItemSorter sorter = new ItemSorter(itemsInput);

        // when
        Item[] itemsReturned = sorter.sort(ItemComparator.PRICE);

        // then
        Assert.assertArrayEquals(itemsExpected, itemsReturned);
    }
}
