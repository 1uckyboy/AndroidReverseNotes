package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.ki */
public final class C23408ki extends bsr {
    public String ctj;
    public int offset;
    public String vNb;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(11706);
        C6092b c6092b;
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.vNb == null) {
                c6092b = new C6092b("Not all required fields were included: brand_user_name");
                AppMethodBeat.m2505o(11706);
                throw c6092b;
            }
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            if (this.vNb != null) {
                c6093a.mo13475e(2, this.vNb);
            }
            if (this.ctj != null) {
                c6093a.mo13475e(3, this.ctj);
            }
            c6093a.mo13480iz(4, this.offset);
            AppMethodBeat.m2505o(11706);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.vNb != null) {
                ix += C6091a.m9575f(2, this.vNb);
            }
            if (this.ctj != null) {
                ix += C6091a.m9575f(3, this.ctj);
            }
            int bs = ix + C6091a.m9572bs(4, this.offset);
            AppMethodBeat.m2505o(11706);
            return bs;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.vNb == null) {
                c6092b = new C6092b("Not all required fields were included: brand_user_name");
                AppMethodBeat.m2505o(11706);
                throw c6092b;
            }
            AppMethodBeat.m2505o(11706);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C23408ki c23408ki = (C23408ki) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        C7267hl c7267hl = new C7267hl();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = c7267hl.populateBuilderWithField(c6086a3, c7267hl, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c23408ki.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(11706);
                    return 0;
                case 2:
                    c23408ki.vNb = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(11706);
                    return 0;
                case 3:
                    c23408ki.ctj = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(11706);
                    return 0;
                case 4:
                    c23408ki.offset = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(11706);
                    return 0;
                default:
                    AppMethodBeat.m2505o(11706);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(11706);
            return -1;
        }
    }
}
