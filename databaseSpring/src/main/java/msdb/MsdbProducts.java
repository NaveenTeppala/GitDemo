package msdb;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class MsdbProducts {
	@Id
	private int prodid;
	private String prodname;
	private double price;
	private int qoh;
	private String remarks;
	@ManyToOne
	private MsdbCategories cat;
	private int taxrate;
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQoh() {
		return qoh;
	}
	public void setQoh(int qoh) {
		this.qoh = qoh;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public MsdbCategories getCat() {
		return cat;
	}
	public void setCat(MsdbCategories cat) {
		this.cat = cat;
	}
	public int getTaxrate() {
		return taxrate;
	}
	public void setTaxrate(int taxrate) {
		this.taxrate = taxrate;
	}
	@Override
	public String toString() {
		return "MsdbProducts [prodid=" + prodid + ", prodname=" + prodname + ", price=" + price + ", qoh=" + qoh
				+ ", remarks=" + remarks + ", cat=" + cat + ", taxrate=" + taxrate + "]";
	}
    
}
