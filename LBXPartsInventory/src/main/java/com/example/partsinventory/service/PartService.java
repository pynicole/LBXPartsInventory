package com.example.partsinventory.service;

import com.example.partsinventory.model.Part;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PartService {
    private List<Part> parts = new ArrayList<>();

    public List<Part> getAllParts() {
        return parts;
    }

    public void addPart(Part part) {
        parts.add(part);
    }

    public void deletePart(String partNumber) {
        parts.removeIf(part -> part.getPartNumber().equals(partNumber));
    }
}
