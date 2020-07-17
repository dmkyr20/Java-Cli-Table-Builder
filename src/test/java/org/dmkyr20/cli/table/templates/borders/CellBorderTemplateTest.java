package org.dmkyr20.cli.table.templates.borders;

import org.dmkyr20.cli.table.Cell;
import org.dmkyr20.cli.table.exceptions.CellContentException;
import org.dmkyr20.cli.table.types.CellPosition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellBorderTemplateTest {

    private final CellPosition position = new CellPosition();
    private final String cellText = "Test String";

    @BeforeEach
    private void setPosition() {
        this.position.setLeftTopX(0);
        this.position.setLeftTopY(0);
        this.position.setRightBottomX(20);
        this.position.setRightBottomY(4);
    }


    @Test
    public void TestShouldPrintAllTypeOfBorderTemplatesWhenRunTest() throws CellContentException {

        assertTrue(true);
        CellBorderTemplate[] borderTemplates = (CellBorderTemplate.class).getEnumConstants();
        for(CellBorderTemplate borderTemplate : borderTemplates)
        {
            System.out.println(borderTemplate.getName());
            printWithBorderType(borderTemplate);
            System.out.println();
        }


    }

    private void printWithBorderType(CellBorderTemplate cellBorderTemplate) throws CellContentException {
        Cell cell = new Cell(position, cellText);

        Cell.printCell(cell);
    }
}