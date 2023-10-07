package com.wipro.data;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Studentdata {


	
	private static SessionFactory sessionfactory;
	private static StandardServiceRegistry reg;
	
	public static SessionFactory getsessionfact()
	{	
			try {
				reg = new StandardServiceRegistryBuilder().configure().build();
				MetadataSources sources = new MetadataSources(reg);
				Metadata metadata = sources.getMetadataBuilder().build();
				sessionfactory = metadata.getSessionFactoryBuilder().build();	
	       } catch (Exception e) {
		      e.printStackTrace();	
}
return sessionfactory;
}

public static void shutdown() {
if (reg != null) {
	StandardServiceRegistryBuilder.destroy(reg);
}
}
}