package tech.azaria.pioloco.Repositories;

import tech.azaria.pioloco.Entities.BienImmobilier;
import tech.azaria.pioloco.Entities.User;
import tech.azaria.pioloco.Entities.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findByRole(String role);
    Optional<User> findById(Long id);
    // Trouver un user par email (pour l'authentification)
    Optional<User> findByEmail(String email);

    // verifie si un email existe deja
    boolean existsByEmail(String email);

    // Nombre de credits d'un utilisateur
  

    // Liste des biens publies par un utilisateur
    @Query("SELECT p.bienImmobilier FROM Publication p WHERE p.user.iduser = :userId")
    List<BienImmobilier> findBiensPublishedByUser(@Param("userId") Long userId);
    // Statistiques utilisateur
    @Query("SELECT COUNT(p) FROM Publication p WHERE p.user.iduser = :userId")
    int countPublicationsByUser(@Param("userId") Long userId);

    @Query("SELECT COUNT(po) FROM Postuler po WHERE po.user.iduser = :userId")
    int countPostulationsByUser(@Param("userId") Long userId);

    //Recherche les users en fonction des roles
    List<User> findByRole(Role role);
    // Rechercher les users en fonction de son mail et so role
    Optional<User> findByEmailAndRole(String email, Role role);


}
