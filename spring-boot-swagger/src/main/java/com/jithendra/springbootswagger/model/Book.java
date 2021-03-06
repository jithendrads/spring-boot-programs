package com.jithendra.springbootswagger.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4404421472103708763L;
	@Id
	@GeneratedValue
	@ApiModelProperty(value="autogenerated id")
	private int bookId;
	@ApiModelProperty(value="this is the book name")
	private String bookName;
	@ApiModelProperty(value="this is the book price")
	private double price;
	

}
