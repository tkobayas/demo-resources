package org.example;

public class Order {

    private Person consumer;

    private String itemName;

    private int itemPrice;

    public Order() {
    }

    public Order(Person consumer, String itemName, int itemPrice) {
        this.consumer = consumer;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public Person getConsumer() {
        return consumer;
    }

    public void setConsumer(Person consumer) {
        this.consumer = consumer;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "[" + itemName + "(" + itemPrice + "円)]";
    }
}
