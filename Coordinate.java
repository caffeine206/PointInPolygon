public class Coordinate {
   public double latitude;
   public double longitude;
   
   public Coordinate(double latitude, double longitude) {
      this.latitude = latitude;
      this.longitude = longitude;
   }
   
   public double getLatitude() {
      return latitude;
   }
   
   public double getLongitude() {
      return longitude;
   }
}