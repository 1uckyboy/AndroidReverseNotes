package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class azc extends c {
    private final int height = 96;
    private final int width = 96;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                c.h(looper);
                c.g(looper);
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
                c.a(k2, looper).setStrokeWidth(1.0f);
                k = c.a(k, looper);
                k.setColor(-9318371);
                canvas.save();
                Paint a = c.a(k, looper);
                Path l = c.l(looper);
                l.moveTo(47.999f, 15.0f);
                l.cubicTo(29.773f, 15.0f, 15.0f, 29.774f, 15.0f, 48.0f);
                l.cubicTo(15.0f, 66.226f, 29.773f, 81.0f, 47.999f, 81.0f);
                l.cubicTo(66.225f, 81.0f, 81.0f, 66.226f, 81.0f, 48.0f);
                l.cubicTo(81.0f, 29.774f, 66.225f, 15.0f, 47.999f, 15.0f);
                l.lineTo(47.999f, 15.0f);
                l.close();
                l.moveTo(62.0f, 31.0f);
                l.cubicTo(64.762f, 31.0f, 67.0f, 33.462f, 67.0f, 36.5f);
                l.cubicTo(67.0f, 39.538f, 64.762f, 42.0f, 62.0f, 42.0f);
                l.cubicTo(59.238f, 42.0f, 57.0f, 39.538f, 57.0f, 36.5f);
                l.cubicTo(57.0f, 33.462f, 59.238f, 31.0f, 62.0f, 31.0f);
                l.lineTo(62.0f, 31.0f);
                l.close();
                l.moveTo(35.0f, 31.0f);
                l.cubicTo(37.762f, 31.0f, 40.0f, 33.462f, 40.0f, 36.5f);
                l.cubicTo(40.0f, 39.538f, 37.762f, 42.0f, 35.0f, 42.0f);
                l.cubicTo(32.238f, 42.0f, 30.0f, 39.538f, 30.0f, 36.5f);
                l.cubicTo(30.0f, 33.462f, 32.238f, 31.0f, 35.0f, 31.0f);
                l.lineTo(35.0f, 31.0f);
                l.close();
                l.moveTo(48.0f, 71.0f);
                l.cubicTo(28.667f, 71.0f, 26.0f, 53.0f, 26.0f, 53.0f);
                l.cubicTo(26.0f, 53.0f, 40.361f, 51.0f, 48.0f, 51.0f);
                l.cubicTo(55.639f, 51.0f, 70.0f, 53.0f, 70.0f, 53.0f);
                l.cubicTo(70.0f, 53.0f, 67.333f, 71.0f, 48.0f, 71.0f);
                l.lineTo(48.0f, 71.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
