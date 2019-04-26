package com.tw.gurgaon;

import java.util.List;

public interface PrintStrategy {
    List<String> print(List<Label> labels);
}