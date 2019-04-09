package com;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class ItemService {
    @Autowired
    private  ItemDAO itemDAO=new ItemDAO();
    public  void create(String name,String description){
        Item item=new Item();
        item.setDateCreated(new Date());
        item.setName(name);
        item.setDescription(description);
        item.setLastUpdatedDate(new Date());
        itemDAO.save(item);
    }
    public  String read(String param){
        int id=Integer.parseInt(param);
        Item item=itemDAO.findById(id);
        return item.toString();
    }
    public  void update(String id,String name,String description){
        Item item=itemDAO.findById(Integer.parseInt(id));
        item.setName(name);
        item.setDescription(description);
        item.setLastUpdatedDate(new Date());
        itemDAO.update(item);

    }
    public  void delete(String id){
        itemDAO.deleteById(Integer.parseInt(id));
    }
}
