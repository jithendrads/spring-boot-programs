package com.jithendra.springbootmysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jithendra.springbootmysql.dao.TicketDao;
import com.jithendra.springbootmysql.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	private TicketDao dao;

	@PostMapping("/booktickets")
	public String bookTicket(@RequestBody List<Ticket> tickets)
	{
		dao.saveAll(tickets);
		return "ticket booked: "+tickets.size();
	}
	
	@GetMapping("/gettickets")
	public List<Ticket> getTickets()
	{
		return (List<Ticket>) dao.findAll();
	}
	

}
