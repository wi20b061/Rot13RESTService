import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void test_Given_WeWantToSeeAWeclomeMessage_When_WeGetTheMessage_Then_TheMessageShouldBeExactlyHelloRoot13(){
        //arrange

        //act
        String actual = Main.message();

        //assert
        Assertions.assertEquals("hello rot13", actual);
    }
    //38:22
}
