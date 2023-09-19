package com.linktic.login.services;

import com.linktic.login.config.SecurityConfig;
import com.linktic.login.dto.ContactDTO;
import static com.linktic.login.enums.Errors.*;
import com.linktic.login.mapper.IContactMapper;
import com.linktic.login.mapper.ILogLoginMapper;
import com.linktic.login.model.Contact;
import com.linktic.login.model.LogLogin;
import com.linktic.login.model.Security;
import com.linktic.login.repository.IContactRepository;
import com.linktic.login.repository.ILogLoginRepository;
import com.linktic.login.repository.ISecurityRepository;
import com.linktic.login.request.LoginDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthenticationService implements IAuthenticationService {

	private final ISecurityRepository securityRepository;
	private final IContactRepository contactRepository;
	private final ILogLoginRepository logLoginRepository;

	private final IContactMapper contactMapper;
	private final ILogLoginMapper logLoginMapper;

	private final SecurityConfig securityConfig;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationService.class);

	@Override
	@SuppressWarnings("unchecked")
	public <T> ResponseEntity<T> validateUserAndPassword(LoginDTO login) {
		LOGGER.info("Ingresa a validar el login " + login);
		
		if (login == null)
			return ResponseEntity.badRequest().build();

		Optional<Security> security = securityRepository.getUserByUsername(login.getUsername());

		if (security.isPresent()) {
			if (securityConfig.passwordEncoder().matches(login.getPassword(), security.get().getPassword())) {
				Optional<Contact> contact = contactRepository.findById(security.get().getContact().getIdContact());
				

				if (contact.isPresent()) {
					ContactDTO contactDTO = contactMapper.contactToContactDTO(contact.get());
					return ResponseEntity.status(HttpStatus.OK).body((T) contactDTO);
				} else {
					return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
				}
			} else {
				return (ResponseEntity<T>) ResponseEntity.status(HttpStatus.BAD_REQUEST).body(USER_PASSWORD_INCORRECT.getError());
			}
		}

		return (ResponseEntity<T>) ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(USER_PASSWORD_INCORRECT.getError());
	}

	@Override
	public ResponseEntity<?> saveLoginLog(LoginDTO request) {
		LogLogin logLogin = logLoginMapper.loginDTOToLogLogin(request);
		
		try {
			logLoginRepository.save(logLogin);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}

}
