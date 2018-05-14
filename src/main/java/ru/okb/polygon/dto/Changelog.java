package ru.okb.polygon.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Changelog {
    private long changelogId;
    private String version;
    private Date versionDate;
    private String task;
    private String change;
    private Date classifierDate;
}
