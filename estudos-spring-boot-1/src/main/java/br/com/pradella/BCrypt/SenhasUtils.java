package br.com.pradella.BCrypt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhasUtils {
	
	
	public static String gerarBCrypt(String senha) {
		if (senha == null) {
			return senha;
		}
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.encode(senha);
	}
	
	
	
	
	
	public static boolean senhaValida(String senha, String senhaEncoded) {
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.matches(senha, senhaEncoded);
	}
	
	
	
	
	public static void main(String[] args) {
		String senhaEncoded = gerarBCrypt("123456");
		System.out.println("Senha encriptografada : " + senhaEncoded);

		boolean senhaValida = senhaValida("123456" , senhaEncoded);
		System.out.println("o Valor 123456 é valido ? : " + senhaValida);

		boolean senhaValida2 = senhaValida("1234567" , senhaEncoded);
		System.out.println("o Valor 1234567 é valido ? : " + senhaValida2);
		
	
	}
	
	

}
