package com.taopao.rxdialog.callback;

import android.support.annotation.NonNull;

import com.taopao.rxdialog.DialogAction;
import com.taopao.rxdialog.RxDialog;

/**
 * @Author：淘跑
 * @Date: 2018/12/21 17:11
 * @Use：
 */
public interface SingleButtonCallback {
    void onClick(@NonNull RxDialog dialog, @NonNull DialogAction which);
}
