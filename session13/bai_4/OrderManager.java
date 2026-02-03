package session13.bai_4;

import java.util.ArrayList;
import java.util.List;

public class OrderManager implements Manage<Order>{
    private static List<Order> orderList = new ArrayList<>();

    public OrderManager() {
    }

    @Override
    public void add(Order item) {
        orderList.add(item);
    }

    @Override
    public void update(int index, Order item) {
        orderList.set(index, item);
    }

    @Override
    public void delete(int index) {
        orderList.remove(index);
    }

    @Override
    public void display() {
        for(Order o: orderList){
            System.out.println("Order ID: " + o.getId() + ", Customer Name: " + o.getCustomerName());
        }
    }

    public int getIndexById(String id){
        for (Order o :  orderList){
            if(o.getId().equals(id)){
                return orderList.indexOf(o);
            }
        }
        return -1;
    }
}
