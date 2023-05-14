package com;

 class Car extends Vehicle
{ 
 @Override      // indication of this method is override  and indication for jvm also
 void start() 
 {
	 System.out.println("Car Started");
	 super.start();
 }
                  // @Ovveride applicable for overridden method 
 void Shiftgear()
 {
	 System.out.println("Gear Shifted");
 }
 
}
