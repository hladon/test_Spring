package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class ItemController  {
    @Autowired
    private ItemService itemService=new ItemService();

    @GetMapping(value = "id")
    public String doGet(String id){
        return itemService.read();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print(ItemService.read(req.getParameter("param")));

    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ItemService.create(req.getParameter("name"),req.getParameter("description"));

    }


    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ItemService.update(req.getParameter("ID"),req.getParameter("name"),req.getParameter("description"));
    }


    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ItemService.delete(req.getParameter("ID"));
    }
}
