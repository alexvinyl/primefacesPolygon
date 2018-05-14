package ru.okb.polygon.dto;

import java.text.SimpleDateFormat;
import java.util.*;

public class ChangelogService {
    private final static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public static List<Changelog> load(int count) {
        List<Changelog> logs = new ArrayList<>();
        long versionId = (long) (Math.random() * 10000);
        int i = 0;
        while (i < count) {
            Changelog log = new Changelog();
            log.setChangelogId(versionId++);
            log.setVersion("1.0." + i);
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(new Date());
            calendar.add(Calendar.DATE, -(count-i));
            log.setVersionDate(calendar.getTime());
            log.setTask("JFB-" + i++);
            log.setChange("Fixed an issue with the fan");
            log.setClassifierDate(calendar.getTime());
            logs.add(log);
        }
        return logs;
    }
}
