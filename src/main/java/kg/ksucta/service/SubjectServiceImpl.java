package kg.ksucta.service;

import kg.ksucta.domain.model.Subject;
import kg.ksucta.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by o2b3k on 5/13/17.
 */
@Service("subjectService")
public class SubjectServiceImpl implements SubjectService{
    @Qualifier("subjectRepository")

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public void saveSubject(Subject subject) {
        subjectRepository.save(subject);
    }

    @Override
    public Iterable<Subject> listAllSubject() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject getSubjectById(Long id) {
        return subjectRepository.findOne(id);
    }

    @Override
    public void deleteSubject(Long id) {
        subjectRepository.delete(id);
    }
}
