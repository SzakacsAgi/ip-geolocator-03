package geolocator;

public record GeoLocation(String city, String as, String country, String countryCode, String isp, double lat, double lon, String org, String query, String region, String regionName, String timezone, String zip) {
}