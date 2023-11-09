package com.hotelmgmt.uks.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Item {

    @Id
    Integer itemNo;
    String itemName;
    Integer itemPrice;
    String itemDesc;

    //Integer itemTypeId;
    String itemCatagory;

    @ManyToOne
    @JoinColumn(referencedColumnName = "itemTypeId")
    ItemDetails itemDetails;
}

