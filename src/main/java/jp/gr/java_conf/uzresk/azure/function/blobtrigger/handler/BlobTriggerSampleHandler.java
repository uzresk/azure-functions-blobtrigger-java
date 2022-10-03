package jp.gr.java_conf.uzresk.azure.function.blobtrigger.handler;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.annotation.BindingName;
import com.microsoft.azure.functions.annotation.BlobTrigger;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.StorageAccount;

public class BlobTriggerSampleHandler {

    @FunctionName("blobTrigger")
    @StorageAccount("storageAccountConnectionString")
    public void run(
            @BlobTrigger(name = "content", path = "items/{name}", dataType = "binary", source = "EventGrid") byte[] content,
            @BindingName("name") String name,
            final ExecutionContext context
    ) {
        context.getLogger().info("Java Blob trigger function processed a blob. Name: "
                + name + "\n  Size: "
                + content.length + " Bytes");
    }
}
