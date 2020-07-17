package org.dmkyr20.cli.table.types;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.function.BiFunction;

/**
 * The class describe a vertical text alignment in a {@link org.dmkyr20.cli.table.Cell}
 *
 * @author dmkyr20
 */
@RequiredArgsConstructor
public enum CellVerticalAlignment {
    TOP((textParts, height) -> {
        while (textParts.size() < height) {
            textParts.add(" ");
        }
        return textParts;
    }),
    MIDDLE((textParts, height) -> {
        for (boolean flag = true; textParts.size() < height; flag = !flag) {
            if (!flag) {
                textParts.add(0, " ");
            } else {
                textParts.add(" ");
            }
        }
        return textParts;
    }),
    BOTTOM((textParts, height) -> {
        while (textParts.size() < height) {
            textParts.add(0, " ");
        }
        return textParts;
    });

    @Getter
    private final BiFunction<List<String>, Integer, List<String>> function;
}
