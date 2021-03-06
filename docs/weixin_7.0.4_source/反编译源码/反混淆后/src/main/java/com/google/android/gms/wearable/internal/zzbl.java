package com.google.android.gms.wearable.internal;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.ChannelIOException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.OutputStream;
import javax.annotation.Nullable;

public final class zzbl extends OutputStream {
    @Nullable
    private volatile zzav zzcw;
    private final OutputStream zzcy;

    public zzbl(OutputStream outputStream) {
        AppMethodBeat.m2504i(71088);
        this.zzcy = (OutputStream) Preconditions.checkNotNull(outputStream);
        AppMethodBeat.m2505o(71088);
    }

    private final IOException zza(IOException iOException) {
        AppMethodBeat.m2504i(71094);
        zzav zzav = this.zzcw;
        if (zzav != null) {
            Log.isLoggable("ChannelOutputStream", 2);
            ChannelIOException channelIOException = new ChannelIOException("Channel closed unexpectedly before stream was finished", zzav.zzg, zzav.zzcj);
            AppMethodBeat.m2505o(71094);
            return channelIOException;
        }
        AppMethodBeat.m2505o(71094);
        return iOException;
    }

    public final void close() {
        AppMethodBeat.m2504i(71089);
        try {
            this.zzcy.close();
            AppMethodBeat.m2505o(71089);
        } catch (IOException iOException) {
            IOException iOException2 = zza(iOException2);
            AppMethodBeat.m2505o(71089);
            throw iOException2;
        }
    }

    public final void flush() {
        AppMethodBeat.m2504i(71090);
        try {
            this.zzcy.flush();
            AppMethodBeat.m2505o(71090);
        } catch (IOException iOException) {
            IOException iOException2 = zza(iOException2);
            AppMethodBeat.m2505o(71090);
            throw iOException2;
        }
    }

    public final void write(int i) {
        AppMethodBeat.m2504i(71093);
        try {
            this.zzcy.write(i);
            AppMethodBeat.m2505o(71093);
        } catch (IOException iOException) {
            IOException iOException2 = zza(iOException2);
            AppMethodBeat.m2505o(71093);
            throw iOException2;
        }
    }

    public final void write(byte[] bArr) {
        AppMethodBeat.m2504i(71091);
        try {
            this.zzcy.write(bArr);
            AppMethodBeat.m2505o(71091);
        } catch (IOException iOException) {
            IOException iOException2 = zza(iOException2);
            AppMethodBeat.m2505o(71091);
            throw iOException2;
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        AppMethodBeat.m2504i(71092);
        try {
            this.zzcy.write(bArr, i, i2);
            AppMethodBeat.m2505o(71092);
        } catch (IOException iOException) {
            IOException iOException2 = zza(iOException2);
            AppMethodBeat.m2505o(71092);
            throw iOException2;
        }
    }

    /* Access modifiers changed, original: final */
    public final void zzc(zzav zzav) {
        this.zzcw = zzav;
    }
}
