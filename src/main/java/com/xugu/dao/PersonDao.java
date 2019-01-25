package com.xugu.dao;

import java.util.List;

import org.springframework.data.repository.Repository;
import com.xugu.pojo.Person;
/**
 * 简单的增删查改
 * 复杂请看spring data jpa 官方文档
 * @author mj
 *
 */
public interface PersonDao extends Repository<Person, Long>
{
	/**
	 * 按id查找
	 * @param id
	 * @return
	 */
	Person findById(Long id);
	/**
	 * 查询全部
	 * @return
	 */
	List<Person> findAll();
	/**
	 * 插入
	 * @param person
	 * @return
	 */
	Person save(Person person);
	/**
	 * 删除
	 * @param person
	 */
	void delete(Person person);
}
