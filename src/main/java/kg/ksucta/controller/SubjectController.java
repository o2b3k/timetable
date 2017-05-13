package kg.ksucta.controller;

import kg.ksucta.domain.model.Subject;
import kg.ksucta.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by o2b3k on 5/13/17.
 */
@Controller
public class SubjectController {
    private SubjectService subjectService;
    @Autowired
    public void setSubjectService(SubjectService subjectService){
        this.subjectService = subjectService;
    }

    /* List all subjects */
    @RequestMapping(value = "/subjects",method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("subject", subjectService.listAllSubject());
        return "subjects";
    }

    /* View subject */
    @RequestMapping(value = "/subjects/{id}")
    public String showSubject(@PathVariable Long id, Model model){
        model.addAttribute("subject",subjectService.getSubjectById(id));
        return "view";
    }

    /* Edit */
    @RequestMapping(value = "subjects/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("tuesday", subjectService.getSubjectById(id));
        return "subject_edit";
    }

    /*New subject*/
    @RequestMapping("subjects/new")
    public String newSubject(Model model) {
        model.addAttribute("subject", new Subject());
        return "subject_add";
    }

    /* Save */
    @RequestMapping(value = "subject", method = RequestMethod.POST)
    public String saveProduct(Subject subject) {
        subjectService.saveSubject(subject);
        return "redirect:/subjects/" + subject.getId();
    }

    /* Update */
    @RequestMapping(value = "subjects/{id}", method = RequestMethod.PUT)
    public String updateTuesday(Subject subject){
        subjectService.saveSubject(subject);
        return "redirect:/subjects/"+subject.getId();
    }

    /* Delete */
    @RequestMapping("tuesdays/delete/{id}")
    public String delete(@PathVariable Long id) {
        subjectService.deleteSubject(id);
        return "redirect:/subjects";
    }
}
