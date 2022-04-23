import static org.junit.Assert.*;
import java.beans.Transient;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.*;

import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void markdownParseTest() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        testList.add("https://something.com");
        testList.add("some-page.html");
        assertEquals(testList, links);
    }
}