package com.wipro.serviceimpl;


import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wipro.data.Studentdata;
import com.wipro.model.Addressinfo;
import com.wipro.model.StudentInfo;



public class StudentImpl {
	
	
	public void savedata(StudentInfo s8)
	{
		Transaction t = null;
		Session session = Studentdata.getsessionfact().openSession();
		t = session.beginTransaction();
		session.save(s8);
		t.commit();	
	}
	public StudentInfo validuandp(String u, String p)
	{
		Transaction t = null;
		Session session = Studentdata.getsessionfact().openSession();	
		Query query = session.createQuery("from StudentInfo");
		List<StudentInfo> lit = query.getResultList();
		Iterator<StudentInfo> ls = lit.iterator();
		int k =0;
		StudentInfo validS = new StudentInfo();
		while(ls.hasNext())
		{
			StudentInfo e = ls.next();	
		if(u.equalsIgnoreCase(e.getUname()) && p.equalsIgnoreCase(e.getPword()))
		{
			k=1;
			validS = e;
			break;
		}
		}
		if(k==1) {
			return validS;
		}
		else {
			return null;
		}	
	}
		
	public List<StudentInfo> getallStudents() {
		Transaction t = null;
		Session session = Studentdata.getsessionfact().openSession();
		t = session.beginTransaction();
		Query qu = session.createQuery("from StudentInfo");
		List<StudentInfo> sk = qu.getResultList();
		
		return sk;
	}

	public StudentInfo getStudent(int i) {
		Session session = Studentdata.getsessionfact().openSession();
		Transaction t = null;
		t = session.beginTransaction();
		StudentInfo s = session.get(StudentInfo.class, i);
		t.commit();
		return s;
	}  
	
	public void delobbyid(int object) {
		Transaction t = null;
		Session session = Studentdata.getsessionfact().openSession();
		t = session.beginTransaction();
		StudentInfo p =	session.find(StudentInfo.class, object);
			if(session.contains(p))
			{
				session.remove(p);
				System.out.println("deleted current record");
			}
			else {
				System.out.println("Not Present in the repo");
			}
		}
	public void delall() {
		Transaction t = null;
		Session session = Studentdata.getsessionfact().getCurrentSession();
		t = session.beginTransaction();
		session.remove(StudentInfo.class);
		t.commit();
		
}
}