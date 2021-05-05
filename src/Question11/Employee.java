/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.Objects;

/**
 *
 * @author Pruthvi Raj Padthe
 */
public class Employee {
    
	int empId;  
	String empName;  
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

 	Employee(int empId,String empName){  
 		this.empId=empId;  
 		this.empName=empName;    
                
        }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.empId != other.empId) {
            return false;
        }
        if (!Objects.equals(this.empName, other.empName)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.empId;
        hash = 79 * hash + Objects.hashCode(this.empName);
        return hash;
    }
        
}