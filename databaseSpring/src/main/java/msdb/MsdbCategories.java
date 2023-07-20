package msdb;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="categories")
public class MsdbCategories {
	@Id
	private String catcode;
	private String catdesc;
	@OneToMany(mappedBy = "cat")
	private MsdbProducts products;
	public String getCatcode() {
		return catcode;
	}
	public void setCatcode(String catcode) {
		this.catcode = catcode;
	}
	public String getCatdesc() {
		return catdesc;
	}
	public void setCatdesc(String catdesc) {
		this.catdesc = catdesc;
	}
	public MsdbProducts getProducts() {
		return products;
	}
	public void setProducts(MsdbProducts products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "MsdbCategories [catcode=" + catcode + ", catdesc=" + catdesc + ", products=" + products + "]";
	}
    
}
