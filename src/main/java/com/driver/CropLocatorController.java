package com.driver;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crop-locator")
public class CropLocatorController {
	 private final CropService cropService;

	    public CropLocatorController(CropService cropService) {
	    	// your code goes here
	    	this.cropService=cropService;
	    }

	    @PostMapping("/register")
	    public ResponseEntity<String> registerCrop(@RequestBody Crop crop) {
	    	// your code goes here
	        cropService.addCrop(crop);
			return ResponseEntity.status(HttpStatus.CREATED).body("Crop registered successfully!");
	    }

	    @GetMapping("/locate")
	    public ResponseEntity<Crop> getCropByLocation(@RequestParam double latitude, @RequestParam double longitude) {
	    	// your code goes here
	    	Crop crop=cropService.findCropByLocation(latitude,longitude);
			if(crop!=null){
				return ResponseEntity.ok(crop);
			}
			else {
				return ResponseEntity.notFound().build();
			}
	    }

}
