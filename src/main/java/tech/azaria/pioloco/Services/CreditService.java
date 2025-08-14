package tech.azaria.pioloco.Services;

import org.springframework.stereotype.Service;
import tech.azaria.pioloco.Repositories.CreditRepository;

@Service
public class CreditService {
    private  final CreditRepository creditRepository;
    private final UserService userService;

    public CreditService(CreditRepository creditRepository,UserService userService){
        this.creditRepository=creditRepository;
        this.userService=userService;
    }

}
