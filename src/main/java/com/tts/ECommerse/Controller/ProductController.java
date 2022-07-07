package com.tts.ECommerse.Controller;


import com.tts.ECommerse.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/product/(id)")
    public String show(@PathVariable int id, Model model) {
        Product product = productService.findById(id);
p        return "product";
    }
}
