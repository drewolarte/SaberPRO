package com.saberpro.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.saberpro.app.entity.Coordinador;
import com.saberpro.app.repository.CoordinadorRepository;
import com.saberpro.app.entity.Estudiante;
import com.saberpro.app.repository.EstudianteRepository;

@Controller
public class HomeController {
	@Autowired
	private CoordinadorRepository ICoordinador;
	@Autowired
	private EstudianteRepository IEstudiante;

	@GetMapping("/index")
	public String index(Model model) {
		return "index";
	}

	@GetMapping("/loginEstudiante")
	public String loginEstudiante(Model model, @ModelAttribute Estudiante estudiante) {
		model.addAttribute("user", estudiante);
		return "loginEstudiante";
	}

	@PostMapping("/loginEstudiante")
	public String loginEstudiante(@ModelAttribute Estudiante estudiante) {

		for (Estudiante item : IEstudiante.findAll()) {
			if (item.getUsuario().equals(estudiante.getUsuario())) {
				if (item.getPassword().equals(estudiante.getPassword())) {
					return "redirect:/estudiantes/viewStudent/" + item.getId();
				}
			}
		}
		return "redirect:/loginEstudiante";
	}

	@GetMapping("/loginCoordinador")
	public String loginCoordinador(Model model, @ModelAttribute Coordinador coordinador) {
		model.addAttribute("user", coordinador);
		return "loginCoordinador";
	}

	@PostMapping("/loginCoordinador")
	public String loginCoordinador(@ModelAttribute Coordinador coordinador) {

		for (Coordinador item : ICoordinador.findAll()) {
			if (item.getUsuario().equals(coordinador.getUsuario())) {
				if (item.getPassword().equals(coordinador.getPassword())) {
					return "redirect:/estudiantes/";
				}
			}
		}
		return "redirect:/loginCoordinador";
	}

}
