package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class agx extends bsr {
    public SKBuiltinBuffer_t vLz;
    public int wns;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(58906);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.vLz == null) {
                bVar = new b("Not all required fields were included: RandomEncryKey");
                AppMethodBeat.o(58906);
                throw bVar;
            }
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            if (this.vLz != null) {
                aVar.iy(2, this.vLz.computeSize());
                this.vLz.writeFields(aVar);
            }
            aVar.iz(3, this.wns);
            AppMethodBeat.o(58906);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.vLz != null) {
                ix += e.a.a.a.ix(2, this.vLz.computeSize());
            }
            int bs = ix + e.a.a.b.b.a.bs(3, this.wns);
            AppMethodBeat.o(58906);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.vLz == null) {
                bVar = new b("Not all required fields were included: RandomEncryKey");
                AppMethodBeat.o(58906);
                throw bVar;
            }
            AppMethodBeat.o(58906);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            agx agx = (agx) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        hl hlVar = new hl();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        agx.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(58906);
                    return 0;
                case 2:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        SKBuiltinBuffer_t sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(aVar4, sKBuiltinBuffer_t, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        agx.vLz = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.o(58906);
                    return 0;
                case 3:
                    agx.wns = aVar3.BTU.vd();
                    AppMethodBeat.o(58906);
                    return 0;
                default:
                    AppMethodBeat.o(58906);
                    return -1;
            }
        } else {
            AppMethodBeat.o(58906);
            return -1;
        }
    }
}
