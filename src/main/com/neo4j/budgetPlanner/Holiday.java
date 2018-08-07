package main.com.neo4j.budgetPlanner;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "holidays")
public class Holiday {

    @Id
    private String id;
    private String destination;
    private String date;

}
