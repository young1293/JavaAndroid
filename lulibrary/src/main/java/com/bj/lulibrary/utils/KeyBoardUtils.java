package com.bj.lulibrary.utils;

import android.app.Service;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * lucky 2018/11/30
 * 2018 10:42
 * keyboard：键盘
 */
public class KeyBoardUtils {
    /**
     * 隐藏键盘
     */
    public static void hideSoftInput(Context mContext) {
        InputMethodManager imm = (InputMethodManager) mContext.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
    }

    /**
     * 显示键盘
     */
    public static void showSoftInput(EditText et) {
        InputMethodManager inputManager =
                (InputMethodManager) et.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.showSoftInput(et, 0);
    }
    /**
     * 隐藏键盘
     */
    public static void hideSoftInput(final View view) {
        InputMethodManager inputManager = (InputMethodManager) view.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /**
     * 显示键盘
     */
    public static void showSoftInput(final View view) {
        InputMethodManager inputManager = (InputMethodManager) view.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.showSoftInput(view, 0);
    }


    /**
     * 隐藏输入键盘 (推荐使用)
     */
    public static void hideSoftBord(Context context, EditText mEditText) {
        if(mEditText!=null){
            InputMethodManager inputMethodManager = (InputMethodManager) context
                    .getSystemService(Service.INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(mEditText.getWindowToken(),0);
        }
    }

    /**
     * 弹出键盘
     * @param editText
     */
    public static void showSoftMode( EditText editText){
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        InputMethodManager inputManager = (InputMethodManager)editText.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.showSoftInput(editText, 0);
    }

}
