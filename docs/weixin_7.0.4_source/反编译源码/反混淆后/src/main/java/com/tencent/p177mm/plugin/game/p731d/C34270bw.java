package com.tencent.p177mm.plugin.game.p731d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.plugin.game.d.bw */
public final class C34270bw extends C1331a {
    public String Title;
    public String mZm;
    public String naq;
    public String ncC;
    public String ncF;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(111630);
        C6092b c6092b;
        int f;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.Title == null) {
                c6092b = new C6092b("Not all required fields were included: Title");
                AppMethodBeat.m2505o(111630);
                throw c6092b;
            }
            if (this.ncC != null) {
                c6093a.mo13475e(1, this.ncC);
            }
            if (this.Title != null) {
                c6093a.mo13475e(2, this.Title);
            }
            if (this.naq != null) {
                c6093a.mo13475e(3, this.naq);
            }
            if (this.mZm != null) {
                c6093a.mo13475e(4, this.mZm);
            }
            if (this.ncF != null) {
                c6093a.mo13475e(5, this.ncF);
            }
            AppMethodBeat.m2505o(111630);
            return 0;
        } else if (i == 1) {
            if (this.ncC != null) {
                f = C6091a.m9575f(1, this.ncC) + 0;
            } else {
                f = 0;
            }
            if (this.Title != null) {
                f += C6091a.m9575f(2, this.Title);
            }
            if (this.naq != null) {
                f += C6091a.m9575f(3, this.naq);
            }
            if (this.mZm != null) {
                f += C6091a.m9575f(4, this.mZm);
            }
            if (this.ncF != null) {
                f += C6091a.m9575f(5, this.ncF);
            }
            AppMethodBeat.m2505o(111630);
            return f;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (f = C1331a.getNextFieldNumber(c6086a); f > 0; f = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, f)) {
                    c6086a.ems();
                }
            }
            if (this.Title == null) {
                c6092b = new C6092b("Not all required fields were included: Title");
                AppMethodBeat.m2505o(111630);
                throw c6092b;
            }
            AppMethodBeat.m2505o(111630);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C34270bw c34270bw = (C34270bw) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    c34270bw.ncC = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(111630);
                    return 0;
                case 2:
                    c34270bw.Title = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(111630);
                    return 0;
                case 3:
                    c34270bw.naq = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(111630);
                    return 0;
                case 4:
                    c34270bw.mZm = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(111630);
                    return 0;
                case 5:
                    c34270bw.ncF = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(111630);
                    return 0;
                default:
                    AppMethodBeat.m2505o(111630);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(111630);
            return -1;
        }
    }
}
