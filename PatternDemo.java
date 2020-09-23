package pt1;

public class PatternDemo {

	public static void main(String[] args) {
		LicenseRepository licenseRepository = new LicenseRepository();
		for(Iterator iter = licenseRepository.findIterator(); iter.nextItem();) {
			String license = (String)iter.item();
			System.out.println("Plate:" + license);
		}

	}

}
