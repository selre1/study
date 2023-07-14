package com.bhb.book.study.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void lombokTest(){
        String name = "bang";
        int amount = 100;

        HelloResponseDto  helloResponseDto = new HelloResponseDto(name,amount);
        assertThat(helloResponseDto.getName()).isEqualTo(name);
    }
}
