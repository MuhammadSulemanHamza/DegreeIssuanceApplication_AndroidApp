package com.example.degreeissueapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DegreeIssuanceFormActivity extends AppCompatActivity {

    public static final String PASS = "SUBMITTED";

    // Declaring variables

    TextView degree;
    TextView session;
    TextView rollNumber;
    TextView batch;
    TextView department;
    TextView candidateName;

    Button btn_submit;
    Button btn_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degree_issuance_form);

        // TextViews
        degree = findViewById(R.id.degree);
        session = findViewById(R.id.session);
        rollNumber = findViewById(R.id.rollNumber);
        batch = findViewById(R.id.batch);
        department = findViewById(R.id.department);
        candidateName = findViewById(R.id.candidateName);

        // Buttons
        btn_submit = findViewById(R.id.btn_submit);
        btn_cancel = findViewById(R.id.btn_cancel);

        ////////////////////////////////////////////////////////////////////////////////////////////

        // Get value from Intent
        DegreeIssueApplicationForm form = (DegreeIssueApplicationForm) getIntent().getSerializableExtra("FORM");
        if(form != null) {
            degree.setText(form.degree);
            session.setText(form.session);
            rollNumber.setText(form.rollNumber);
            batch.setText(form.batch);
            department.setText(form.department);
            candidateName.setText(form.candidateName);
        }

        // Submit Button Click Event

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DegreeIssueApplicationForm form = new DegreeIssueApplicationForm(
                        degree.getText().toString(),
                        session.getText().toString(),
                        rollNumber.getText().toString(),
                        batch.getText().toString(),
                        department.getText().toString(),
                        candidateName.getText().toString()
                );

                Intent resultIntent = new Intent();
                resultIntent.putExtra(PASS, form);
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });

        // Cancel Button Click Event

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(Activity.RESULT_CANCELED);
                finish();
            }
        });

    }
}