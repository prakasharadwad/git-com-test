package org.osgi.service.register.declarative.ServiceImp;


import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;



import org.osgi.service.register.activator.service.SimpleService;
import org.osgi.service.register.declarative.service.DeclarativeService;



public class DeclarativeServiceImpl implements DeclarativeService {

	
	public DeclarativeServiceImpl(){
	
		
	}

	protected  void activate(){
		
		System.out.println("Bundle Activated");
		BundleContext ctx = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
		ServiceReference<SimpleService>serviceref = null;
		SimpleService service = null;
		if( ctx != null ) {
		   serviceref = ctx.getServiceReference(SimpleService.class);
		   if( serviceref != null ) {
		      service = ctx.getService(serviceref); 
		   }	  
		}
		service.helloWorld();
		System.out.println("Simple Service Called..");
	


	}

	@Override
	public void declarativeService() {
		// TODO Auto-generated method stub
		
	}
	
	
}
	
