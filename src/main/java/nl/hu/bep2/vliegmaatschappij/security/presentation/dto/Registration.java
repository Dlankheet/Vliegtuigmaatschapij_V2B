package nl.hu.bep2.vliegmaatschappij.security.presentation.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Registration {
	@NotBlank
	public String username;

	@Size(min = 5)
	public String password;
}
