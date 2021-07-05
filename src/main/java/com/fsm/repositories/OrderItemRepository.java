package com.fsm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsm.entities.OrderItem;
import com.fsm.entities.pk.OrderItemPK;

public interface OrderItemRepository  extends JpaRepository<OrderItem, OrderItemPK>{

}
