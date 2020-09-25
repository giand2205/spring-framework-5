package com.system.springboot.app.controllers;

import com.system.springboot.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({"/index", "/", "", "/home"})
    //Usando Model
    public String Index(Model model) {
        model.addAttribute("titulo", "hola Spring Framework!");
        return "index";
    }

    //Usando ModelAndView
    /*public ModelAndView Index(ModelAndView mv){
        mv.addObject("titulo", "hola Spring Framework MV!");
        mv.setViewName("index");
        return mv;
    }*/

    //Usando Map
    /*public String Index(Map<String, Object> map){
        map.put("titulo", "hola Spring Framework!");
        return "index";
    }*/

    //Usando ModelMap
    /*public String Index(ModelMap model){
        model.addAttribute("titulo", "hola Spring Framework!");
        return "index";
    }*/

    @GetMapping("/perfil")
    public String perfil(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Gian");
        usuario.setApellido("Wong");
        usuario.setEmail("giand@gmail.com");
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
        return "perfil";
    }

    @GetMapping("/listar")
    //Cpm Arrays y ModelAttribute
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de usuarios");
        return "listar";
    }
    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuarios(){
        List<Usuario> usuarios = Arrays.asList(
                new Usuario("Gian", "Wong", "giand@gmail.com"),
                new Usuario("Diego", "Wong", "diego@gmail.com"),
                new Usuario("Alfonso", "Wong", "alfonso@gmail.com"),
                new Usuario("Pepe", "Wong", "pepe@gmail.com")
        );
        return usuarios;
    }

    //Con Arrays
    /*public String listar(Model model) {
        List<Usuario> usuarios = Arrays.asList(
                new Usuario("Gian", "Wong", "giand@gmail.com"),
                new Usuario("Diego", "Wong", "diego@gmail.com"),
                new Usuario("Alfonso", "Wong", "alfonso@gmail.com"),
                new Usuario("Pepe", "Wong", "pepe@gmail.com")
        );
        model.addAttribute("titulo", "Listado de usuarios");
        model.addAttribute("usuarios", usuarios);
        return "listar";
    }*/

    //Con ArrayList
    /*public String listar(Model model){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Gian", "Wong", "giand2205@gmail.com"));
        usuarios.add(new Usuario("Diego", "Wong", "diego2205@gmail.com"));
        usuarios.add(new Usuario("Alfonso", "Wong", "alfonso2205@gmail.com"));
        model.addAttribute("titulo", "Listado de usuarios");
        model.addAttribute("usuarios", usuarios);
        return "listar";
    }*/

}
