package ru.okb.polygon.beans;

import ru.okb.polygon.dto.ComplaintReason;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.util.List;

@lombok.Setter
@lombok.Getter
@ManagedBean(name = "mainBean")
@ViewScoped
public class MainBean {
    private List<ComplaintReason> reasons;
    private ComplaintReason selectedReason;

    private String inputOne;
    private String inputTwo;
    private boolean buttonDisabled = true;


    public MainBean() {
    }

    public void init() {
    }

    public void showMessage() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Всплывашка", "GrowlMessage"));
    }

    public void doLog(String string) {
        System.out.println(string);
    }

    public void doLogWithArg() {
        String string = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("argument");
        System.out.println(string);
    }

    public void pageEvent() {
        System.out.println("pageEvent");
    }

    private boolean userOnline;
    private String currentRoleName = "ROLE " + ((int) (Math.random() * 100));
}
