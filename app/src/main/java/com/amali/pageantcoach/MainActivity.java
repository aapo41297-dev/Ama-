package com.amali.pageantcoach;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        showDashboard();
    }

    private TextView title(String text) {
        TextView view = new TextView(this);
        view.setText(text);
        view.setTextSize(25);
        view.setTypeface(null, Typeface.BOLD);
        view.setTextColor(Color.WHITE);
        view.setPadding(20, 25, 20, 15);
        return view;
    }

    private TextView description(String text) {
        TextView view = new TextView(this);
        view.setText(text);
        view.setTextSize(16);
        view.setTextColor(Color.DKGRAY);
        view.setPadding(20, 10, 20, 20);
        return view;
    }

    private Button menuButton(String text) {
        Button button = new Button(this);
        button.setText(text);
        button.setTextSize(16);
        button.setAllCaps(false);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);

        params.setMargins(15, 8, 15, 8);
        button.setLayoutParams(params);

        return button;
    }

    private void setupScreen(String screenTitle) {

        ScrollView scroll = new ScrollView(this);

        container = new LinearLayout(this);
        container.setOrientation(LinearLayout.VERTICAL);
        container.setBackgroundColor(Color.WHITE);

        TextView header = title(screenTitle);
        header.setBackgroundColor(Color.rgb(35, 25, 45));

        container.addView(header);

        scroll.addView(container);

        setContentView(scroll);
    }

    private void showDashboard() {

        setupScreen("PAGEANT COACH");

        container.addView(description(
                "Your all-in-one workspace for training, contestants, " +
                "events, scoring and pageant preparation."
        ));

        Button contestants = menuButton("👑 Contestants");
        contestants.setOnClickListener(v -> showContestants());
        container.addView(contestants);

        Button training = menuButton("🎤 Training & Coaching");
        training.setOnClickListener(v -> showTraining());
        container.addView(training);

        Button questions = menuButton("❓ Interview Questions");
        questions.setOnClickListener(v -> showQuestions());
        container.addView(questions);

        Button scoring = menuButton("⭐ Scoring & Judging");
        scoring.setOnClickListener(v -> showScoring());
        container.addView(scoring);

        Button events = menuButton("📅 Events & Schedule");
        events.setOnClickListener(v -> showEvents());
        container.addView(events);

        Button profiles = menuButton("📝 Contestant Profiles");
        profiles.setOnClickListener(v -> showProfiles());
        container.addView(profiles);

        Button advocacy = menuButton("🌍 Advocacy & Projects");
        advocacy.setOnClickListener(v -> showAdvocacy());
        container.addView(advocacy);

        Button notes = menuButton("📋 Coach Notes");
        notes.setOnClickListener(v ->
                Toast.makeText(this,
                        "Coach Notes module coming next.",
                        Toast.LENGTH_SHORT).show());

        container.addView(notes);
    }

    private void backButton() {
        Button back = menuButton("← Back to Dashboard");
        back.setOnClickListener(v -> showDashboard());
        container.addView(back);
    }

    private void showContestants() {

        setupScreen("CONTESTANTS");

        container.addView(description(
                "Keep track of every contestant you coach."
        ));

        container.addView(menuButton("Add Contestant"));
        container.addView(menuButton("Contestant List"));
        container.addView(menuButton("Training Progress"));
        container.addView(menuButton("Contestant Goals"));

        backButton();
    }

    private void showTraining() {

        setupScreen("TRAINING & COACHING");

        container.addView(description(
                "Plan practical coaching sessions for pageant contestants."
        ));

        container.addView(menuButton("Walk & Runway Training"));
        container.addView(menuButton("Interview Training"));
        container.addView(menuButton("Public Speaking"));
        container.addView(menuButton("Confidence Training"));
        container.addView(menuButton("Stage Presence"));
        container.addView(menuButton("Elegance Training"));
        container.addView(menuButton("Environment Advocacy"));
        container.addView(menuButton("Mental Health Advocacy"));

        backButton();
    }

    private void showQuestions() {

        setupScreen("INTERVIEW QUESTIONS");

        container.addView(description(
                "Practice pageant interview questions."
        ));

        container.addView(menuButton(
                "Tell us about yourself."
        ));

        container.addView(menuButton(
                "What does leadership mean to you?"
        ));

        container.addView(menuButton(
                "What change would you make in your community?"
        ));

        container.addView(menuButton(
                "Why should you become a title holder?"
        ));

        container.addView(menuButton(
                "What does beauty mean to you?"
        ));

        container.addView(menuButton(
                "How would you use your platform?"
        ));

        backButton();
    }

    private void showScoring() {

        setupScreen("SCORING & JUDGING");

        container.addView(description(
                "Create and manage practice judging criteria."
        ));

        container.addView(menuButton("Interview Score"));
        container.addView(menuButton("Runway Score"));
        container.addView(menuButton("Stage Presence"));
        container.addView(menuButton("Elegance"));
        container.addView(menuButton("Communication"));
        container.addView(menuButton("Advocacy"));
        container.addView(menuButton("Overall Score"));

        backButton();
    }

    private void showEvents() {

        setupScreen("EVENTS & SCHEDULE");

        container.addView(description(
                "Organize training sessions, school visits, "
                + "crowning events and pageant activities."
        ));

        container.addView(menuButton("Add Event"));
        container.addView(menuButton("Upcoming Events"));
        container.addView(menuButton("Training Calendar"));
        container.addView(menuButton("Event Checklist"));

        backButton();
    }

    private void showProfiles() {

        setupScreen("CONTESTANT PROFILES");

        container.addView(description(
                "Prepare contestant profiling information "
                + "for school and pageant events."
        ));

        container.addView(menuButton("Create Profile"));
        container.addView(menuButton("Profile Introduction"));
        container.addView(menuButton("Miss Environment"));
        container.addView(menuButton("Miss Elegance"));
        container.addView(menuButton("Leadership"));
        container.addView(menuButton("Community Service"));

        backButton();
    }

    private void showAdvocacy() {

        setupScreen("ADVOCACY & PROJECTS");

        container.addView(description(
                "Track the causes and community projects "
                + "connected to your contestants."
        ));

        container.addView(menuButton("Go Girl Support Project"));
        container.addView(menuButton("Education"));
        container.addView(menuButton("Environment"));
        container.addView(menuButton("Mental Health"));
        container.addView(menuButton("Community Outreach"));
        container.addView(menuButton("Project Reports"));

        backButton();
    }
          }
