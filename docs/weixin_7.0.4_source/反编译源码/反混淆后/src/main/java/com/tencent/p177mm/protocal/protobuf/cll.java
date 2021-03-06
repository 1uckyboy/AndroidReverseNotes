package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.cll */
public final class cll extends btd {
    public int pcX;
    public int ptD;
    public long ptF;
    public int ptw;
    public int ptx;
    public int pty;
    public bts vEB;
    public bts vEC;
    public String vRA;
    public String vRw;
    public bts xja;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(80204);
        C6092b c6092b;
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(80204);
                throw c6092b;
            } else if (this.xja == null) {
                c6092b = new C6092b("Not all required fields were included: ClientImgId");
                AppMethodBeat.m2505o(80204);
                throw c6092b;
            } else if (this.vEB == null) {
                c6092b = new C6092b("Not all required fields were included: FromUserName");
                AppMethodBeat.m2505o(80204);
                throw c6092b;
            } else if (this.vEC == null) {
                c6092b = new C6092b("Not all required fields were included: ToUserName");
                AppMethodBeat.m2505o(80204);
                throw c6092b;
            } else {
                if (this.BaseResponse != null) {
                    c6093a.mo13479iy(1, this.BaseResponse.computeSize());
                    this.BaseResponse.writeFields(c6093a);
                }
                c6093a.mo13480iz(2, this.ptD);
                if (this.xja != null) {
                    c6093a.mo13479iy(3, this.xja.computeSize());
                    this.xja.writeFields(c6093a);
                }
                if (this.vEB != null) {
                    c6093a.mo13479iy(4, this.vEB.computeSize());
                    this.vEB.writeFields(c6093a);
                }
                if (this.vEC != null) {
                    c6093a.mo13479iy(5, this.vEC.computeSize());
                    this.vEC.writeFields(c6093a);
                }
                c6093a.mo13480iz(6, this.ptw);
                c6093a.mo13480iz(7, this.ptx);
                c6093a.mo13480iz(8, this.pty);
                c6093a.mo13480iz(9, this.pcX);
                c6093a.mo13472ai(10, this.ptF);
                if (this.vRw != null) {
                    c6093a.mo13475e(11, this.vRw);
                }
                if (this.vRA != null) {
                    c6093a.mo13475e(12, this.vRA);
                }
                AppMethodBeat.m2505o(80204);
                return 0;
            }
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = C6087a.m9557ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += C6091a.m9572bs(2, this.ptD);
            if (this.xja != null) {
                ix += C6087a.m9557ix(3, this.xja.computeSize());
            }
            if (this.vEB != null) {
                ix += C6087a.m9557ix(4, this.vEB.computeSize());
            }
            if (this.vEC != null) {
                ix += C6087a.m9557ix(5, this.vEC.computeSize());
            }
            ix = ((((ix + C6091a.m9572bs(6, this.ptw)) + C6091a.m9572bs(7, this.ptx)) + C6091a.m9572bs(8, this.pty)) + C6091a.m9572bs(9, this.pcX)) + C6091a.m9578o(10, this.ptF);
            if (this.vRw != null) {
                ix += C6091a.m9575f(11, this.vRw);
            }
            if (this.vRA != null) {
                ix += C6091a.m9575f(12, this.vRA);
            }
            AppMethodBeat.m2505o(80204);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(80204);
                throw c6092b;
            } else if (this.xja == null) {
                c6092b = new C6092b("Not all required fields were included: ClientImgId");
                AppMethodBeat.m2505o(80204);
                throw c6092b;
            } else if (this.vEB == null) {
                c6092b = new C6092b("Not all required fields were included: FromUserName");
                AppMethodBeat.m2505o(80204);
                throw c6092b;
            } else if (this.vEC == null) {
                c6092b = new C6092b("Not all required fields were included: ToUserName");
                AppMethodBeat.m2505o(80204);
                throw c6092b;
            } else {
                AppMethodBeat.m2505o(80204);
                return 0;
            }
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            cll cll = (cll) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            C6086a c6086a3;
            boolean z;
            bts bts;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(c6086a3, baseResponse, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        cll.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.m2505o(80204);
                    return 0;
                case 2:
                    cll.ptD = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(80204);
                    return 0;
                case 3:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bts = new bts();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = bts.populateBuilderWithField(c6086a3, bts, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        cll.xja = bts;
                    }
                    AppMethodBeat.m2505o(80204);
                    return 0;
                case 4:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bts = new bts();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = bts.populateBuilderWithField(c6086a3, bts, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        cll.vEB = bts;
                    }
                    AppMethodBeat.m2505o(80204);
                    return 0;
                case 5:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bts = new bts();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = bts.populateBuilderWithField(c6086a3, bts, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        cll.vEC = bts;
                    }
                    AppMethodBeat.m2505o(80204);
                    return 0;
                case 6:
                    cll.ptw = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(80204);
                    return 0;
                case 7:
                    cll.ptx = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(80204);
                    return 0;
                case 8:
                    cll.pty = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(80204);
                    return 0;
                case 9:
                    cll.pcX = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(80204);
                    return 0;
                case 10:
                    cll.ptF = c6086a2.BTU.mo13459ve();
                    AppMethodBeat.m2505o(80204);
                    return 0;
                case 11:
                    cll.vRw = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(80204);
                    return 0;
                case 12:
                    cll.vRA = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(80204);
                    return 0;
                default:
                    AppMethodBeat.m2505o(80204);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(80204);
            return -1;
        }
    }
}
