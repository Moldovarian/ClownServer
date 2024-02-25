package moldovarian;

import com.vdurmont.emoji.EmojiManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clown")
public class ClownController {
    @GetMapping
    public String getClown() {
        return "You're a " + EmojiManager.getForAlias("clown").getUnicode();
    }
}
