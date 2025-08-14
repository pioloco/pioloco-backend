package tech.azaria.pioloco.Services;

import org.springframework.stereotype.Service;
import tech.azaria.pioloco.Repositories.DocumentRepository;

@Service
public class DocumentService {
    private  final DocumentRepository documentRepository;
    public DocumentService(DocumentRepository documentRepository){
        this.documentRepository=documentRepository;
    }

}
