package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class ei extends c {
    private final int height = 57;
    private final int width = 45;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 45;
            case 1:
                return 57;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = c.h(looper);
                float[] g = c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                k = c.a(k2, looper);
                k.setStrokeWidth(1.0f);
                canvas.save();
                Paint a = c.a(k, looper);
                a.setColor(-11184811);
                a.setStrokeWidth(3.0f);
                g = c.a(g, 1.0f, 0.0f, -1450.0f, 0.0f, 1.0f, -602.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path l = c.l(looper);
                l.moveTo(1470.9163f, 655.8485f);
                l.cubicTo(1472.067f, 657.03674f, 1473.9164f, 657.02386f, 1475.0333f, 655.7881f);
                l.cubicTo(1475.0333f, 655.7881f, 1492.0f, 638.46387f, 1492.0f, 624.0f);
                l.cubicTo(1492.0f, 612.767f, 1483.2695f, 604.0f, 1473.0f, 604.0f);
                l.cubicTo(1461.7305f, 604.0f, 1453.0f, 612.767f, 1453.0f, 624.0f);
                l.cubicTo(1453.0f, 638.46387f, 1470.9163f, 655.8485f, 1470.9163f, 655.8485f);
                l.close();
                l.moveTo(1473.0f, 630.0f);
                l.cubicTo(1476.0898f, 630.0f, 1479.0f, 627.08984f, 1479.0f, 624.0f);
                l.cubicTo(1479.0f, 619.91016f, 1476.0898f, 617.0f, 1473.0f, 617.0f);
                l.cubicTo(1468.9102f, 617.0f, 1466.0f, 619.91016f, 1466.0f, 624.0f);
                l.cubicTo(1466.0f, 627.08984f, 1468.9102f, 630.0f, 1473.0f, 630.0f);
                l.close();
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
