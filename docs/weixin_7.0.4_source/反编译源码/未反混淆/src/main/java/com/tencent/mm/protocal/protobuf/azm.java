package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class azm extends bsr {
    public String csB;
    public azh wDv;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(10218);
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            if (this.csB != null) {
                aVar.e(10, this.csB);
            }
            if (this.wDv != null) {
                aVar.iy(20, this.wDv.computeSize());
                this.wDv.writeFields(aVar);
            }
            AppMethodBeat.o(10218);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.csB != null) {
                ix += e.a.a.b.b.a.f(10, this.csB);
            }
            if (this.wDv != null) {
                ix += e.a.a.a.ix(20, this.wDv.computeSize());
            }
            AppMethodBeat.o(10218);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(10218);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            azm azm = (azm) objArr[1];
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
                        azm.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(10218);
                    return 0;
                case 10:
                    azm.csB = aVar3.BTU.readString();
                    AppMethodBeat.o(10218);
                    return 0;
                case 20:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        azh azh = new azh();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = azh.populateBuilderWithField(aVar4, azh, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        azm.wDv = azh;
                    }
                    AppMethodBeat.o(10218);
                    return 0;
                default:
                    AppMethodBeat.o(10218);
                    return -1;
            }
        } else {
            AppMethodBeat.o(10218);
            return -1;
        }
    }
}
