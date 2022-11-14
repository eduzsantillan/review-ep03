package com.educode.springdatajpacourse.controller;

import com.educode.springdatajpacourse.entity.Category;
import com.educode.springdatajpacourse.entity.Item;
import com.educode.springdatajpacourse.service.CategoryService;
import com.educode.springdatajpacourse.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {


    @Autowired
    private ItemService itemService;


    @PostMapping("/add")
    public void addItem(@RequestBody Item item){
        itemService.addItem(item);
    }

    @GetMapping({"","/getall"})
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

    @GetMapping("/getbyid")
    public Item getItemById(@RequestParam Long id){
        return itemService.getItemById(id);
    }
}

