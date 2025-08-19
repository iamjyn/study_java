package com.study._32_Builder;

import lombok.*;

// 보일러 플레이트 코드들을 알아서 만들어 준다(롬복)
// 클래스정보를 메모리에 올릴 때 롬복이 간섭한다.
@Getter
@Setter
@AllArgsConstructor
@Data
@Builder
public class LombokMember {
    private String name;
    private int age;
    private String email;
}
