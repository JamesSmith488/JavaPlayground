package mockito;

import junit.Spartan;
import junit.SpartanRepository;
import org.junit.jupiter.api.*;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.Optional;

public class SpartanRepositoryTests {

    private Spartan mockSpartan;
    private Spartan james;

    @BeforeEach
    public void setup(){
        mockSpartan = Mockito.mock(Spartan.class);
        james = new Spartan(1,"James Smith", "Java", LocalDate.of(2021,11,29));
    }

    @AfterEach
    public void tearDown(){
        SpartanRepository.deleteAll();
    }

    @Nested
    @DisplayName("Demo")
    class demo {

        @Test
        @DisplayName("Mocking a Spartan")
        public void mockingASpartan() {
            SpartanRepository.addSpartan(mockSpartan);
            Mockito.when(mockSpartan.toString()).thenReturn("Found Mock Spartan");
            Mockito.doThrow(NullPointerException.class).when(mockSpartan).setId(Mockito.anyInt());
            System.out.println(mockSpartan.toString());
            Assertions.assertEquals("Found Mock Spartan\n", SpartanRepository.getAllSpartans());
        }

        @Test
        @DisplayName("Chain method calls with a mock")
        public void chainMethodCallsWithAMock() {
            Mockito.when(mockSpartan.getStartDate())
                    .thenReturn(LocalDate.now())
                    .thenReturn(LocalDate.MAX);
            System.out.println(mockSpartan.getStartDate());
            System.out.println(mockSpartan.getStartDate());
        }

        @Test
        @DisplayName("Using a spy")
        public void usingASpy() {
            Spartan spyJames = Mockito.spy(james);
            Mockito.when(spyJames.getName()).thenCallRealMethod();
        }

        @Test
        @DisplayName("Internal method call check")
        public void internalMethodCallCheck() {
            SpartanRepository.addSpartan(mockSpartan);
            System.out.println(SpartanRepository.findSpartan(1).isPresent());
            Mockito.verify(mockSpartan, Mockito.times(1)).getId();
        }

        @Test
        @DisplayName("Verify Order Of Operations")
        public void verifyOrderOfOperations() {
            mockSpartan.setName("Kieran");
            mockSpartan.setCourse("C++");
            System.out.println(mockSpartan.getName() + "" + mockSpartan.getCourse());
            InOrder inOrder = Mockito.inOrder(mockSpartan);
            inOrder.verify(mockSpartan).setName("Kieran");
            inOrder.verify(mockSpartan).setCourse("C++");
            inOrder.verify(mockSpartan).getName();
            inOrder.verify(mockSpartan).getCourse();
        }

        @Test
        @DisplayName("Test Argument Catcher")
        public void testArgumentCatcher() {
            ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
            mockSpartan.setName("Kieran");
            Mockito.verify(mockSpartan).setName(captor.capture());
            System.out.println(captor.getValue());
        }

    }

    @Nested
    @DisplayName("Tests for the Spartan Repository")
    class SpartanRepoTests{

        @Test
        @DisplayName("Find Spartan test")
        public void findSpartanTest(){
            SpartanRepository.addSpartan(mockSpartan);
            Mockito.when(mockSpartan.getId()).thenReturn(2);
            Assertions.assertEquals(Optional.of(mockSpartan),SpartanRepository.findSpartan(2));
        }

        @Test
        @DisplayName("Remove Spartan test")
        public void removeSpartanTest(){
            SpartanRepository.addSpartan(mockSpartan);
            Mockito.when(mockSpartan.getId()).thenReturn(2);
            Assertions.assertEquals(true,SpartanRepository.removeSpartan(2));
        }

        @Test
        @DisplayName("Get all Spartans test")
        public void getAllSpartansTest(){
            SpartanRepository.addSpartan(mockSpartan);
            Mockito.when(mockSpartan.toString()).thenReturn("Found Mock Spartan");
            Assertions.assertEquals("Found Mock Spartan\n", SpartanRepository.getAllSpartans());
        }

    }

}
