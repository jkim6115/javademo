package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {
	private String productName;
	private Date putDate; // 입고일
	private Date getDate; // 출고일
	private int putAmount; // 입고수량
	private int getAmount; // 출고수량
	private int inventoryAmount; // 재고수량

	public Inventory() {

	}

	public Inventory(String productName, Date putDate, int putAmount) {
		this.productName = productName;
		this.putDate = putDate;
		this.putAmount = putAmount;
		this.inventoryAmount = putAmount;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getPutDate() {
		return putDate;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public Date getGetDate() {
		return getDate;
	}

	public int getPutAmount() {
		return putAmount;
	}

	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}

	public int getGetAmount() {
		return getAmount;
	}

	public int getInventoryAmount() {
		return inventoryAmount;
	}

	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}

	@Override
	public String toString() {
		String pattern = "yyyy년 MM월 dd일";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		if (getDate == null) {
			return String.format("%s, %s 입고, %d개, %s 출고, %d개, 재고 %d개", productName, sdf.format(putDate), putAmount, getDate,
					getAmount, inventoryAmount-getAmount);
		} else {
			return String.format("%s, %s 입고, %d개, %s 출고, %d개, 재고 %d개", productName, sdf.format(putDate), putAmount,
					sdf.format(this.getDate), getAmount, inventoryAmount-getAmount);
		}
	}

	public void setGetDate(Date setDate) {
		this.getDate = setDate;
	}

	public void setGetAmount(int getAmount) {
		this.getAmount = getAmount;
	}

}