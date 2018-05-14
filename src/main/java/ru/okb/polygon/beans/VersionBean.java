package ru.okb.polygon.beans;

import ru.okb.polygon.dto.Changelog;
import ru.okb.polygon.dto.ChangelogService;

import javax.faces.bean.ManagedBean;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.List;

@ManagedBean(name = "versionBean")
public class VersionBean {
    private List<Changelog> logs;
    private Changelog latestLog;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public VersionBean() {
        logs = ChangelogService.load(15);
        logs.sort(Comparator.comparing(Changelog::getChangelogId).reversed());
        latestLog = logs.get(0);
    }

    public String getLatestVersion() {
        return latestLog.getVersion();
    }

    public String getLatestDate() {
        return dateFormat.format(latestLog.getVersionDate());
    }

    public String getClassifierDate() {
        return dateFormat.format(latestLog.getClassifierDate());
    }

    public List<Changelog> getLogs() {
        return logs;
    }
}

