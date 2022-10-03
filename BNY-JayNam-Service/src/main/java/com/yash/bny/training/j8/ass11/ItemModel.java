package com.yash.bny.training.j8.ass11;

import java.time.LocalDateTime;

/**
 * @author akash.meshram
 *
 */
public class ItemModel {

	private int itemid;
	private String iname;
	private LocalDateTime dom;
	private LocalDateTime doe;
	private float price;
	
	public ItemModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ItemModel(String iname, float price) {
		super();
		this.iname = iname;
		this.price = price;
	}

	public ItemModel(int itemid, String iname, LocalDateTime dom, LocalDateTime doe, float price) {
		super();
		this.itemid = itemid;
		this.iname = iname;
		this.dom = dom;
		this.doe = doe;
		this.price = price;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public LocalDateTime getDom() {
		return dom;
	}

	public void setDom(LocalDateTime dom) {
		this.dom = dom;
	}

	public LocalDateTime getDoe() {
		return doe;
	}

	public void setDoe(LocalDateTime doe) {
		this.doe = doe;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ItemModel [itemid=");
		builder.append(itemid);
		builder.append(", iname=");
		builder.append(iname);
		builder.append(", dom=");
		builder.append(dom);
		builder.append(", doe=");
		builder.append(doe);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
}
