package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    private static void doStuff(Item item) {
        if (item.name.equals("Aged Brie")) {
            updateQualityForBrie(item);
            return;
        }

        if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            updateQualityForBackstagePass(item);
            return;
        }

        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        }

        updateDefaultItem(item, 1);
        return;

    }

    private static void updateDefaultItem(Item item, int degradeRate) {
        if (item.quality > 0) {
            item.quality = item.quality - degradeRate;
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            if (item.quality > 0) {
                item.quality = item.quality - degradeRate;
            }
        }
    }

    private static void updateQualityForBackstagePass(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;

            if (item.sellIn < 11) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }

            if (item.sellIn < 6) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

    private static void updateQualityForBrie(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;

        }

        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
    }

    public void updateQuality() {
        for (Item item : items) {
            doStuff(item);
        }
    }
}