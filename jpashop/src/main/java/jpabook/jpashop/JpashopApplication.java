package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {
		if (isBuildFailConditionMet()) {
			throw new RuntimeException("빌드 실패 조건이 충족되었습니다.");
		}

		SpringApplication.run(JpashopApplication.class, args);
	}

	private static boolean isBuildFailConditionMet() {
		// 빌드 실패 조건을 여기에 추가할 수 있습니다.
		// 예: 환경 변수가 특정 값일 때, 특정 파일이 존재할 때 등
		return true; // 실패 조건이 충족되면 true로 설정
	}
}
