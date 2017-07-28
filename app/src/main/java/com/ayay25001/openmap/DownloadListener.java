package com.ayay25001.openmap;

/**
 * Created by toothwind on 2017/7/27.
 * you can contact me at : toothwind@163.com.
 * All Rights Reserved
 */
public interface DownloadListener {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPause();

    void onCanceled();

}
