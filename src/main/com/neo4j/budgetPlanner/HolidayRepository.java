package main.com.neo4j.budgetPlanner;

import main.com.neo4j.budgetPlanner.Holiday;
import org.springframework.data.repository.CrudRepository;

public interface HolidayRepository extends CrudRepository<Holiday, String> {
}
