package com.bhb.book.study.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class ProfileController {
    private final Environment evn;

    @GetMapping("/profile")
    public String profile(){
        List<String> profiles = Arrays.asList(evn.getActiveProfiles());
        List<String> realProfiles = Arrays.asList("real1","real2");
        String defaultProfile = profiles.isEmpty()?"default":profiles.get(0);

        return profiles.stream()
                .filter(realProfiles::contains)
                .findAny()
                .orElse(defaultProfile);
    }
}
