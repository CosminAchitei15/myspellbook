# MySpellbook
 ---
# 1. Introduction
   This is a CRUD application made in Spring Boot to help me keep track of all spells my players might have in my Dungeons & Dragons campaign, so I don't have to remember what each does or Google each of those individually.
   ![image](https://github.com/CosminAchitei15/myspellbook/assets/149383119/43efe684-b897-410a-8a27-4e5ac1c179a1)
---
# 2. Concepts used
    - Spring Boot
    - Spring MVC
    - MySQL
    - Thymeleaf
    - JPA
---
# 3. Model
  - Name of the spell
  - Type (it can be either a cantrip or levels 1 to 9)
  - School
  - Description
---
# 4. Adding a spell
  - Form in which you input your data
  - ![image](https://github.com/CosminAchitei15/myspellbook/assets/149383119/9857e3d8-bc98-4ed9-a954-9b8f33e0073f)
  - Upon submitting the form, Tasha's Hideous Laughter is added into our spellbook
  - ![image](https://github.com/CosminAchitei15/myspellbook/assets/149383119/5944fe82-4b9f-4a88-be49-a2b95a0a91ac)
  - The spell is added into the mySQL database aswell
  - ![image](https://github.com/CosminAchitei15/myspellbook/assets/149383119/405fbf85-4f44-41ce-ad37-11f3c631dc8b)
---
# 5. Updating a spell
  - Upon pressing the edit button next to Hellish Rebuke, we get redirected to the update page, everything on this page is editable except for the ID, which remains the same
  - ![image](https://github.com/CosminAchitei15/myspellbook/assets/149383119/01ff56eb-5159-43fc-8ed9-a391bf3fcd71)
  - Let's, for example, change its school from "Evocation" to "Emocation"
  - ![image](https://github.com/CosminAchitei15/myspellbook/assets/149383119/a6776040-e0ca-41c2-ad01-860fb7c753dd)
  - As you can see, the change was made, Hellish Rebuke's School was succesfully edited
  - ![image](https://github.com/CosminAchitei15/myspellbook/assets/149383119/50673b0d-adb3-45d6-b036-15365edb6f6d)
---
# 6. Deleting a spell
  - Upon pressing the delete button next to Tasha's Hideous Laughter, we are prompted with a confirmation button
  - ![image](https://github.com/CosminAchitei15/myspellbook/assets/149383119/b2acbcae-0b14-44d2-a001-1830686e5e7c)
  - After confirming that we indeed want to delete the spell, it is removed from our spellbook
  - ![image](https://github.com/CosminAchitei15/myspellbook/assets/149383119/12259d78-1e10-47e9-9f76-eacaf6b6e623)

