package com.github.iojjj.rcbs;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import androidx.annotation.IntDef;

/**
 * Text alignment enumeration.
 */
@IntDef({
        RoundedCornersBackgroundSpan.ALIGN_START,
        RoundedCornersBackgroundSpan.ALIGN_END,
        RoundedCornersBackgroundSpan.ALIGN_CENTER
})
@Retention(RetentionPolicy.SOURCE)
public @interface TextAlignment {
}
