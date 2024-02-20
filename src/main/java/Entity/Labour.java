package Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Labour_Table")
public class Labour {
	
	public Labour(int id, String name, String addresses) {
		super();
		this.id = id;
		this.name = name;
		this.addresses = addresses;
	}
	@Id
	@GeneratedValue
	int id;
	String name;
	String addresses;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddresses() {
		return addresses;
	}
	public void setAddresses(String addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "Labour [id=" + id + ", name=" + name + ", addresses=" + addresses + "]";
	}

}
