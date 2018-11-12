package com.ckr.upgrade;

import android.content.Context;
import android.support.annotation.NonNull;

import com.ckr.upgrade.permission.PermissionListener;


/**
 * Created by ckr on 2018/10/8.
 */

public interface BaseContext extends PermissionListener {
    @NonNull
    Context getContext();
}
