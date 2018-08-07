package main.com.neo4j.budgetPlanner;

import main.com.neo4j.budgetPlanner.Holiday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HolidayController {

    @Autowired
    private HolidayService holidayService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/holidays")
    public ResponseEntity<Object> getAllHolidays() {

        return new ResponseEntity<>(holidayService.getAllHolidays(), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/holidays/{id}")
    public ResponseEntity<Object> getHoliday(@PathVariable String id) {

        return new ResponseEntity<>(holidayService.getHoliday(id), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/holidays")
    public ResponseEntity<Object> addHoliday(@RequestBody Holiday holiday) {

        holidayService.addHoliday(holiday);
        return new ResponseEntity<>("Holiday added", HttpStatus.OK);

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/holidays/{id}")
    public ResponseEntity<Object> updateHoliday(@RequestBody Holiday holiday) {

        holidayService.updateHoliday(holiday);
        return new ResponseEntity<>("Holiday updated", HttpStatus.OK);

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/holidays/{id}")
    public ResponseEntity<Object> deleteHoliday(@PathVariable String id) {

        holidayService.deleteHoliday(id);

        return new ResponseEntity<>("Holiday " + id + " Deleted", HttpStatus.OK);
    }

}
