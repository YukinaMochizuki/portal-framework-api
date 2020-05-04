package tw.yukina.portalframework.api.input;

import java.util.Map;

public class PostResult {
    private PostStatus postStatus;
    private Map<String, Object> rawResult;

    public PostResult(PostStatus postStatus, Map<String, Object> rawResult) {
        this.postStatus = postStatus;
        this.rawResult = rawResult;
    }

    public PostStatus getPostStatus() {
        return postStatus;
    }

    public Map<String, Object> getRawResult() {
        return rawResult;
    }
}
