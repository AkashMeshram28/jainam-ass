/**
 * 
 */
package com.yash.bny.training.j8.ass12;

/**
 * @author akash.meshram
 *
 */
public class StateModel {
	private int stated;
	private String statename;

	public StateModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StateModel(int stated, String statename) {
		super();
		this.stated = stated;
		this.statename = statename;
	}

	public int getStated() {
		return stated;
	}

	public void setStated(int stated) {
		this.stated = stated;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StateModel [stated=");
		builder.append(stated);
		builder.append(", statename=");
		builder.append(statename);
		builder.append("]");
		return builder.toString();
	}

}
