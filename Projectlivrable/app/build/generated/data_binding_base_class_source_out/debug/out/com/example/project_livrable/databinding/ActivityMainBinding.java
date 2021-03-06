// Generated by view binder compiler. Do not edit!
package com.example.project_livrable.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.project_livrable.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button Login1;

  @NonNull
  public final EditText Password;

  @NonNull
  public final Button Register1;

  @NonNull
  public final EditText Username;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button Login1,
      @NonNull EditText Password, @NonNull Button Register1, @NonNull EditText Username) {
    this.rootView = rootView;
    this.Login1 = Login1;
    this.Password = Password;
    this.Register1 = Register1;
    this.Username = Username;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Login1;
      Button Login1 = ViewBindings.findChildViewById(rootView, id);
      if (Login1 == null) {
        break missingId;
      }

      id = R.id.Password;
      EditText Password = ViewBindings.findChildViewById(rootView, id);
      if (Password == null) {
        break missingId;
      }

      id = R.id.Register1;
      Button Register1 = ViewBindings.findChildViewById(rootView, id);
      if (Register1 == null) {
        break missingId;
      }

      id = R.id.Username;
      EditText Username = ViewBindings.findChildViewById(rootView, id);
      if (Username == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, Login1, Password, Register1,
          Username);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
