package guru.springframework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

@ExtendWith(MockitoExtension.class)
public class JunitExtensionTest {

    @Mock
    Map<String, Object> mapMock33;

    @Test
    void testMock() {
        mapMock33.put("keyvalue", "foo");
        System.out.println(mapMock33.keySet() + " - "+ mapMock33.values());
    }



}
