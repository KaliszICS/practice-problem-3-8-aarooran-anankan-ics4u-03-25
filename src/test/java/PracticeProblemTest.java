import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


public class PracticeProblemTest {

@Test
@DisplayName("")
void fibonacciTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("fib", cArg);
  // Enter code here
    assertEquals(0, (int)method.invoke(null, 0));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void fibonacciTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("fib", cArg);
  // Enter code here
    assertEquals(1, (int)method.invoke(null, 1));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void fibonacciTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("fib", cArg);
  // Enter code here
    assertEquals(1, (int)method.invoke(null, 2));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void fibonacciTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("fib", cArg);
  // Enter code here
    assertEquals(1836311903, (int)method.invoke(null, 46));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void fibonacciTest5() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("fib", cArg);
  // Enter code here
    assertEquals(14930352, (int)method.invoke(null, 36));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void fibonacciTest6() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("fib", cArg);
  // Enter code here
    assertEquals(8, (int)method.invoke(null, 6));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void minCostClimbingStairsTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int[].class};
        Method method = testClass.getDeclaredMethod("minCostClimbingStairs", cArg);
  // Enter code here
  int[] cost = {};
    assertEquals(0, (int)method.invoke(null, cost));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened " + e);
}
}
@Test
@DisplayName("")
void minCostClimbingStairsTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int[].class};
        Method method = testClass.getDeclaredMethod("minCostClimbingStairs", cArg);
  // Enter code here
  int[] cost = {5};
    assertEquals(5, (int)method.invoke(null, cost));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened " + e);
}
}
@Test
@DisplayName("")
void minCostClimbingStairsTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int[].class};
        Method method = testClass.getDeclaredMethod("minCostClimbingStairs", cArg);
  // Enter code here
  int[] cost = {10, 15};
    assertEquals(10, (int)method.invoke(null, cost));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened " + e);
}
}
@Test
@DisplayName("")
void minCostClimbingStairsTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int[].class};
        Method method = testClass.getDeclaredMethod("minCostClimbingStairs", cArg);
  // Enter code here
  int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
    assertEquals(6, (int)method.invoke(null, cost));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened " + e);
}
}

@Test
@DisplayName("")
void minCostClimbingStairsTest5() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int[].class};
        Method method = testClass.getDeclaredMethod("minCostClimbingStairs", cArg);
  // Enter code here
  int[] cost = {10, 10, 10, 10, 10};
    assertEquals(20, (int)method.invoke(null, cost));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened " + e);
}
}
@Test
@DisplayName("")
void minCostClimbingStairsTest6() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int[].class};
        Method method = testClass.getDeclaredMethod("minCostClimbingStairs", cArg);
  // Enter code here
  int[] cost = {20, 5, 20, 5, 20};
    assertEquals(10, (int)method.invoke(null, cost));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened " + e);
}
}
@Test
@DisplayName("")
void minCostClimbingStairsTest7() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int[].class};
        Method method = testClass.getDeclaredMethod("minCostClimbingStairs", cArg);
  // Enter code here
  int[] cost = {1, 5, 10, 15, 20};
    assertEquals(20, (int)method.invoke(null, cost));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened " + e);
}
}
@Test
@DisplayName("")
void minCostClimbingStairsTest8() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int[].class};
        Method method = testClass.getDeclaredMethod("minCostClimbingStairs", cArg);
  // Enter code here
  int[] cost = {20, 15, 10, 5, 1};
    assertEquals(20, (int)method.invoke(null, cost));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened " + e);
}
}
@Test
@DisplayName("")
void minCostClimbingStairsTest9() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int[].class};
        Method method = testClass.getDeclaredMethod("minCostClimbingStairs", cArg);
  // Enter code here
  int[] cost = {0, 0, 0, 0};
    assertEquals(0, (int)method.invoke(null, cost));
}





    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened " + e);
}
}
}
