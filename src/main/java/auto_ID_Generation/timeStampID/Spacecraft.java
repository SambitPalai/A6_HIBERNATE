package auto_ID_Generation.timeStampID;

import java.time.LocalDateTime;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CurrentTimestamp;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.generator.EventType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.Version;
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
@Table(name = "spacecraft")
public class Spacecraft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;
    private String mission;
    @CreationTimestamp
    private LocalDateTime createdAt; // Generated during creation and will not change
    @UpdateTimestamp // Automatically generated during insertion and updated on modification | changes during a update
    private LocalDateTime updatedAt;
    @CurrentTimestamp  // Generated using the database's current time stamp
    private LocalDateTime currentTimestamp;
    @Transient
    private LocalDateTime databaseTimestamp;
    @Version // Automatically managed version time stamp
    private LocalDateTime versionTimestamp;
    @Transient
    private String category;
}
