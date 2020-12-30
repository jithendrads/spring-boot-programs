package com.jithendra.springbootmysql.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jithendra.springbootmysql.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

	//void save(List<Ticket> tickets);

}
