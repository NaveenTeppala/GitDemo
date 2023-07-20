package pubs;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="publishers")
public class PubsPublishers {
	@Id
	private int pub_id;
	private String pub_name;
	private String city;
	private String state;
	private String country;
	@OneToMany(mappedBy = "publisher")
	@JsonIgnore
	private List<PubsTitle> title;
	public int getPub_id() {
		return pub_id;
	}
	public void setPub_id(int pub_id) {
		this.pub_id = pub_id;
	}
	public String getPub_name() {
		return pub_name;
	}
	public void setPub_name(String pub_name) {
		this.pub_name = pub_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<PubsTitle> getTitles() {
		return title;
	}
	public void setTitles(List<PubsTitle> titles) {
		this.title = titles;
	}
	@Override
	public String toString() {
		return "PubsPublishers [pub_id=" + pub_id + ", pub_name=" + pub_name + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", titles=" + title + "]";
	}
	

}
