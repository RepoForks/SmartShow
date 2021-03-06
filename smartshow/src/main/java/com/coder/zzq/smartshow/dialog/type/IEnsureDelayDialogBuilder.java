package com.coder.zzq.smartshow.dialog.type;

import com.coder.zzq.smartshow.dialog.DialogBtnClickListener;

public interface IEnsureDelayDialogBuilder extends IMessageDialogBuilder<IEnsureDelayDialogBuilder> {
    IEnsureDelayDialogBuilder negativeBtn(String label, DialogBtnClickListener clickListener);

    IEnsureDelayDialogBuilder delay(int seconds);
}
