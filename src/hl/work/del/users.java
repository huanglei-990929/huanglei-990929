package hl.work.del;

import com.sun.org.apache.xpath.internal.objects.XString;

public class users{
    private String name;
    private int number;
    private Order order;

    public users(){

    }
    public users(String name, int number, Order order) {
        this.name = name;
        this.number = number;
        this.order = order;
    }


    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Order getOrder() {
        return order;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setOrder(Order order) { this.order = order; }

    public void show() {
        System.out.println("姓名：" + name);
        System.out.println("订单号：" + number);
        order.showOrder();
    }
}