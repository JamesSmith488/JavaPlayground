package junit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class SpartanTests {

    private Spartan spartan;

    @BeforeAll
    static void setupAll(TestInfo testInfo){
        System.out.println(testInfo.getTestClass() + " executing");
    }

    @BeforeEach
    void setup(TestInfo testInfo){
        spartan = new Spartan(1,"James Smith", "Java", LocalDate.of(2021,11,29));
        System.out.println(testInfo.getDisplayName() + " is being tested");
    }

    @Test
    @DisplayName("Spartan id is 1")
    public void spartanIdTest(){
        Assertions.assertEquals(1,spartan.getId());
    }

    @Test
    @DisplayName("Spartan id is 2")
    public void spartanSetIdTest(){
        spartan.setId(2);
        Assertions.assertEquals(2,spartan.getId());
    }

    @Test
    @DisplayName("Spartan is called James Smith")
    public void spartanNameTest(){
        Assumptions.assumeTrue(spartan.getName() != null);
        Assertions.assertEquals("James Smith",spartan.getName());
    }

    @Test
    @DisplayName("Spartan is called Joe Bloggs")
    public void spartanSetNameTest(){
        spartan.setName("Joe Bloggs");
        Assumptions.assumeTrue(spartan.getName() != null);
        Assertions.assertEquals("Joe Bloggs",spartan.getName());
    }

    @Test
    @DisplayName("Spartan is on java course")
    public void spartanCourseTest(){
        Assumptions.assumeTrue(spartan.getCourse() != null);
        Assertions.assertEquals("Java",spartan.getCourse());
    }

    @Test
    @DisplayName("Spartan is on C++ course")
    public void spartanSetCourseTest(){
        spartan.setCourse("C++");
        Assumptions.assumeTrue(spartan.getCourse() != null);
        Assertions.assertEquals("C++",spartan.getCourse());
    }

    @Test
    @DisplayName("Spartan started on Nov 29 2021")
    public void spartanStartDateTest(){
        Assumptions.assumeTrue(spartan.getStartDate() != null);
        Assertions.assertEquals(LocalDate.of(2021,11,29),spartan.getStartDate());
    }

    @Test
    @DisplayName("Spartan started on Dec 4 2020")
    public void spartanSetStartDateTest(){
        spartan.setStartDate(LocalDate.of(2020,12,4));
        Assumptions.assumeTrue(spartan.getStartDate() != null);
        Assertions.assertEquals(LocalDate.of(2020,12,4),spartan.getStartDate());
    }

    @Test
    @DisplayName("Spartan start date is not past current date")
    public void spartanStartDateNotFutureTest(){
        Assertions.assertTrue(spartan.getStartDate().isBefore(LocalDate.now()));
    }

    @Test
    @DisplayName("toString test")
    public void spartanToStringTest(){
        Assertions.assertEquals("Spartan{id=1, name='James Smith', course='Java', startDate=2021-11-29}",spartan.toString());
    }

    @Test
    @DisplayName("toString test 2")
    public void spartanToStringTest2(){
        spartan.setId(2);
        spartan.setName("Joe Bloggs");
        spartan.setCourse("C++");
        spartan.setStartDate(LocalDate.of(2020,12,4));
        Assertions.assertEquals("Spartan{id=2, name='Joe Bloggs', course='C++', startDate=2020-12-04}",spartan.toString());
    }

    @AfterEach
    void tearDown(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName() + " has finished testing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo){
        System.out.println(testInfo.getTestClass() + " completed");
    }

}
