package com.hotelmgmt.uks.repository;

import com.hotelmgmt.uks.model.Item;
import com.hotelmgmt.uks.model.ItemWithDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

    @Query("SELECT NEW com.hotelmgmt.uks.model.ItemWithDetails(i.itemNo, i.itemName, i.itemPrice, i.itemDesc, id.itemType, i.itemCatagory) FROM Item i JOIN i.itemDetails id")
    List<ItemWithDetails> getAllItemDetails();
}
