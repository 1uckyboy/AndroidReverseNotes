package com.tencent.p177mm.p1088u;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.api.C32248f;
import com.tencent.p177mm.p634v.C44409b;
import p000a.C0220l;
import p000a.p005f.p007b.C25052j;

@C0220l(dWo = {1, 1, 13}, dWp = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, dWq = {"Lcom/tencent/mm/engine/FunctionMsgTask;", "", "op", "", "item", "Lcom/tencent/mm/api/FunctionMsgItem;", "executor", "Lcom/tencent/mm/executor/IOpExecutor;", "(ILcom/tencent/mm/api/FunctionMsgItem;Lcom/tencent/mm/executor/IOpExecutor;)V", "mExecutor", "getMExecutor", "()Lcom/tencent/mm/executor/IOpExecutor;", "mItem", "getMItem", "()Lcom/tencent/mm/api/FunctionMsgItem;", "mOpCode", "getMOpCode", "()I", "equals", "", "other", "toString", "", "plugin-functionmsg_release"})
/* renamed from: com.tencent.mm.u.d */
public final class C44230d {
    final int czW;
    public final C32248f eAH;
    public final C44409b eAI;

    public C44230d(int i, C32248f c32248f, C44409b c44409b) {
        C25052j.m39376p(c32248f, "item");
        C25052j.m39376p(c44409b, "executor");
        AppMethodBeat.m2504i(35470);
        this.czW = i;
        this.eAH = c32248f;
        this.eAI = c44409b;
        AppMethodBeat.m2505o(35470);
    }

    public final String toString() {
        AppMethodBeat.m2504i(35468);
        String str = "FunctionMsgTask(mOpCode=" + this.czW + ", mItem=" + this.eAH + ')';
        AppMethodBeat.m2505o(35468);
        return str;
    }

    public final boolean equals(Object obj) {
        AppMethodBeat.m2504i(35469);
        if (obj instanceof C44230d) {
            boolean j = C25052j.m39373j(((C44230d) obj).eAH.mo52934Ai(), this.eAH.mo52934Ai());
            AppMethodBeat.m2505o(35469);
            return j;
        }
        AppMethodBeat.m2505o(35469);
        return false;
    }
}
