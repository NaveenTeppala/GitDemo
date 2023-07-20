package pubs;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "authors")
public class PubsAuthor {
	@Id
	@Column(name="au_id")
	private String auid;
	private String au_lname;
	private String au_fname;
	private String phone;
	private String city;
	@ManyToMany
	@JoinTable(name="titleauthor",joinColumns = @JoinColumn(name="author_id"),inverseJoinColumns = @JoinColumn(name="title_id"))
	@JsonIgnore
	private Set<PubsTitle> pt=new HashSet<>();
	public String getAuthor_id() {
		return auid;
	}
	public void setAuthor_id(String author_id) {
		this.auid = author_id;
	}
	public String getAu_lname() {
		return au_lname;
	}
	public void setAu_lname(String au_lname) {
		this.au_lname = au_lname;
	}
	public String getAu_fname() {
		return au_fname;
	}
	public void setAu_fname(String au_fname) {
		this.au_fname = au_fname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Set<PubsTitle> getPt() {
		return pt;
	}
	public void setPt(Set<PubsTitle> pt) {
		this.pt = pt;
	}
	@Override
	public String toString() {
		return "PubsAuthor [author_id=" + auid + ", au_lname=" + au_lname + ", au_fname=" + au_fname + ", phone="
				+ phone + ", city=" + city + ", pt=" + pt + "]";
	}
	
}
