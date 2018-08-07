package main.com.neo4j.budgetPlanner;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeathCheckController {

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/health")
        public String index() {
            return "Budget Planner Application is running!!";
        }

}
