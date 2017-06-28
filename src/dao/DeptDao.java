package dao;

import common.HibernateSessionFactory;
import po.Dept;

public class DeptDao {
	
	public Dept findDeptById(java.io.Serializable id){
		
		return (Dept)HibernateSessionFactory.getSession().get(Dept.class, id);
		
		
		
		
		
		
		
	}//findDeptById结尾
	
	
	
	
	public void save(Dept dept){
		
		
		
		HibernateSessionFactory.getSession().save(dept);
		
		
		
	}//save方法
	
	
	public void update(Dept dept){
		
		HibernateSessionFactory.getSession().update(dept);
		
		
		
	}//update方法结尾
	
	
	public void delete(Dept dept){
	
		HibernateSessionFactory.getSession().delete(dept);
		
	
	
	
	}//delete结尾
	
	
}
