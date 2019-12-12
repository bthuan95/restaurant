package com.restaurant.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import com.restaurant.config.AppConstants;

/**
 * The entity for Bill table
 * 
 * @author bthuan
 *
 */
@Entity
@Table( name = AppConstants.BILL )
@Getter
@Setter
public class Bill {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = AppConstants.ID )
    private int id;

    @OneToMany( mappedBy = AppConstants.MAPPED_MANY_TO_ONE_BILL, cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER )
    private Set<OrderDetails> orderDetails = new HashSet<>();

}
