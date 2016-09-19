package com.demo.access;

public class AccessPrivate {
	
	
	public void testPublic(){
		
	}
	void testDefault(){
		
	}
	protected void testProtected(){
		
	}
    private void testPrivate(){
    	
    }
	public static void main(String[] args) {
		AccessPrivate ap = new AccessPrivate();
		ap.testDefault();
		ap.testPrivate();
		ap.testProtected();
		ap.testPublic();

	}

}
