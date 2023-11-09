package com.hotelmgmt.uks.service;

import com.hotelmgmt.uks.model.Item;
import com.hotelmgmt.uks.model.ItemDetails;
import com.hotelmgmt.uks.model.ItemWithDetails;
import com.hotelmgmt.uks.repository.ItemDetailsRepository;
import com.hotelmgmt.uks.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    ItemDetailsRepository itemDetailsRepository;
    public List<ItemWithDetails> getItems() {
        return itemRepository.getAllItemDetails();
    }

    public Item getItems(Integer itemNo) {
        Optional<Item> optionalItem = itemRepository.findById(itemNo);
        if (optionalItem.isPresent()){
            return optionalItem.get();
        }
        return null;
    }

    public List<ItemDetails> getItemDetails() {
        return itemDetailsRepository.findAll();
    }
}
