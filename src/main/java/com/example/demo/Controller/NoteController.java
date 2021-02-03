package com.example.demo.Controller;

import com.example.demo.Entity.Absence;
import com.example.demo.Entity.Note;
import com.example.demo.Entity.User;
import com.example.demo.Service.NoteService;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class NoteController {

    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    /*@GetMapping(path = "getNotes")
    public List<Note> getNotes(){
    return noteService.getNotes();
    }*/

    @PostMapping(path = "getUserNote/{idUser}/{idSemestre}")
    public List<Object> getUserNote(@PathVariable("idUser") long idUser, @PathVariable("idSemestre") long idSemestre){
        return noteService.getUserNote(idUser,idSemestre);
    }

    /*@PostMapping(path = "authentification")
    public void authentifierUser(@RequestBody User user){
        userService.authentifier(user);
    }*/

    /*
    @PostMapping(path = "inscription")
    public void registerNewUser(@RequestBody User user){
        userService.inscription(user);
    }*/

    /*@DeleteMapping(path = "{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
        userService.deleteUser(userId);
    }*/

    /*@PutMapping(path = "{userId}")
    public void updateUser(
            @PathVariable("userId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email){
        userService.updateUser(userId,name,email);
    }*/
}
