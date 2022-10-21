package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

class GildedRoseTest {

    @Test
    void foo() {
        String names[] = {"foo",
                "Aged Brie",
                "Backstage passes to a TAFKAL80ETC concert",
                "Sulfuras, Hand of Ragnaros"
        };
        Integer[] qualitites = {-1, 0, 1, 49, 50, 51};
        Integer[] sellIns = IntStream.range(-1, 15)
                                     .boxed()
                                     .toArray(Integer[]::new);

        CombinationApprovals.verifyAllCombinations(this::doStuff, names, qualitites, sellIns);
    }

    public String doStuff(String itemName, int quality, int sellIns) {
        Item[] items = {new Item(itemName, sellIns, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app.items[0].toString();
    }

}
