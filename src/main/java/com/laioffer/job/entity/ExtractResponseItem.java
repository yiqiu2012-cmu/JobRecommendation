package com.laioffer.job.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
//each request returns a ExtractResponseItem[], in which there is a list of extractions
public class ExtractResponseItem {
    public List<Extraction> extractions;
}
