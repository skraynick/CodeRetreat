package gameoflife;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CellTest {

    private Cell cell;

    @Before
    public void setUp() throws Exception {
        cell = new Cell(0);
    }

    @Test
    public void cellWithLessThanTwoNeighboursShouldDie() {
        cell.setNeighbours(2);
        assertFalse(cell.cellWithLessThanTwoFirendsDies());
    }

}
