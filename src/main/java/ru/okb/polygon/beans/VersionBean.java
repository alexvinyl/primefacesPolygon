package ru.okb.polygon.beans;

import ru.okb.polygon.dto.Changelog;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "versionBean")
public class VersionBean {
    private Changelog changelog;
}
