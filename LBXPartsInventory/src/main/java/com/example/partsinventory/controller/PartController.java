package com.example.partsinventory.controller;

import com.example.partsinventory.model.Part;
import com.example.partsinventory.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PartController {

    @Autowired
    private PartService partService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("allParts", partService.getAllParts());
        model.addAttribute("part", new Part());
        return "index";
    }

    @PostMapping("/addPart")
    public String addPart(@ModelAttribute Part part) {
        partService.addPart(part);
        return "redirect:/";
    }

    @PostMapping("/deletePart")
    public String deletePart(@RequestParam("partNumber") String partNumber) {
        partService.deletePart(partNumber);
        return "redirect:/";
    }
}
