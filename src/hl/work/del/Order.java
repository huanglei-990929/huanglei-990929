package hl.work.del;

import javax.print.DocFlavor;

public class Order {
    private int id;
    private String way;
    public Order(){
    }

    public Order(int id, String way) {
        this.id = id;
        this.way = way;
    }

    public int getId() {
        return id;
    }

    public String getWay() {
        return way;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWay(String way) {
        this.way = way;
    }


    public  void  showOrder(){
        System.out.println("货物号"+id);
        System.out.println("方法"+way);
    }
}
