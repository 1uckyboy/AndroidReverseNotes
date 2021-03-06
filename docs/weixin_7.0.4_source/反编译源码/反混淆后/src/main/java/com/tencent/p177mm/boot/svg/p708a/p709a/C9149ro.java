package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.ro */
public final class C9149ro extends C5163c {
    private final int height = 96;
    private final int width = 96;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = C5163c.m7881h(looper);
                float[] g = C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(WebView.NIGHT_MODE_COLOR);
                g = C5163c.m7878a(g, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 10.5f, 0.0f, 1.0f, 10.5f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(13.207434f, 11.899989f);
                l.lineTo(16.05067f, 59.66637f);
                l.cubicTo(16.138716f, 61.145535f, 17.363943f, 62.3f, 18.845724f, 62.3f);
                l.lineTo(44.154278f, 62.3f);
                l.cubicTo(45.636055f, 62.3f, 46.861286f, 61.145535f, 46.94933f, 59.66637f);
                l.lineTo(49.792564f, 11.899989f);
                l.lineTo(13.207434f, 11.899989f);
                l.close();
                l.moveTo(8.75f, 7.6999893f);
                l.lineTo(54.25f, 7.6999893f);
                l.lineTo(51.14191f, 59.91593f);
                l.cubicTo(50.921795f, 63.613834f, 47.858727f, 66.5f, 44.154278f, 66.5f);
                l.lineTo(18.845724f, 66.5f);
                l.cubicTo(15.141274f, 66.5f, 12.078204f, 63.613834f, 11.858091f, 59.91593f);
                l.lineTo(8.75f, 7.6999893f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(3.5f, 7.6999893f);
                l.lineTo(59.5f, 7.6999893f);
                l.cubicTo(60.4665f, 7.6999893f, 61.25f, 8.483491f, 61.25f, 9.449989f);
                l.lineTo(61.25f, 11.899989f);
                l.lineTo(1.75f, 11.899989f);
                l.lineTo(1.75f, 9.449989f);
                l.cubicTo(1.75f, 8.483491f, 2.5335016f, 7.6999893f, 3.5f, 7.6999893f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(38.5f, 9.549949E-5f);
                l.cubicTo(39.4665f, 9.549949E-5f, 40.25f, 0.7835972f, 40.25f, 1.7500955f);
                l.lineTo(40.25f, 4.2000847f);
                l.lineTo(22.75f, 4.2000847f);
                l.lineTo(22.75f, 1.7500955f);
                l.cubicTo(22.75f, 0.7835972f, 23.533503f, 9.549949E-5f, 24.5f, 9.549949E-5f);
                l.lineTo(38.5f, 9.549949E-5f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                Paint a3 = C5163c.m7876a(a, looper);
                Path l2 = C5163c.m7884l(looper);
                l2.moveTo(22.75f, 21.0f);
                l2.lineTo(26.950043f, 21.0f);
                l2.lineTo(28.700043f, 52.5f);
                l2.lineTo(24.5f, 52.5f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 1);
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(a, looper);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(36.049957f, 21.0f);
                l2.lineTo(40.25f, 21.0f);
                l2.lineTo(38.5f, 52.5f);
                l2.lineTo(34.299957f, 52.5f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 1);
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a3);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
