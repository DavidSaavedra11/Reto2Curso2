package com.example.reto2modulo2.Controller;

import com.example.reto2modulo2.Model.Gadget;
import com.example.reto2modulo2.Service.GadgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gadget")
public class GadgetController {
    @Autowired
    private GadgetService gadgetService;

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Gadget save(@RequestBody Gadget gadget){
        return gadgetService.save(gadget);
    }
    @GetMapping("/all")
    public List<Gadget> getAll(){
        return gadgetService.getAll();
    }
    @GetMapping("/id/{id}")
    public Gadget getGadget(@PathVariable int id){
        return gadgetService.getGadget(id);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Gadget update(@RequestBody Gadget gadget){
        return gadgetService.update(gadget);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        gadgetService.delete(id);
    }
}
