package ua.lviv.iot.clothesStore.model;

public class Shirt extends AbstractClothes {

  private boolean presenceOfCollar;

  public boolean isPresenceOfCollar() {
    return presenceOfCollar;
  }

  public void setPresenceOfCollar(boolean presenceOfCollar) {
    this.presenceOfCollar = presenceOfCollar;
  }

  public Shirt(String brandName, String color, String countryOfManufacturer, Gender gender, Seasons season,
      double priceInUAH, int size, boolean suitableForCeremonialReception, boolean presenceOfCollar) {
    super(brandName, color, countryOfManufacturer, gender, season, priceInUAH, size, suitableForCeremonialReception);
    this.presenceOfCollar = presenceOfCollar;
  }

  @Override
  public String toString() {
    return "Shirt [presenceOfCollar=" + presenceOfCollar + super.toString();
  }

  public String getHeaders() {
    return super.getHeaders() + ", presenceOfCollar";
  }

  public String toCSV() {
    return super.toCSV() + ", " + presenceOfCollar;
  }

}