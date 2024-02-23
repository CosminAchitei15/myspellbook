package com.dndspells.myspellbook.Services;

import com.dndspells.myspellbook.Model.Spell;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpellsRepository extends JpaRepository<Spell, Integer> {
}
