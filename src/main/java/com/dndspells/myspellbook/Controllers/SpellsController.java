package com.dndspells.myspellbook.Controllers;

import com.dndspells.myspellbook.Model.Spell;
import com.dndspells.myspellbook.Model.SpellDTO;
import com.dndspells.myspellbook.Services.SpellsRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/spells")
public class SpellsController {

    @Autowired
    private SpellsRepository repository;

    @GetMapping({"", "/"})
    public String showSpellList(Model model){
        List<Spell> spells = repository.findAll();
        model.addAttribute("spells", spells);
        return "spells/index";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        SpellDTO SpellDTO = new SpellDTO();
        model.addAttribute("SpellDTO", SpellDTO);
        return "spells/CreateSpell";
    }

    @PostMapping("/create")
    public String createSpell(@Valid @ModelAttribute SpellDTO spellDTO, BindingResult result){
        if(result.hasErrors()) {
            return "spells/CreateSpell";
        }

        Spell spell = new Spell();
        spell.setName(spellDTO.getName());
        spell.setType(spellDTO.getType());
        spell.setSchool(spellDTO.getSchool());
        spell.setDescription(spellDTO.getDescription());
        repository.save(spell);
        return "redirect:/spells";
    }

    @GetMapping("/edit")
    public String showEditPage(Model model, @RequestParam int id){
        try{
            Spell spell = repository.findById(id).get();
            model.addAttribute("spell", spell);

            SpellDTO SpellDTO = new SpellDTO();
            SpellDTO.setName(spell.getName());
            SpellDTO.setType(spell.getType());
            SpellDTO.setSchool(spell.getSchool());
            SpellDTO.setDescription(spell.getDescription());
            model.addAttribute("SpellDTO", SpellDTO);
        }
        catch(Exception ex){
            System.out.println("Exception: " + ex.getMessage());
            return "redirect:/spells";
        }
        return "spells/EditSpell";
    }

    @PostMapping("/edit")
    public String updateSpell(Model model, @RequestParam int id, @Valid @ModelAttribute SpellDTO SpellDTO, BindingResult result){
        try{
            Spell spell = repository.findById(id).get();
            model.addAttribute("spell", spell);

            if(result.hasErrors()) {
                return "spells/EditSpell";
            }

            spell.setName(SpellDTO.getName());
            spell.setType(SpellDTO.getType());
            spell.setSchool(SpellDTO.getSchool());
            spell.setDescription(SpellDTO.getDescription());
            repository.save(spell);

        }
        catch(Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return "redirect:/spells";
    }

    @GetMapping("/delete")
    public String deleteSpell(@RequestParam int id){
        try{
            Spell spell = repository.findById(id).get();
            repository.delete(spell);
        }
        catch(Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
        return "redirect:/spells";
    }

}
