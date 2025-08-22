package tech.azaria.pioloco.Services;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import tech.azaria.pioloco.Entities.Postuler;
import tech.azaria.pioloco.Repositories.PostuleRepository;

@Service
public class PostulerService {
    private final PostuleRepository postuleRepository;
    private final UserService userService;
    private final BienImmobilierService bienImmobilierService;

    public PostulerService(PostuleRepository postuleRepository,UserService userService,BienImmobilierService bienImmobilierService){
        this.bienImmobilierService=bienImmobilierService;
        this.postuleRepository=postuleRepository;
        this.userService=userService;
    }
    @Transactional
    public Postuler save(Postuler postuler){
        postuleRepository.save(postuler);
    }


}
