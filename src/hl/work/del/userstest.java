package hl.work.del;

public class userstest {
    public static void main(String[] args) {

        Order order = new Order(2351,"自行查看");

        users p = new users("张三",22,order);

        p.show();
}}

