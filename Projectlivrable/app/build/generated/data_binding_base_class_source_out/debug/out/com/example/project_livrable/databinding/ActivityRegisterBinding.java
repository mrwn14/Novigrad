// Generated by view binder compiler. Do not edit!
package com.example.project_livrable.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.project_livrable.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText Email;

  @NonNull
  public final EditText FirstName;

  @NonNull
  public final EditText LastName;

  @NonNull
  public final EditText Password2;

  @NonNull
  public final Button Register2;

  @NonNull
  public final EditText Username2;

  @NonNull
  public final Spinner spinner2;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView, @NonNull EditText Email,
      @NonNull EditText FirstName, @NonNull EditText LastName, @NonNull EditText Password2,
      @NonNull Button Register2, @NonNull EditText Username2, @NonNull Spinner spinner2) {
    this.rootView = rootView;
    this.Email = Email;
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.Password2 = Password2;
    this.Register2 = Register2;
    this.Username2 = Username2;
    this.spinner2 = spinner2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Email;
      EditText Email = ViewBindings.findChildViewById(rootView, id);
      if (Email == null) {
        break missingId;
      }

      id = R.id.FirstName;
      EditText FirstName = ViewBindings.findChildViewById(rootView, id);
      if (FirstName == null) {
        break missingId;
      }

      id = R.id.LastName;
      EditText LastName = ViewBindings.findChildViewById(rootView, id);
      if (LastName == null) {
        break missingId;
      }

      id = R.id.Password2;
      EditText Password2 = ViewBindings.findChildViewById(rootView, id);
      if (Password2 == null) {
        break missingId;
      }

      id = R.id.Register2;
      Button Register2 = ViewBindings.findChildViewById(rootView, id);
      if (Register2 == null) {
        break missingId;
      }

      id = R.id.Username2;
      EditText Username2 = ViewBindings.findChildViewById(rootView, id);
      if (Username2 == null) {
        break missingId;
      }

      id = R.id.spinner2;
      Spinner spinner2 = ViewBindings.findChildViewById(rootView, id);
      if (spinner2 == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ConstraintLayout) rootView, Email, FirstName, LastName,
          Password2, Register2, Username2, spinner2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
