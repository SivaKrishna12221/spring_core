package com.nt.comps;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("wmg")
public class WishMessageGenerator 
{
	@Autowired
	@Qualifier("ldt1")
	private LocalDateTime dateTime;
	private Date date;
	/*
	 * @Autowired public void assaignDateTime(LocalDateTime dateTime) {
	 * System.out.println("WishMessageGenerator.assaignDateTime()");
	 * this.dateTime=dateTime; }
	 * 
	 * @Autowired public void putDate(Date date) {
	 * System.out.println("WishMessageGenerator.putDate()"); this.date=date; }
	 */
	/*
	 * public WishMessageGenerator(LocalDateTime dateTime) {
	 * System.out.println("WishMessageGenerator.WishMessageGenerator()");
	 * this.dateTime=dateTime; }
	 */

	/*
	 * public LocalDateTime getDateTime() { return dateTime; }
	 */
	/*
	 * public void setDateTime(LocalDateTime dateTime) { this.dateTime = dateTime; }
	 */
	/*
	 * @Autowired public void setDateTime(LocalDateTime dateTime) {
	 * this.dateTime=dateTime; }
	 */
	
	/*
	 * @Autowired public WishMessageGenerator(LocalDateTime dateTime) {
	 * this.dateTime=dateTime;
	 * 
	 * System.out.println("WishMessageGenerator.WishMessageGenerator()"); }
	 */
	
	
	public String generatewishmessage(String user) 
	{
	System.out.println("WishMessageGenertor.generatewishmessage()"); 
	int hour=dateTime.getHour(); 
	if(hour<12) return "good mornig"+user; 
	else
	if(hour<16) return "good afternoon"+user; 
	else return "good night"; }
	 
}
