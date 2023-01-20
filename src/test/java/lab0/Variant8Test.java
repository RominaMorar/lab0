package lab0;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class Variant8Test {

    public static double EPS = 0.0000001;

    //////////////////////////////////////////
    @Test(dataProvider = "integerProvider")
    public void inputTest(int input, int expected) {
        assertEquals(new Variant8().integerNumbersTask(input), expected);
    }

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][]{{53, 35}, {26, 62}, {63, 36}};
    }

    //////////////////////////////////////////////////
    @Test(dataProvider = "booleanProvider")
    public void booleanTest(int A, int B, boolean p1) {
        assertEquals(new Variant8().booleanTask(A, B), p1);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][]{{1, 3, true}, {2, 4, false}, {5, 6, false}, {10, 12, false}};
    }
    ///////////////////////////////////////////////////

    @Test(dataProvider = "ifProvider")
    public void ifTest(int k1, int k2, double[] p1) {
        assertEquals(new Variant8().ifTask(k1, k2), p1);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][]{{4, 3, new double[]{4, 3}}, {2, 4, new double[]{4, 2}},
                {10, 50, new double[]{50, 10}}, {-5, 12, new double[]{12, -5}}};
    }

    ///////////////////////////////////////////////////
    @Test(dataProvider = "caseProvider")
    public void caseTest(int D, int M, double[] Date) {
        assertEquals(new Variant8().caseTask(D, M), Date);
    }

    @DataProvider
    public Object[][] caseProvider() {
        return new Object[][]{{1, 3, new double[]{28, 2}}, {27, 4, new double[]{26, 4}},
                {1, 1, new double[]{31, 12}}, {1, 5, new double[]{30, 4}}};
    }

    ///////////////////////////////////////////////////
    @Test(dataProvider = "forProvider")
    public void forTest(int A, int B, int result) {
        assertEquals(new Variant8().forTask(A, B), result);
    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][]{{2, 5, 120}, {1, 6, 720}, {4, 5, 20}};
    }

    ///////////////////////////////////////////////////
    @Test(dataProvider = "whileProvider")
    public void whileTest(int N, int K) {
        assertEquals(new Variant8().whileTask(N), K);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][]{{4, 2}, {10, 3}, {100, 10}};
    }

    ///////////////////////////////////////////////////
    @Test(dataProvider = "arrayProvider")
    public void arrayTest(int N, int arr[], int arr1[]) {
        assertEquals(new Variant8().arrayTask(N, arr), arr1);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][]{{3, new int[]{4, 3, 2}, new int[]{3}}, {4, new int[]{1, 2, 9, 7}, new int[]{7, 9}}, {2, new int[]{1, 2, 9, 7}, new int[]{7, 9}}};
    }
}


