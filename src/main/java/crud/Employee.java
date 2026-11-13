package crud;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
	@Id
	private Integer id;
	private String name;
	private Double salary;
	private String address;

	public String toString() {
		return "id="+id+", name="+name+", Salary="+salary+", Address="+address;
	}
	
}

