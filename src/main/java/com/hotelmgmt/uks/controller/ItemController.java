package com.hotelmgmt.uks.controller;

import com.hotelmgmt.uks.model.Item;
import com.hotelmgmt.uks.model.ItemDetails;
import com.hotelmgmt.uks.model.ItemWithDetails;
import com.hotelmgmt.uks.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping("/get/items")
    public List<ItemWithDetails> getItems()
    {
        return itemService.getItems();
    }

    @GetMapping("/get/items-details")
    public List<ItemDetails> getItemDetails()
    {
        return itemService.getItemDetails();
    }

    @GetMapping("/get/item/{itemNo}")
    public Item getItems(@PathVariable Integer itemNo)
    {
        return itemService.getItems(itemNo);

    }



}

