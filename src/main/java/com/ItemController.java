package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
public class ItemController  {
    @Autowired
    private ItemService itemService=new ItemService();

    @RequestMapping(method = RequestMethod.GET,value = "/", produces = "text/plain")
    public @ResponseBody String doGet(@RequestParam(name = "id") String id ) {
        return itemService.read(id);
    }

    @PostMapping( value = "/",produces = "text/plain" )
    public @ResponseBody String doPost(@RequestParam(name = "name") String name,
                                       @RequestParam(name = "description") String description ) {
        itemService.create(name,description);
        return "Save is done";
    }

    @PutMapping( value = "/",produces = "text/plain" )
    public @ResponseBody String doPut(@RequestParam(name = "name") String name,
                                       @RequestParam(name = "description") String description,
                                        @RequestParam(name = "id") String id) {
        itemService.update(id,name,description);
        return "Update is done";
    }

    @DeleteMapping( value = "/",produces = "text/plain" )
    public @ResponseBody String doPost(@RequestParam(name = "id") String id) {
        itemService.delete(id);
        return "Delete is done";
    }




}
