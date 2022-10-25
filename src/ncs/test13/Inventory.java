package ncs.test13;

import java.util.Date;

public class Inventory {
	private String productName;
	private Date putDate;
	private Date getDate;
	private int putAmount;
	private int getAmount;
	private int inventoryAmount;
	
	public Inventory() {};
	
	public Inventory(String productName, Date putDate, int putAmount) {
		
	}
	
	@Override
	public String toString() {
		return String.format(productName, null);
	}
	
	public void setGetDate(Date setDate) {
		
	}
	
	public void setGetAmount(int getAmount) throws AmountNotEnough {
		if(putAmount < getAmount) {
			throw new AmountNotEnough("현재 재고가 부족합니다 재고수량 확인하시기 바랍니다");
		} else {
			putAmount -= getAmount;
		}
	}
}
