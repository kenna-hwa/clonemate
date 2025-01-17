package com.ndex.clonemate.user.web.dto;

import com.ndex.clonemate.user.domain.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserResponseDto {
    private String id;
    private String name;
    private String introText;
    private char emailSearchYn;
    private char randomYn;

    @Builder
    public UserResponseDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.introText = user.getIntroText();
        this.emailSearchYn = user.getEmailSearchYn();
        this.randomYn = user.getRandomYn();
    }
}
