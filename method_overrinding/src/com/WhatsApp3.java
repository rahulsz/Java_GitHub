package com;

class WhatsApp3 extends WhatsApp2
{
	@Override
 void display()
 {
	 super.dispaly();
	 System.out.println("Blue Tick");
 }
 @Override
 void call()
 {
	 super.call();
	 System.out.println("Video call");
 }
 
 void status()
 {
	 System.out.println("Images");
 }
}
