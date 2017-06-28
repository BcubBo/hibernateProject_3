package test;

import java.util.ArrayList;
import java.util.List;

import biz.DeptBiz;
import po.Dept;
import po.Emp;

public class DeptTest {
	
	public static void main(String[]args){
		
		DeptBiz biz = new DeptBiz();
		
		
//		biz.findDeptById((byte)20);
		
		Dept dept = new Dept((byte)60,"new department","unknown");
		
		Emp emp1,emp2,emp3 =null;
		emp1 = new Emp();
		emp2 = new Emp();
		emp3 = new Emp();
		Emp[] empArray = new Emp[]{emp1,emp2,emp3};
		for(int i = 0 ;i<empArray.length;i++){
			
			empArray[i].setEmpName("new Emp "+(i+1));
			
			
			
		}

		Emp[] empsArray = new Emp[]{emp1,emp2,emp3};
		

		for(int i = 0 ;i<empsArray.length;i++){
			
			dept.getEmps().add(empsArray[i]);
			
			
			
		}
		for(int i = 0;i<empsArray.length;i++){
			
			empsArray[i].setDept(dept);
		}
		biz.addNewDept(dept);
		
	}
	
	
	
}
