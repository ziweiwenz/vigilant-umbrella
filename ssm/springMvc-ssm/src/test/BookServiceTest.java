import com.song.config.SpringConfig;
import com.song.domain.Book;
import com.song.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author song
 * @version 1.0
 * Create by 2022/8/4 21:19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {
    @Autowired
    private BookService bookService;
    @Test
    public void testGetById(){
        Book book = bookService.getById(1);
        System.out.println(book);
    }
}
