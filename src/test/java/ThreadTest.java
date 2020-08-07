import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThreadTest {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        TaskTool task1 = new TaskTool("线程1", "12", true);
        
        TaskTool task2 = new TaskTool("线程2", "1", false);
        
        TaskTool task3 = new TaskTool("线程3", "6", true);

        CompletableFuture f1 = CompletableFuture.supplyAsync(() -> task1.callBack())
                .thenAccept((res)->dealRes(res));
        CompletableFuture f2 = CompletableFuture.supplyAsync(() -> task2.callBack())
                .thenAccept((res)->dealRes(res));
        CompletableFuture f3 = CompletableFuture.supplyAsync(() -> task3.callBack())
                .thenAccept((res)->dealRes(res));
        System.out.println(f1.get());
        System.in.read();

    }
    private static class  TaskTool{
        
        private String taskName;
        
        private String time;
        
        private boolean res;

        public TaskTool(String taskName, String time, boolean res) {
            this.taskName = taskName;
            this.time = time;
            this.res = res;
        }
        public boolean callBack(){
            try {
                Thread.sleep(Long.parseLong(time));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf(taskName+"taskRun.....");
            return res;
        }
    }
    private static void dealRes(boolean res){
        if (!res){
            System.out.println("线程异常");
        }
    }

}
