package rx.example.dahei.qqcomment.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import rx.example.dahei.qqcomment.R;
import rx.example.dahei.qqcomment.comment.CommentFun;
import rx.example.dahei.qqcomment.comment.CustomTagHandler;
import rx.example.dahei.qqcomment.model.*;

/**
 * Created by huangziwei on 16-4-12.
 */
public class MainAdapter extends BaseAdapter {

    private ArrayList<Moment> mList;
    private Context mContext;
    private CustomTagHandler mTagHandler;

    public MainAdapter(Context context, ArrayList<Moment> list, CustomTagHandler tagHandler) {
        mList = list;
        mContext = context;
        mTagHandler = tagHandler;
    }

    @Override
    public int getCount() {
        // heanderView
        return mList.size() + 1;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
                convertView = View.inflate(mContext, R.layout.item_moment, null);
                ViewHolder holder = new ViewHolder();
                holder.mCommentList = (LinearLayout) convertView.findViewById(R.id.comment_list);
                holder.mBtnInput = convertView.findViewById(R.id.btn_input_comment);
                convertView.setTag(holder);
        }
            ViewHolder holder = (ViewHolder) convertView.getTag();
            //将评论的内容显示在界面上
            CommentFun.parseCommentList(mContext, mList.get(position).mComment,
                        holder.mCommentList, holder.mBtnInput, mTagHandler);
        return convertView;
    }

    private static class ViewHolder {
        LinearLayout mCommentList;
        View mBtnInput;
    }
}
