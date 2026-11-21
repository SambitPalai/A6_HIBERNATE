package compositekey;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
public class Bank {
	
	@EmbeddedId
	private BankId bankid; 
	private String bank_type;
	private String loc;
	String manager;
	
}
