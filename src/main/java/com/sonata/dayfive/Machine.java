package com.sonata.dayfive;

public interface Machine 
{
 String speedUp();
 String slowDown();
 
 
 default String turnAlarmOn() {
	 return "Turning the vehicle alarm on.";
	 
 }
 
 default String turnAlarmOff() 
 {
return "Turning the vehicle alarm off.";	 
 }
}
