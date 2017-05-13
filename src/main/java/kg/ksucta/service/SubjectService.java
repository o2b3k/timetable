package kg.ksucta.service;

import kg.ksucta.domain.model.Subject;

/**
 * Created by o2b3k on 5/13/17.
 */
public interface SubjectService {
    public void saveSubject(Subject subject);

    Iterable<Subject> listAllSubject();

    Subject getSubjectById(Long id);

    void deleteSubject(Long id);
}
