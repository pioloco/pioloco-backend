package tech.azaria.pioloco.Services;

import org.springframework.security.crypto.password.PasswordEncoder;
import tech.azaria.pioloco.Entities.Publication;
import tech.azaria.pioloco.Entities.User;
import tech.azaria.pioloco.Repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final DocumentService documentService;
    private ImageService imageService;

    public UserService(UserRepository userRepository, DocumentService documentService) {
        this.userRepository = userRepository;
        this.documentService=documentService;
    }
    //
    boolean userExist(Long id){
        return userRepository.existsById(id);
    }

    public User createUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new EmailAlreadyExistsException("Email " + user.getEmail() + " déjà utilisé");
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
    // liste des users
    public List<User> ListeUtilisateurs(){
        return  userRepository.findAll();
    }
    // liste des proprietaire
    public List<User> ListeProprietaire(String role){
        return userRepository.findByRole(role);
    }
    //recherche un user par son id
    public User getUserParId(Long id){
        return userRepository.findById(id).orElseThrow(() ->new RuntimeException("Utilisateur non trouve!"));
    }
    // rechercher un user par son email
    public User getUserParEmail(String email){
        return userRepository.findByEmail(email).orElseThrow(() -> new RuntimeException("utilisateur non present !!"));
    }



}
