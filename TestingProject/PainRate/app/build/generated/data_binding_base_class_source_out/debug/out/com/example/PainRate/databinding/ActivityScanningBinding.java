// Generated by view binder compiler. Do not edit!
package com.example.PainRate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.PainRate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityScanningBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnCapture;

  @NonNull
  public final Button btnStartAnalysis;

  @NonNull
  public final ImageView imgvwHome;

  @NonNull
  public final ImageView imgvwLogo;

  @NonNull
  public final ImageView imgvwPhoto;

  private ActivityScanningBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnCapture,
      @NonNull Button btnStartAnalysis, @NonNull ImageView imgvwHome, @NonNull ImageView imgvwLogo,
      @NonNull ImageView imgvwPhoto) {
    this.rootView = rootView;
    this.btnCapture = btnCapture;
    this.btnStartAnalysis = btnStartAnalysis;
    this.imgvwHome = imgvwHome;
    this.imgvwLogo = imgvwLogo;
    this.imgvwPhoto = imgvwPhoto;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityScanningBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityScanningBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_scanning, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityScanningBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCapture;
      Button btnCapture = ViewBindings.findChildViewById(rootView, id);
      if (btnCapture == null) {
        break missingId;
      }

      id = R.id.btnStartAnalysis;
      Button btnStartAnalysis = ViewBindings.findChildViewById(rootView, id);
      if (btnStartAnalysis == null) {
        break missingId;
      }

      id = R.id.imgvwHome;
      ImageView imgvwHome = ViewBindings.findChildViewById(rootView, id);
      if (imgvwHome == null) {
        break missingId;
      }

      id = R.id.imgvwLogo;
      ImageView imgvwLogo = ViewBindings.findChildViewById(rootView, id);
      if (imgvwLogo == null) {
        break missingId;
      }

      id = R.id.imgvwPhoto;
      ImageView imgvwPhoto = ViewBindings.findChildViewById(rootView, id);
      if (imgvwPhoto == null) {
        break missingId;
      }

      return new ActivityScanningBinding((ConstraintLayout) rootView, btnCapture, btnStartAnalysis,
          imgvwHome, imgvwLogo, imgvwPhoto);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
