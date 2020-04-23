/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.codeInsight.moveUpDown;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("kotlin/idea/testData/codeInsight/moveLeftRight")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class MoveLeftRightTestGenerated extends AbstractMoveLeftRightTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInMoveLeftRight() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("kotlin/idea/testData/codeInsight/moveLeftRight"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("annotationParams.kt")
    public void testAnnotationParams() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/moveLeftRight/annotationParams.kt");
    }

    @TestMetadata("basesList.kt")
    public void testBasesList() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/moveLeftRight/basesList.kt");
    }

    @TestMetadata("callArgs1.kt")
    public void testCallArgs1() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/moveLeftRight/callArgs1.kt");
    }

    @TestMetadata("callArgs2.kt")
    public void testCallArgs2() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/moveLeftRight/callArgs2.kt");
    }

    @TestMetadata("callArgs3.kt")
    public void testCallArgs3() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/moveLeftRight/callArgs3.kt");
    }

    @TestMetadata("callArgs4.kt")
    public void testCallArgs4() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/moveLeftRight/callArgs4.kt");
    }

    @TestMetadata("callArgs5.kt")
    public void testCallArgs5() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/moveLeftRight/callArgs5.kt");
    }

    @TestMetadata("funParams1.kt")
    public void testFunParams1() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/moveLeftRight/funParams1.kt");
    }

    @TestMetadata("funParams2.kt")
    public void testFunParams2() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/moveLeftRight/funParams2.kt");
    }

    @TestMetadata("funParams3.kt")
    public void testFunParams3() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/moveLeftRight/funParams3.kt");
    }

    @TestMetadata("funParams4.kt")
    public void testFunParams4() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/moveLeftRight/funParams4.kt");
    }

    @TestMetadata("indexArgs.kt")
    public void testIndexArgs() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/moveLeftRight/indexArgs.kt");
    }

    @TestMetadata("lambdaParams.kt")
    public void testLambdaParams() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/moveLeftRight/lambdaParams.kt");
    }

    @TestMetadata("typeArgs.kt")
    public void testTypeArgs() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/moveLeftRight/typeArgs.kt");
    }

    @TestMetadata("typeConstraints1.kt")
    public void testTypeConstraints1() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/moveLeftRight/typeConstraints1.kt");
    }

    @TestMetadata("typeConstraints2.kt")
    public void testTypeConstraints2() throws Exception {
        runTest("kotlin/idea/testData/codeInsight/moveLeftRight/typeConstraints2.kt");
    }
}
