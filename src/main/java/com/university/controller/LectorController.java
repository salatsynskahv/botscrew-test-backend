package com.university.controller;

import com.university.dto.LectorDto;
import com.university.entities.Lector;
import com.university.service.LectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "${app.cors.allowed-origins}", maxAge = 3600)
@RestController
@RequiredArgsConstructor
@RequestMapping("/lector")
public class LectorController {

    private final LectorService lectorService;

    @GetMapping
    public List<LectorDto> getAllLectors(){
        List<LectorDto> lectors = lectorService.getAllLectors();
        return lectors;
    }

    @PutMapping("/{lectorId}/promote")
    public void promote(@PathVariable long lectorId) {
        lectorService.promoteLector(lectorId);
    }

    @PutMapping("/{lectorId}/update")
    public void updateLector(@PathVariable long lectorId, @RequestParam("name") String name) {
        lectorService.updateName(lectorId, name);
    }

    @GetMapping("/search")
    List<LectorDto> searchLector(@RequestParam("query") String userQuery) {
        List<LectorDto> lectorDtos = lectorService.findLectorByQuery(userQuery);
        return lectorDtos;

    }
}
