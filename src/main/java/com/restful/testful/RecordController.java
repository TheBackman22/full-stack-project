package com.restful.testful;

import java.util.concurrent.atomic.AtomicLong;

// import java.util.List;
// import java.io.IOException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordController {
    private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Record greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Record(counter.incrementAndGet(), String.format(template, name));
	}

    // @GetMapping("/generateText")
    // public List<String> generateText(@RequestParam("prompt") String prompt) throws IOException {
    //     String url = "";
    //     RestTemplate restTemplate = new RestTemplate();
    //     Object[] response = restTemplate.getForObject(url, Object[].class);
    //     // return new ResponseEntity<>(response.toString());
    // }

}
