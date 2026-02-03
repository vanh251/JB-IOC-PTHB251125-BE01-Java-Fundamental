package session13.bai_3;

import java.util.ArrayList;
import java.util.List;

public class InvoiceManager implements Manage<Invoice> {
    private static List<Invoice> invoiceList = new ArrayList<>();
    @Override
    public void add(Invoice item) {
        invoiceList.add(item);
    }

    @Override
    public void update(int index, Invoice item) {
        invoiceList.set(index, item);
    }

    @Override
    public void delete(int index) {
        invoiceList.remove(index);
    }

    @Override
    public void display() {
        for (Invoice invoice : invoiceList) {
            System.out.println("Invoice ID: " + invoice.getId() + ", Amount: " + invoice.getAmount());
        }
    }

    public int getIdxById(String id){
        for(Invoice i : invoiceList){
            if(i.getId().equals(id)){
                return invoiceList.indexOf(i);
            }
        }
        return -1;
    }
}
