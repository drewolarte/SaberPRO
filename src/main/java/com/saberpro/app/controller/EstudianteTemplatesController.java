package com.saberpro.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.saberpro.app.entity.Estudiante;
import com.saberpro.app.exception.NotFoundException;
import com.saberpro.app.repository.EstudianteRepository;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteTemplatesController {
	@Autowired
	private EstudianteRepository estudianteRepository;

	@GetMapping("/")
	public String estudiantesListTemplate(Model model) {
		model.addAttribute("estudiantes", estudianteRepository.findAll());
		return "homeCoordinador";
	}

	@GetMapping("/new")
	public String estudiantesNewTemplate(Model model) {
		model.addAttribute("estudiante", new Estudiante());
		return "agregarEstudiante";
	}

	@GetMapping("/edit/{id}")
	public String estudianteEditTemplate(@PathVariable("id") String id, Model model) {
		model.addAttribute("estudiante",
				estudianteRepository.findById(id).orElseThrow(() -> new NotFoundException("Estudiante no encontrado")));
		return "actualizarEstudiante";
	}

	@GetMapping("/view/{id}")
	public String estudianteViewTemplate(@PathVariable("id") String id, Model model) {
		model.addAttribute("estudiante",
				estudianteRepository.findById(id).orElseThrow(() -> new NotFoundException("Estudiante no encontrado")));
		return "visualizarEstudiante";
	}

	@GetMapping("/viewStudent/{id}")
	public String estudianteViewStudentTemplate(@PathVariable("id") String id, Model model) {
		model.addAttribute("estudiante",
				estudianteRepository.findById(id).orElseThrow(() -> new NotFoundException("Estudiante no encontrado")));
		return "homeEstudiante";
	}

	@PostMapping("/save")
	public String estudiantesSaveProcess(@ModelAttribute("estudiante") Estudiante estudiante) {
		if (estudiante.getId().isEmpty()) {
			estudiante.setId(null);
		}
		estudianteRepository.save(estudiante);
		return "redirect:/estudiantes/";
	}

	@GetMapping("/delete/{id}")
	public String estudianteDeleteProcess(@PathVariable("id") String id) {
		estudianteRepository.deleteById(id);
		return "redirect:/estudiantes/";
	}

}
