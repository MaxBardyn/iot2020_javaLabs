package ua.lviv.iot.clothesStore.model; 

public class AbstractClothes {
  protected String brandName;
  protected String color;
  protected String countryOfManufacturer;
  protected Gender gender;
  protected Seasons season;
  protected double priceInUAH;
  protected int size;
  protected boolean suitableForCeremonialReception;

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getCountryOfManufacturer() {
    return countryOfManufacturer;
  }

  public void setCountryOfManufacturer(String countryOfManufacturer) {
    this.countryOfManufacturer = countryOfManufacturer;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public Seasons getSeason() {
    return season;
  }

  public void setSeason(Seasons season) {
    this.season = season;
  }

  public double getPriceInUAH() {
    return priceInUAH;
  }

  public void setPriceInUAH(double priceInUAH) {
    this.priceInUAH = priceInUAH;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public boolean isSuitableForCeremonialReception() {
    return suitableForCeremonialReception;
  }

  public void setSuitableForCeremonialReception(boolean suitableForCeremonialReception) {
    this.suitableForCeremonialReception = suitableForCeremonialReception;
  }

  public AbstractClothes(String brandName, String color, String countryOfManufacturer, Gender gender, Seasons season,
      double priceInUAH, int size, boolean suitableForCeremonialReception) {
    super();
    this.brandName = brandName;
    this.color = color;
    this.countryOfManufacturer = countryOfManufacturer;
    this.gender = gender;
    this.season = season;
    this.priceInUAH = priceInUAH;
    this.size = size;
    this.suitableForCeremonialReception = suitableForCeremonialReception;
  }

}