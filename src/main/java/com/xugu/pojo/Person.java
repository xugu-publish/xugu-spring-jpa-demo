package com.xugu.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person
{
	@Id
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String sex;
	
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getSex()
	{
		return sex;
	}
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	@Override
	public String toString()
	{
		return "{id = "+id+", name = "+name+", sex = "+sex+"}";
	}
	
}
