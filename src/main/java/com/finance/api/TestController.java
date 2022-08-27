package com.finance.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.entity.GroceryItem;
import com.finance.repository.ItemRepository;

@RestController
public class TestController {
	
	@Autowired
	ItemRepository groceryItemRepo;
	
	@GetMapping
	public String createData() {
		try {
			groceryItemRepo.save(new GroceryItem("Pearl Millet", "Healthy Pearl Millet", 1, "millets"));
			groceryItemRepo.save(new GroceryItem("Whole Wheat Biscuit", "Whole Wheat Biscuit", 5, "snacks"));
		}catch (Exception e) {
			return "Failed";
		}
		
		return "Data created successfully";
		
	}
	
//	 void createGroceryItems() {
//		    
//	        System.out.println("Data creation started...");
//	        groceryItemRepo.save(new GroceryItem("Whole Wheat Biscuit", "Whole Wheat Biscuit", 5, "snacks"));
////	        groceryItemRepo.save(new GroceryItem("Kodo Millet", "XYZ Kodo Millet healthy", 2, "millets"));
////	        groceryItemRepo.save(new GroceryItem("Dried Red Chilli", "Dried Whole Red Chilli", 2, "spices"));
////	        groceryItemRepo.save(new GroceryItem("Pearl Millet", "Healthy Pearl Millet", 1, "millets"));
////	        groceryItemRepo.save(new GroceryItem("Cheese Crackers", "Bonny Cheese Crackers Plain", 6, "snacks"));
//	        System.out.println("Data creation complete...");
//	    }

}
