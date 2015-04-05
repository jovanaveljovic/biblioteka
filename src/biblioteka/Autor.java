package biblioteka;

/**
 * Predstavlja autora jedne knjige.
 * 
 * @author Jovana
 * @version 1.0
 * 
 */
public class Autor {

	/**
	 * Ime autora.
	 */
	private String ime;
	/**
	 * Prezime autora.
	 */
	private String prezime;
	
	/**
	 * Metoda vraca ime autora tj. vrednost atributa ime.
	 * @return ime autora kao String
	 */
	public String getIme() {
		return ime;
	}
	
	/**
	 * Metoda postavlja ime autora na unetu vrednost.
	 * @param ime novo ime autora
	 * @throws java.lang.RuntimeException ako je uneto ime autora
	 * null ili prazan String
	 */
	public void setIme(String ime) {
		if(ime.isEmpty() || ime==null)
			throw new RuntimeException("Morate uneti ime");
		this.ime = ime;
	}
	
	/**
	 * Metoda vraca prezime autora tj. vrednost atributa prezime.
	 * @return  prezime autora kao String
	 */
	public String getPrezime() {
		return prezime;
	}
	
	/**
	 * Metoda postavlja prezime autora na unetu vrednost.
	 * @param prezime novo prezime autora
	 * @throws java.lang.RuntimeException ako je uneto prezime autora
	 * <ul>
	 * 	<li>null</li>
	 * <li>prazan String</li>
	 * </ul>
	 * 
	 * 
	 */
	public void setPrezime(String prezime) {
		if(prezime.isEmpty() || prezime==null)
			throw new RuntimeException("Morate uneti prezime");
		this.prezime = prezime;
	}
	
	@Override
		public String toString() {
			return "Autor [ime=" + ime + ", prezime=" + prezime + "]";
		}
	
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((ime == null) ? 0 : ime.hashCode());
			result = prime * result + ((prezime == null) ? 0 : prezime.hashCode());
			return result;
		}
	
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Autor other = (Autor) obj;
			if (ime == null) {
				if (other.ime != null)
					return false;
			} else if (!ime.equals(other.ime))
				return false;
			if (prezime == null) {
				if (other.prezime != null)
					return false;
			} else if (!prezime.equals(other.prezime))
				return false;
			return true;
		}
}