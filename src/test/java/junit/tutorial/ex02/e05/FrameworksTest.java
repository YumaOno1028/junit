package junit.tutorial.ex02.e05;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FrameworksTest {

	@ParameterizedTest
	@CsvSource({ "GlassFish,Oracle", "GlassFish,DB2", "GlassFish,PostgreSQL", "GlassFish,MySQL" })
	void test(ApplicationServer ap, Database da) {
		boolean result = Frameworks.isSupport(ap, da);
		assertTrue(result);
	}

	@ParameterizedTest
	@CsvSource({ "JBoss,DB2", "JBoss,PostgreSQL" })
	void test2(ApplicationServer ap, Database da) {
		boolean result = Frameworks.isSupport(ap, da);
		assertTrue(result);
	}

	@ParameterizedTest
	@CsvSource({ "JBoss,Oracle", "JBoss,MySQL" })
	void test3(ApplicationServer ap, Database da) {
		boolean result = Frameworks.isSupport(ap, da);
		assertFalse(result);
	}

	@ParameterizedTest
	@CsvSource({ "Tomcat,MySQL" })
	void test4(ApplicationServer ap, Database da) {
		boolean result = Frameworks.isSupport(ap, da);
		assertTrue(result);
	}

	@ParameterizedTest
	@CsvSource({ "Tomcat,Oracle", "Tomcat,DB2", "Tomcat,PostgreSQL" })
	void test5(ApplicationServer ap, Database da) {
		boolean result = Frameworks.isSupport(ap, da);
		assertFalse(result);
	}

}
