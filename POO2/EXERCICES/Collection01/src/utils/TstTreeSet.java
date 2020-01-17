package utils;

import java.util.ArrayList;
import java.util.TreeSet;

	public class TstTreeSet {
		public TreeSet <Compteur> compteurList = new TreeSet <Compteur>();
	
		public TreeSet <Compteur> getCompteurList() {
			return compteurList;
		}

		public void setCompteurList(TreeSet<Compteur> compteurList) {
			this.compteurList = compteurList;
		}

		public TstTreeSet() {
			
			int val = 1;
			
			for (int i =0; i<10; i++) {
				val = (int) (Compteur.MAX*Math.random());
				compteurList.add(new Compteur(val));
			}
		}
}
