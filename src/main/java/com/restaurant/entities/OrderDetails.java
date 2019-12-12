package com.restaurant.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import com.restaurant.config.AppConstants;

/**
 * The entity for Oder Details table
 * 
 * @author bthuan
 *
 */
@Entity
@Table( name = AppConstants.ORDER_DETAILS )
@Getter
@Setter
public class OrderDetails {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = AppConstants.ID )
    private int id;

    @Column( name = AppConstants.QUANTITY, nullable = false )
    private int quantity;

    @Column( name = AppConstants.ORDERED_TIME, nullable = false )
    private Date orderedTime;

    @OneToOne
    @JoinColumn( name = AppConstants.FK_MENUITEM_ID )
    private MenuItem menuItem;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = AppConstants.FK_BILL_ID )
    private Bill bill;

}
