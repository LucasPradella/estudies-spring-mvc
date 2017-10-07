package br.com.pradella.controllers;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pradella.DTO.EmpresaDTO;
import br.com.pradella.Response.API.Response;


@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {
	
	
/*	
 * Sem tratar o retorno 
 * 
 * 
 * @PostMapping
	public ResponseEntity<EmpresaDTO> cadastrar(@RequestBody EmpresaDTO empresaDTO) {
		empresaDTO.setId(1L);
		return ResponseEntity.ok(empresaDTO);
	}*/

	@PostMapping
	public ResponseEntity<Response<EmpresaDTO>> cadastrar(@Valid @RequestBody EmpresaDTO empresaDTO, BindingResult result) {
		
		Response<EmpresaDTO> response = new Response<EmpresaDTO>();
		
		
		if (result.hasErrors()) {
			List<String> collect = result.getAllErrors().stream()
															.map(error -> error.getDefaultMessage())
															.collect(Collectors.toList());
			
			response.setErrors(collect);
			return ResponseEntity.badRequest().body(response);
		}
		
		empresaDTO.setId(1L);
		response.setData(empresaDTO);
		return ResponseEntity.ok(response);
		
	}
	
	
}
