package dev.drf.java14.features.test.textblock;

import dev.drf.java14.features.test.FeatureTest;

public final class TextBlockTest implements FeatureTest {
    @Override
    public void processTest() {
        String textBlock = """
                <html>
                    <head>
                        <title>Test block</title>
                    </head>
                    <body>
                        <div>
                            <h1>Hello!!!</h1>
                        </div>
                    </bdy>
                </html>
                """;

        System.out.println(textBlock);
    }
}
