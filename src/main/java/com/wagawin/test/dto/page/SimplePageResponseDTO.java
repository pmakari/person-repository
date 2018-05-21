package com.wagawin.test.dto.page;

import com.wagawin.test.dto.BaseResponseDTO;
import java.util.List;

/**
 *
 * @author parvizmakarti@gmail.com
 */
public class SimplePageResponseDTO<T extends Object> extends BaseResponseDTO {

    private List<T> content;
    private long count;

    public List<T> getContent() {
        return content;
    }

    public SimplePageResponseDTO() {
    }

    public SimplePageResponseDTO(List<T> content, long count) {
        this.content = content;
        this.count = count;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

}
