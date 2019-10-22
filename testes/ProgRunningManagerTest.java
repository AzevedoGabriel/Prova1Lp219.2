import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProgRunningManagerTest {
	
	private ProgRunningManager prm;
	@BeforeEach
	void setUp() {
		prm = new ProgRunningManager();
	}

	@Test
	void testContarChipsCorrida() {
		prm.cadastrarCorrida("Corrida01", "25/03/5879", 10);
		prm.cadastrarChipCorrida("COrrida01");
		assertEquals(prm.contarChipsCorrida("Corrida01"), 1);
	}

	@Test
	void testExibirCorredor() {
		prm.cadastrarCorrida("Corrida02", "2/24/1236", 5);
		prm.cadastrarCorrida("Corrida03", "6/12/1236", 7);
		prm.cadastrarChipCorrida("Corrida02");
		prm.cadastrarChipCorrida("Corrida03");
		assertEquals(prm.exibirCorredor("Corrida02", 0),"0 - 0km - 0min" );
		assertEquals(prm.exibirCorredor("Corrida03", 0),"1 - 0km - 0min" );
	}

}
