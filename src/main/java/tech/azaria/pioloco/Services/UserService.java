package tech.azaria.pioloco.Services;


import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import tech.azaria.pioloco.Entities.Credit;
import tech.azaria.pioloco.Entities.Publication;
import tech.azaria.pioloco.Entities.User;
import tech.azaria.pioloco.Entities.enums.Role;
import tech.azaria.pioloco.Repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final DocumentService documentService;
    private ImageService imageService;
    private final Credit credit;

    //
    boolean userExist(Long id){
        return userRepository.existsById(id);
    }
    // verification et mise a jout du role d'un utilisateur
    public void MettreAjourRole( User user){
        if(user.TotalCredit()>0 && user.getRole()!=Role.CLIENT) {
            user.setRole(Role.PROPRIETAIRE);
        }
    }
    @Transactional
    public User createUser(User user) {
        return userRepository.save(user);
    }
    public void deleteUser(User user){
        userRepository.delete(user);
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

    // user par son nom et son prenom passes en parametres
    public User getUserParNomPrenom(String nom , String prenom){
        return userRepository.findByNomAndPrenom(nom,prenom).orElseThrow(() ->new RuntimeException("cet utilisateur n'existe pas !!"));
    }
}
