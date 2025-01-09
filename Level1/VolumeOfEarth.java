class VolumeOfEarth{
	public static void main(String[] args){
		int radiusOfEarthInKiloMeter = 6378;
		double valueOfPI = 3.14;
		
		// calculating volume of earth in Km^3
		double volumeOfEarthInCubicKM = (4 * valueOfPI * radiusOfEarthInKiloMeter * radiusOfEarthInKiloMeter * radiusOfEarthInKiloMeter);
		
		// converting radius of earth into miles
		double radiusOfEarthInMiles = (double)radiusOfEarthInKiloMeter / 1.6;
		
		// calculating volume of earth in miles^3
		double volumeOfEarthInCubicMiles = (4 * valueOfPI * radiusOfEarthInMiles * radiusOfEarthInMiles * radiusOfEarthInMiles);
		
		System.out.println("The volume of Earth in cubic Kilometers is " + volumeOfEarthInCubicKM + " and cubic miles is " + volumeOfEarthInCubicMiles);
	}
}