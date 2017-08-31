package rx.example.dahei.qqcomment.model;

import java.util.ArrayList;

/**
 * 评论对象
 */
public class Moment {

    public String mContent;//动态名
    public ArrayList<Comment> mComment; // 评论列表

    public Moment(String mContent, ArrayList<Comment> mComment) {
        this.mComment = mComment;
        this.mContent = mContent;
    }
}
