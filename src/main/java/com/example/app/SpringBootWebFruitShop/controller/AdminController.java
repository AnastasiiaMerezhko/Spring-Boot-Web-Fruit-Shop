package com.example.app.SpringBootWebFruitShop.controller;

import com.example.app.SpringBootWebFruitShop.service.Admin.AdminFruitService;
import com.example.app.SpringBootWebFruitShop.service.Admin.AdminVegetableService;
import com.example.app.SpringBootWebFruitShop.service.Admin.AdminOrderService;
import com.example.app.SpringBootWebFruitShop.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.logging.Logger;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private static final Logger LOGGER =
            Logger.getLogger(AdminController.class.getName());

    @Autowired
    AdminVegetableService adminVegetableService;
    @Autowired
    AdminFruitService adminFruitService;
    @Autowired
    AdminOrderService adminOrderService;

    @GetMapping
    public String getHome(Model model) {
        model.addAttribute("title", "Fruit Shop");
        model.addAttribute("fragmentName", "home");
        return "Admin/layout";
    }

    @GetMapping("/vegetables")
    public String getVegetables(Model model) {
        model.addAttribute("title", "Vegetables");
        model.addAttribute("vegetables", adminVegetableService.getAll());
        model.addAttribute("fragmentName", "vegetables");
        return "Admin/layout";
    }

    @GetMapping("/fruits")
    public String getFruits(Model model) {
        model.addAttribute("title", "Fruits");
        model.addAttribute("fruits", adminFruitService.getAll());
        model.addAttribute("fragmentName", "fruits");
        return "Admin/layout";
    }

    @GetMapping("/orders")
    public String getOrders(Model model) {
        model.addAttribute("title", "Orders");
        model.addAttribute("orders", adminOrderService.getAll());
        model.addAttribute("fragmentName", "orders");
        return "Admin/layout";
    }

    @PostMapping("/create-fruit")
    public ResponseEntity<?> createFruit(
            @RequestParam("fruitName") String fruitName,
            @RequestParam("fruitArt") String fruitArt,
            @RequestParam("fruitDescr") String fruitDescr,
            @RequestParam("fruitPrice") String fruitPrice,
            @RequestParam("fruitFile") MultipartFile fruitFile ) {
        String fileName = fruitFile.getOriginalFilename();
        String[] data = new String[]{fruitName, fruitArt, fruitDescr,
                fruitPrice, fileName};
        LOGGER.info("Admin add fruit data: " + Arrays.toString(data));
        ResponseEntity<?> response;
        try {
            response = adminFruitService.addFruit(data, fruitFile);
        } catch (Exception e) {
            return new ResponseEntity<>(new ResponseMessage(false,
                    "Error :("), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return response;
    }
}
