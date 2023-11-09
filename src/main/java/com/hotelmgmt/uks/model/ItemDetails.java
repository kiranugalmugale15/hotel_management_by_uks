package com.hotelmgmt.uks.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ItemDetails {

    @Id
    Integer itemTypeId;
    String itemType;
}
