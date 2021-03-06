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

public final class abc extends c {
    private final int height = 72;
    private final int width = 72;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 72;
            case 1:
                return 72;
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
                canvas.save();
                Paint a = c.a(k, looper);
                a.setColor(-372399);
                Path l = c.l(looper);
                l.moveTo(45.0f, 11.2f);
                l.lineTo(45.0f, 7.4f);
                l.cubicTo(42.2f, 6.5f, 39.1f, 6.0f, 36.0f, 6.0f);
                l.cubicTo(31.0f, 6.0f, 26.3f, 7.2f, 22.1f, 9.4f);
                l.lineTo(36.1f, 23.4f);
                l.cubicTo(36.1f, 23.4f, 36.1f, 23.4f, 36.1f, 23.4f);
                l.lineTo(42.2f, 29.5f);
                l.cubicTo(43.9f, 31.1f, 44.9f, 33.4f, 44.9f, 36.0f);
                l.lineTo(44.9f, 27.2f);
                l.lineTo(28.5f, 10.7f);
                l.cubicTo(30.9f, 10.0f, 33.4f, 9.599999f, 36.0f, 9.599999f);
                l.cubicTo(39.2f, 9.599999f, 42.2f, 10.099999f, 45.0f, 11.2f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-352965);
                l = c.l(looper);
                l.moveTo(24.8f, 12.099999f);
                l.lineTo(22.1f, 9.4f);
                l.cubicTo(19.5f, 10.8f, 17.0f, 12.599999f, 14.8f, 14.8f);
                l.cubicTo(11.3f, 18.3f, 8.8f, 22.5f, 7.4f, 27.0f);
                l.lineTo(27.2f, 27.0f);
                l.cubicTo(27.2f, 27.0f, 27.2f, 27.0f, 27.2f, 27.0f);
                l.lineTo(35.9f, 27.0f);
                l.cubicTo(38.2f, 27.0f, 40.6f, 27.8f, 42.4f, 29.6f);
                l.lineTo(36.2f, 23.4f);
                l.lineTo(12.8f, 23.4f);
                l.cubicTo(14.0f, 21.2f, 15.5f, 19.2f, 17.3f, 17.3f);
                l.cubicTo(19.6f, 15.099999f, 22.1f, 13.3f, 24.8f, 12.099999f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-15616);
                l = c.l(looper);
                l.moveTo(11.2f, 27.0f);
                l.lineTo(7.4f, 27.0f);
                l.cubicTo(6.5f, 29.8f, 6.0f, 32.9f, 6.0f, 36.0f);
                l.cubicTo(6.0f, 41.0f, 7.2f, 45.7f, 9.4f, 49.9f);
                l.lineTo(23.4f, 35.9f);
                l.cubicTo(23.4f, 35.9f, 23.4f, 35.9f, 23.4f, 35.9f);
                l.lineTo(29.5f, 29.8f);
                l.cubicTo(31.1f, 28.1f, 33.4f, 27.1f, 36.0f, 27.1f);
                l.lineTo(27.2f, 27.1f);
                l.lineTo(10.7f, 43.5f);
                l.cubicTo(10.0f, 41.1f, 9.6f, 38.6f, 9.6f, 36.0f);
                l.cubicTo(9.6f, 32.8f, 10.2f, 29.8f, 11.2f, 27.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-7220480);
                l = c.l(looper);
                l.moveTo(12.1f, 47.2f);
                l.lineTo(9.4f, 49.9f);
                l.cubicTo(10.8f, 52.5f, 12.6f, 55.0f, 14.8f, 57.2f);
                l.cubicTo(18.3f, 60.7f, 22.5f, 63.2f, 27.0f, 64.6f);
                l.lineTo(27.0f, 44.8f);
                l.cubicTo(27.0f, 44.8f, 27.0f, 44.8f, 27.0f, 44.8f);
                l.lineTo(27.0f, 36.1f);
                l.cubicTo(27.0f, 33.8f, 27.8f, 31.4f, 29.6f, 29.6f);
                l.lineTo(23.4f, 35.8f);
                l.lineTo(23.4f, 59.1f);
                l.cubicTo(21.2f, 57.9f, 19.2f, 56.4f, 17.3f, 54.6f);
                l.cubicTo(15.1f, 52.4f, 13.3f, 49.9f, 12.1f, 47.2f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-16726153);
                l = c.l(looper);
                l.moveTo(27.0f, 60.8f);
                l.lineTo(27.0f, 64.6f);
                l.cubicTo(29.8f, 65.5f, 32.9f, 66.0f, 36.0f, 66.0f);
                l.cubicTo(41.0f, 66.0f, 45.7f, 64.8f, 49.9f, 62.6f);
                l.lineTo(35.9f, 48.6f);
                l.cubicTo(35.9f, 48.6f, 35.9f, 48.6f, 35.9f, 48.6f);
                l.lineTo(29.8f, 42.5f);
                l.cubicTo(28.1f, 40.9f, 27.1f, 38.6f, 27.1f, 36.0f);
                l.lineTo(27.1f, 44.8f);
                l.lineTo(43.6f, 61.3f);
                l.cubicTo(41.2f, 62.0f, 38.7f, 62.4f, 36.1f, 62.4f);
                l.cubicTo(32.8f, 62.4f, 29.8f, 61.8f, 27.0f, 60.8f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-15683841);
                l = c.l(looper);
                l.moveTo(47.2f, 59.9f);
                l.lineTo(49.9f, 62.6f);
                l.cubicTo(52.5f, 61.2f, 55.0f, 59.4f, 57.2f, 57.2f);
                l.cubicTo(60.7f, 53.7f, 63.2f, 49.5f, 64.6f, 45.0f);
                l.lineTo(44.8f, 45.0f);
                l.cubicTo(44.8f, 45.0f, 44.8f, 45.0f, 44.8f, 45.0f);
                l.lineTo(36.1f, 45.0f);
                l.cubicTo(33.8f, 45.0f, 31.4f, 44.2f, 29.6f, 42.4f);
                l.lineTo(35.8f, 48.6f);
                l.lineTo(59.1f, 48.6f);
                l.cubicTo(57.9f, 50.8f, 56.4f, 52.8f, 54.6f, 54.7f);
                l.cubicTo(52.4f, 56.9f, 49.9f, 58.6f, 47.2f, 59.9f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-14187817);
                l = c.l(looper);
                l.moveTo(60.8f, 45.0f);
                l.lineTo(64.6f, 45.0f);
                l.cubicTo(65.5f, 42.2f, 66.0f, 39.1f, 66.0f, 36.0f);
                l.cubicTo(66.0f, 31.0f, 64.8f, 26.3f, 62.6f, 22.1f);
                l.lineTo(48.6f, 36.1f);
                l.cubicTo(48.6f, 36.1f, 48.6f, 36.1f, 48.6f, 36.1f);
                l.lineTo(42.5f, 42.2f);
                l.cubicTo(40.9f, 43.9f, 38.6f, 44.9f, 36.0f, 44.9f);
                l.lineTo(44.8f, 44.9f);
                l.lineTo(61.3f, 28.4f);
                l.cubicTo(62.0f, 30.8f, 62.4f, 33.3f, 62.4f, 35.9f);
                l.cubicTo(62.4f, 39.2f, 61.8f, 42.2f, 60.8f, 45.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                k = c.a(k, looper);
                k.setColor(-10197008);
                l = c.l(looper);
                l.moveTo(59.9f, 24.8f);
                l.lineTo(62.6f, 22.1f);
                l.cubicTo(61.2f, 19.5f, 59.4f, 17.0f, 57.2f, 14.8f);
                l.cubicTo(53.7f, 11.3f, 49.5f, 8.8f, 45.0f, 7.4f);
                l.lineTo(45.0f, 27.2f);
                l.cubicTo(45.0f, 27.2f, 45.0f, 27.2f, 45.0f, 27.2f);
                l.lineTo(45.0f, 35.9f);
                l.cubicTo(45.0f, 38.2f, 44.2f, 40.6f, 42.4f, 42.4f);
                l.lineTo(48.6f, 36.2f);
                l.lineTo(48.6f, 12.8f);
                l.cubicTo(50.8f, 14.0f, 52.8f, 15.5f, 54.7f, 17.3f);
                l.cubicTo(56.9f, 19.6f, 58.7f, 22.1f, 59.9f, 24.8f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, k);
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
