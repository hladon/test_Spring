package com;

import config.SpringConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Demo {

    @Autowired
    public StorageDAO storageDAO;
    @Autowired
    public FileDAO fileDAO;
    @Autowired
    public Controller controller;

    @RequestMapping(method = RequestMethod.GET, value = "/", produces = "text/plain")
    public @ResponseBody
    String doPut() throws Exception {
        controller.put(storageDAO.findById(1), fileDAO.findById(1));
        return "Save is done";
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/", produces = "text/plain")
    public @ResponseBody
    String doDelete() throws Exception {
        controller.delete(storageDAO.findById(1), fileDAO.findById(1));
        return "Delete is done";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/", produces = "text/plain")
    public @ResponseBody
    String doTransfer() throws Exception {
        controller.transferFile(storageDAO.findById(1), storageDAO.findById(2), 1);
        return "Transfer is done";
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/", produces = "text/plain")
    public @ResponseBody
    String doTransferAll() throws Exception {
        controller.transferAll(storageDAO.findById(2), storageDAO.findById(1));
        return "TransferAll is done";
    }


//        Storage storage=new Storage();
//        List<String> list=new ArrayList<>();
//        list.add(  "txt");
//        list.add("doc");
//        storage.setFormatsSupported(list);
//        storage.setStorageCountry("Germany");
//        storage.setStorageSize(4500);
//        storageDAO.save(storage);

//        File file1=new File();

//        System.out.println(storageDAO.findById(1));
//        System.out.println(fileDAO.findById(1));
//        System.out.println(fileDAO.getFreeStorageSpace(storageDAO.findById(2)));


}

