package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.avj */
public final class avj extends bsr {
    public String csB;
    public int kCo;
    public int scene;
    public String url;
    public String wzn;
    public String wzo;
    public int wzp;
    public int wzq;
    public String wzr;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(96250);
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            if (this.csB != null) {
                c6093a.mo13475e(2, this.csB);
            }
            if (this.wzn != null) {
                c6093a.mo13475e(3, this.wzn);
            }
            c6093a.mo13480iz(4, this.scene);
            if (this.url != null) {
                c6093a.mo13475e(5, this.url);
            }
            if (this.wzo != null) {
                c6093a.mo13475e(6, this.wzo);
            }
            c6093a.mo13480iz(7, this.kCo);
            c6093a.mo13480iz(8, this.wzp);
            c6093a.mo13480iz(9, this.wzq);
            if (this.wzr != null) {
                c6093a.mo13475e(10, this.wzr);
            }
            AppMethodBeat.m2505o(96250);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.csB != null) {
                ix += C6091a.m9575f(2, this.csB);
            }
            if (this.wzn != null) {
                ix += C6091a.m9575f(3, this.wzn);
            }
            ix += C6091a.m9572bs(4, this.scene);
            if (this.url != null) {
                ix += C6091a.m9575f(5, this.url);
            }
            if (this.wzo != null) {
                ix += C6091a.m9575f(6, this.wzo);
            }
            ix = ((ix + C6091a.m9572bs(7, this.kCo)) + C6091a.m9572bs(8, this.wzp)) + C6091a.m9572bs(9, this.wzq);
            if (this.wzr != null) {
                ix += C6091a.m9575f(10, this.wzr);
            }
            AppMethodBeat.m2505o(96250);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(96250);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            avj avj = (avj) objArr[1];
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
                        avj.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(96250);
                    return 0;
                case 2:
                    avj.csB = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(96250);
                    return 0;
                case 3:
                    avj.wzn = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(96250);
                    return 0;
                case 4:
                    avj.scene = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(96250);
                    return 0;
                case 5:
                    avj.url = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(96250);
                    return 0;
                case 6:
                    avj.wzo = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(96250);
                    return 0;
                case 7:
                    avj.kCo = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(96250);
                    return 0;
                case 8:
                    avj.wzp = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(96250);
                    return 0;
                case 9:
                    avj.wzq = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(96250);
                    return 0;
                case 10:
                    avj.wzr = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(96250);
                    return 0;
                default:
                    AppMethodBeat.m2505o(96250);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(96250);
            return -1;
        }
    }
}
