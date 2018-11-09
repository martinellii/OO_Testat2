import java.util.HashMap;

public class Test {

	public static void main(String[] args) throws Exception {
		// Sample code to illustrate how the CatalogueReader could be used:
		/*
		 * try (var reader = new CatalogueReader("StudyCatalogue.txt")) { String[]
		 * names; while ((names = reader.readNexteLine()) != null) {
		 * System.out.print("Module: " + names[0] + " Prerequisite: "); for (int i = 1;
		 * i < names.length; i++) { System.out.print(names[i] + " "); }
		 * System.out.println(); }
		 */
		HashMap<String, Module> hmap = new HashMap<String, Module>();
		try (var reader = new CatalogueReader("StudyCatalogue.txt")) {
			String[] names;
			while ((names = reader.readNexteLine()) != null) {
				for (int i = 0; i < names.length; i++) {
					hmap.put(names[i], null);
				}
				System.out.println(hmap);
			}
		}

	}
}