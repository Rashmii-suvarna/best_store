package com.example.beststore_new.controller;

import com.example.beststore_new.model.Product;
import com.example.beststore_new.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    // ✅ Login Page
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    // ✅ Home Redirection Based on Role
    @GetMapping("/home")
    public String homeRedirect(Authentication authentication) {
        if (authentication != null && authentication.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ADMIN"))) {
            return "redirect:/admin/home";
        } else {
            return "redirect:/user/home";
        }
    }

    // ✅ Admin Dashboard
    @GetMapping("/admin/home")
    public String adminDashboard(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "admin_home"; // <-- Admin dashboard view
    }

    // ✅ User Dashboard
    @GetMapping("/user/home")
    public String userDashboard(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "user_home"; // <-- User dashboard view
    }

    // ✅ Add Product Page
    @GetMapping("/addProduct")
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        return "addProduct";
    }

    // ✅ Save New Product
    @PostMapping("/addProduct")
    public String saveProduct(@ModelAttribute Product product) {
        productRepository.save(product);
        return "redirect:/admin/home";
    }

    // ✅ Edit Product Page
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Product product = productRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid product ID: " + id));
        model.addAttribute("product", product);
        return "editProduct";
    }

    // ✅ Save Edited Product
    @PostMapping("/editProduct")
    public String updateProduct(@ModelAttribute Product product) {
        productRepository.save(product);
        return "redirect:/admin/home";
    }

    // ✅ Confirm Delete Page
    @GetMapping("/delete/{id}")
    public String confirmDelete(@PathVariable Long id, Model model) {
        Product product = productRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid product ID: " + id));
        model.addAttribute("product", product);
        return "confirmDelete";
    }

    // ✅ Final Delete Action
    @PostMapping("/deleteConfirmed/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
        return "redirect:/admin/home";
    }

    // ✅ View Products (Accessible from both user and admin)
    @GetMapping("/view")
    public String viewProducts(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "view";
    }

    // ✅ Redirect root to /home
    @GetMapping("/")
    public String rootRedirect() {
        return "redirect:/home";
    }
}
