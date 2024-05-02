package com.example.workmate.dto.ncpdto.direction;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class DirectionRoute {
    private Map<String, Object> summary;
    private List<List<Double>> path;
    private List<Object> section;
    private List<Object> guide;
}
