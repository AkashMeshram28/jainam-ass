/**
 * 
 */
package com.yash.bny.training.j8.ass12;

/**
 * @author akash.meshram
 *
 */
public class CityModel {

	private int cityid;
	private String cityname;
	private StateModel objState;
	private float pollutionIndex;
	private int population;
	private int area_of_city;

	public CityModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CityModel(int cityid, String cityname, StateModel objState, float pollutionIndex, int population,
			int area_of_city) {
		super();
		this.cityid = cityid;
		this.cityname = cityname;
		this.objState = objState;
		this.pollutionIndex = pollutionIndex;
		this.population = population;
		this.area_of_city = area_of_city;
	}

	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public StateModel getObjState() {
		return objState;
	}

	public void setObjState(StateModel objState) {
		this.objState = objState;
	}

	public float getPollutionIndex() {
		return pollutionIndex;
	}

	public void setPollutionIndex(float pollutionIndex) {
		this.pollutionIndex = pollutionIndex;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getArea_of_city() {
		return area_of_city;
	}

	public void setArea_of_city(int area_of_city) {
		this.area_of_city = area_of_city;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CityModel [cityid=");
		builder.append(cityid);
		builder.append(", cityname=");
		builder.append(cityname);
		builder.append(", objState=");
		builder.append(objState);
		builder.append(", pollutionIndex=");
		builder.append(pollutionIndex);
		builder.append(", population=");
		builder.append(population);
		builder.append(", area_of_city=");
		builder.append(area_of_city);
		builder.append("]");
		return builder.toString();
	}
}
