package com.example.workmate.dto.ncpdto.rgeocoding;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class RGeoNcpResponse {
    private Map<String, String> status;
    private List<RGeoResult> results;
}
