import java.beans.Transient;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
        Boolean test = null;
    }

    @Test
    public void markdownParseTest() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test1-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        testList.add("https://something.com");
        testList.add("some-page.html");
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest2() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test2-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        testList.add("https://youtube.com");
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest3() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test3-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest4() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test4-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest5() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        testList.add("https://something.com");
        testList.add("some-thing.html");
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest6() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        testList.add("https://something.com");
        testList.add("some-page.html");
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest7() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest8() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest9() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest10() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest11() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest12() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        testList.add("a link on the first line");
        assertEquals(testList, links);
    }

    @Test
    public void failTest() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        testList.add("a link on the first line");
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest13() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test-file9.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        testList.add("(Hello)");
        assertEquals(testList, links);
    }

    @Test
    public void labreporttest1() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("labreporttest1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        testList.add("`google.com");
        testList.add("google.com");
        testList.add("ucsd.edu");
        assertEquals(testList, links);
    }

    @Test
    public void labreporttest2() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("labreporttest2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        testList.add("a.com");
        testList.add("a.com(())");
        testList.add("example.com");
        assertEquals(testList, links);
    }

    @Test
    public void labreporttest3() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("labreporttest3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        testList.add("https://www.twitter.com");
        testList.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        testList.add("https://cse.ucsd.edu/");
        assertEquals(testList, links);
    }
}