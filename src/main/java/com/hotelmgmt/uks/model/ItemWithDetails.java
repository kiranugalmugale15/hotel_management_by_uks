package com.hotelmgmt.uks.model;

import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ItemWithDetails {
    Integer itemNo;
    String itemName;
    Integer itemPrice;
    String itemDesc;
    String itemType;
    String itemCatagory;
}
