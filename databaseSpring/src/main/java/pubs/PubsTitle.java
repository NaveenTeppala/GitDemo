package pubs;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "titles")
public class PubsTitle {
	@Id
	@Column(name="title_id")
	private String tid;
	private String title;
	private String type;
	private Double price;
	private Integer royalty;
	private Integer ytd_sales;
	@ManyToOne
	@JoinColumn(name="pub_id")
	@JsonIgnore
	private PubsPublishers publisher;
	@ManyToMany
	@JsonIgnore
	private Set<PubsAuthor> pa=new HashSet<>();
	public Set<PubsAuthor> getPa() {
		return pa;
	}
	public void setPa(Set<PubsAuthor> pa) {
		this.pa = pa;
	}
	public String getTitle_id() {
		return tid;
	}
	public void setTitle_id(String title_id) {
		this.tid = title_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getRoyality() {
		return royalty;
	}
	public void setRoyality(Integer royality) {
		this.royalty = royality;
	}
	public Integer getYtd_sales() {
		return ytd_sales;
	}
	public void setYtd_sales(Integer ytd_sales) {
		this.ytd_sales = ytd_sales;
	}
	public PubsPublishers getPublisher() {
		return publisher;
	}
	public void setPublisher(PubsPublishers publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "PubsTitle [title_id=" + tid + ", title=" + title + ", type=" + type + ", price=" + price
				+ ", royality=" + royalty + ", ytd_sales=" + ytd_sales + ", publisher=" + publisher + "]";
	}
	
}
