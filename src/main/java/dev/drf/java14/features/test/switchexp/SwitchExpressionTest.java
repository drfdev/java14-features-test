package dev.drf.java14.features.test.switchexp;

import dev.drf.java14.features.test.FeatureTest;

public final class SwitchExpressionTest implements FeatureTest {
    @Override
    public void processTest() {
        checkBlock(Block.BRICK);
        checkBlock(Block.ROCK);
        checkBlock(Block.DONALD_DUCK);
    }

    private void checkBlock(Block value) {
        var result = switch (value) {
            case BRICK, ROCK -> "material";
            case DONALD_DUCK -> "duck";
            default -> "wtf ?";
        };
        System.out.println(result);
    }

    public enum Block {
        BRICK,
        ROCK,
        DONALD_DUCK
    }
}
