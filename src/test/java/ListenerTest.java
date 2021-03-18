import com.project.pratice.editor.Editor;
import com.project.pratice.listener.impl.MessageSaveListener;
import com.project.pratice.listener.impl.OperateLogListener;

public class ListenerTest {
    public static void main(String[] args) {
        Editor editor = new Editor();
        //注册监听器
        editor.events.subscribe("save",new OperateLogListener("保存"));
        editor.events.subscribe("send",new MessageSaveListener("发送日志"));

        //具体操作
        editor.sendMessage("2222222");
        editor.saveMessage();
    }
}
