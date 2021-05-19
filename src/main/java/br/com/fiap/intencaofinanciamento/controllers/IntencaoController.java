package br.com.fiap.intencaofinanciamento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.fiap.intencaofinanciamento.dto.IntencaoDTO;
import br.com.fiap.intencaofinanciamento.services.IntencaoService;

@Controller
public class IntencaoController {

	@Autowired
	private IntencaoService service;
	
	@PostMapping("salvar-intencao")
	public String salvarIntencao(IntencaoDTO intencao, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute(intencao);
			return "intencao";
		}
		
		service.save(intencao);
		return "redirect:/";
	}
	
	
}
