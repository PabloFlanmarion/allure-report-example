package com.example;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

@DisplayName("Class Test")
@Feature("Feature Nome")
public class ExemploTest {

	@Test
	@Story("Story")
	@Severity(SeverityLevel.CRITICAL)
	@DisplayName("Teste 1")
	void test1() {
		firstStep();
	}
	
	@Test
	@Story("Story 2")
	@Severity(SeverityLevel.CRITICAL)
	@DisplayName("Teste 2")
	void test2() {
		fail("Ixi, deu Ruim");
	}
	
	@Test
	@Story("Story 2")
	@Severity(SeverityLevel.CRITICAL)
	@DisplayName("Teste 3")
	void test3() {
		firstStep();
	}

	@Step
	private void firstStep() {
	}

}
