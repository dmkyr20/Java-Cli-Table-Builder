package org.dmkyr20.cli.table.types;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * The class describe a position of a {@link org.dmkyr20.cli.table.Cell} on a cli screen
 *
 * @author dmkyr20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CellPosition {
    private int leftTopX, leftTopY, rightBottomX, rightBottomY;

    public void setLeftTopX(int x) {
        if (isOnDisplay(x)) {
            this.leftTopX = x;
        }
    }

    public void setLeftTopY(int y) {
        if (isOnDisplay(y)) {
            this.leftTopY = y;
        }
    }

    public void setRightBottomX(int x) {
        if (isOnDisplay(x)) {
            this.rightBottomX = x;
        }
    }

    public void setRightBottomY(int y) {
        if (isOnDisplay(y)) {
            this.rightBottomY = y;
        }
    }

    private boolean isOnDisplay(int n) {
        return n > 0 ? true : false;
    }
}
