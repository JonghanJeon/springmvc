package hello.springmvc.basic;

import lombok.Data;

//@Getter, @Setter 등 자동으로 생성
@Data
public class HelloData {
	private String username;
	private int age;
}
