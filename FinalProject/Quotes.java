package com.example.au_finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Quotes extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    private MyRecyclerViewAdapter adapter;
    private int mMood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        mMood = getIntent().getIntExtra("Mood", 0);



        // data to populate the RecyclerView with
        ArrayList<String> mood1 = new ArrayList<String>();//stressed
        mood1.add("Stop letting it bother you, just let it go. Your mind can only take so much.");
        mood1.add("When life gives you a hundred reasons to break down and cry, show life that you have a million reasons to smile and laugh.");
        mood1.add("It's so important to realize that every time you get upset, it drains your emotional energy. Losing your cool makes you tired. Getting angry a lot messes with your health.");
        mood1.add("Rule number one is, don’t sweat the small stuff. Rule number two is, it’s all small stuff.");
        mood1.add("If you treat every situation as a life and death matter, you’ll die a lot of times.");
        mood1.add("Do not anticipate trouble or worry about what may never happen. Keep in the sunlight.");
        mood1.add("In times of stress, the best thing we can do for each other is to listen with our ears and our hearts and to be assured that our questions are just as important as our answers.");
        mood1.add("It took me years to figure out that upset was upset, and tumultuousness was not the same thing as passion. Love isn't drama.");
        mood1.add("If it comes, let it come. If it goes, it's ok, let it go. Let things come and go. Stay calm, don't let anything disturb your peace, and carry on.");
        mood1.add("Sometimes we are so upset about our meaningless worries that we keep losing focus of the goal all the time");



        ArrayList<String> mood2 = new ArrayList<String>();//unmotivated
        mood2.add("The Pessimist Sees Difficulty In Every Opportunity. The Optimist Sees Opportunity In Every Difficulty.");
        mood2.add("Don’t Let Yesterday Take Up Too Much Of Today.");
        mood2.add("If You Are Working On Something That You Really Care About, You Don’t Have To Be Pushed. The Vision Pulls You.");
        mood2.add("People Who Are Crazy Enough To Think They Can Change The World, Are The Ones Who Do.");
        mood2.add("Failure Will Never Overtake Me If My Determination To Succeed Is Strong Enough.");
        mood2.add("Knowing Is Not Enough; We Must Apply. Wishing Is Not Enough; We Must Do.");
        mood2.add("Whether You Think You Can Or Think You Can’t, You’re Right.");
        mood2.add("Security Is Mostly A Superstition. Life Is Either A Daring Adventure Or Nothing.");
        mood2.add("The Man Who Has Confidence In Himself Gains The Confidence Of Others.");
        mood2.add("The Only Limit To Our Realization Of Tomorrow Will Be Our Doubts Of Today.");
        mood2.add("Creativity Is Intelligence Having Fun.");
        mood2.add("What You Lack In Talent Can Be Made Up With Desire, Hustle And Giving 110% All The Time.");
        mood2.add("Do What You Can With All You Have, Wherever You Are");
        mood2.add("Develop An ‘Attitude Of Gratitude’. Say Thank You To Everyone You Meet For Everything They Do For You.");
        mood2.add("You Are Never Too Old To Set Another Goal Or To Dream A New Dream.");
        mood2.add("To See What Is Right And Not Do It Is A Lack Of Courage.");

        ArrayList<String> mood3 = new ArrayList<String>();//stressed, calm down
        mood3.add("Today I refuse to stress myself out about things I cannot control or change.");
        mood3.add("Sometimes you don’t realize the weight of something you’ve been carrying until you feel the weight of its release.");
        mood3.add("Stop worrying about what can go wrong, and get excited about what can go right.");
        mood3.add("Breath is the power behind all things…. I breathe in and know that good things will happen.");
        mood3.add("Within you, there is a stillness and a sanctuary to which you can retreat at any time and be yourself.");
        mood3.add("Simply let experience take place very freely, so that your open heart is suffused with the tenderness of true compassion.");
        mood3.add("Don’t try to force anything. Let life be a deep let-go.");
        mood3.add("The greatest weapon against stress is our ability to choose one thought over another.");
        mood3.add("Breathe. Let go. And remind yourself that this very moment is the only one you know you have for sure.");
        mood3.add("Calmness of mind is one of the beautiful jewels of wisdom");
        mood3.add("In times of great stress or adversity, it's always best to keep busy, to plow your anger and your energy into something positive.");
        mood3.add("The greatest mistake you can make in life is to be continually fearing you will make one.");
        mood3.add("There are thousands of causes for stress, and one antidote to stress is self-expression. That's what happens to me every day. My thoughts get off my chest, down my sleeves and onto my pad.");
        mood3.add("A crust eaten in peace is better than a banquet partaken in anxiety.");

        ArrayList<String> mood4 = new ArrayList<String>();//gloomy, cheer up
        mood4.add("Thousands of candles can be lighted from a single candle, and the life of the candle will not be shortened. Happiness never decreases by being shared.");
        mood4.add("Happiness is the art of never holding in your mind the memory of any unpleasant thing that has passed.");
        mood4.add("To be happy, we must not be too concerned with others.");
        mood4.add("If you want happiness for an hour — take a nap.'\n" +
                "If you want happiness for a day — go fishing.\n" +
                "If you want happiness for a year — inherit a fortune.\n" +
                "If you want happiness for a lifetime — help someone else");
        mood4.add("The moments of happiness we enjoy take us by surprise. It is not that we seize them, but that they seize us");
        mood4.add("It isn't what you have, or who you are, or where you are, or what you are doing that makes you happy or unhappy. It is what you think about.");
        mood4.add("Don’t underestimate the value of Doing Nothing, of just going along, listening to all the things you can’t hear, and not bothering.");
        mood4.add("There is only one way to happiness and that is to cease worrying about things which are beyond the power of our will.");
        mood4.add("We tend to forget that happiness doesn't come as a result of getting something we don't have, but rather of recognizing and appreciating what we do have");
        mood4.add("Sometimes your joy is the source of your smile, but sometimes your smile can be the source of your joy.");
        mood4.add("To be kind to all, to like many and love a few, to be needed and wanted by those we love, is certainly the nearest we can come to happiness.");
        mood4.add("Love is that condition in which the happiness of another person is essential to your own.");
        mood4.add("Happy people plan actions, they don’t plan results.");
        mood4.add("Happiness is when what you think, what you say, and what you do are in harmony.");
        mood4.add("The only joy in the world is to begin.");

        ArrayList<String> mood5 = new ArrayList<String>();//tense, dw
        mood5.add("Don't let your mind bully your body into believing it must carry the burden of its worries.");
        mood5.add("When you find yourself stressed, ask yourself one question: Will this matter in 5 years from now? If yes, then do something about the situation. If no, then let it go.  ");
        mood5.add("Stress is not what happens to us. It's our response TO what happens. And RESPONSE is something we can choose.");
        mood5.add("If you are distressed by anything external, the pain is not due to the thing itself but to your own estimate of it; and this you have the power to revoke at any moment.");
        mood5.add("Take rest; a field that has rested gives a bountiful crop.");
        mood5.add("When I look back on all these worries, I remember the story of the old man who said on his deathbed that he had had a lot of trouble in his life, most of which had never happened.");
        mood5.add("When we commit to action, to actually doing something rather than feeling trapped by events, the stress in our life becomes manageable.     ");
        mood5.add("Everyday brings a choice: to practice stress or to practice peace.");
        mood5.add("Some of the secret joys of living are not found by rushing from point A to point B, but by inventing some imaginary letters along the way. ");
        mood5.add("Being in control of your life and having realistic expectations about your day-to-day challenges are the keys to stress management, which is perhaps the most important ingredient to living a happy, healthy and rewarding life.  ");

        ArrayList<String> mood6 = new ArrayList<String>();//irritated
        mood6.add("Although life may not be easy now, in the end it’s all worth it. Everything will get better in time. ");
        mood6.add("You have to forgive to forget, and forget, to feel again.");
        mood6.add("Cheer up when the night comes, because mornings always give you another chance.");
        mood6.add("After every storm the sun will smile; for every problem there is a solution, and the soul’s indefeasible duty is to be of good cheer.");
        mood6.add("With every rising of the sun think of your life as just begun.");
        mood6.add("Some people think that it’s holding on that makes one strong; sometimes it’s letting go.");
        mood6.add("No one is in control of your happiness but you; therefore, you have the power to change anything about yourself or your life that you want to change.");
        mood6.add("Know that you cannot create great new beginnings until you sincerely celebrate the endings that precede them.");
        mood6.add("Life is too short for us to dwell on sadness. Cheer up and live life to the fullest.");
        mood6.add("People will always throw stones in your path. What will happen depends on what you make out of it – a wall or a bridge.");

        ArrayList<String> mood7 = new ArrayList<String>();//tired
        mood7.add("Tired minds don't plan well. Sleep first, plan later.");
        mood7.add("Anxiety happens when you think you have to figure out everything all at once. Breathe. You’re strong. You got this. Take it day by day.");
        mood7.add("I’ve dreamed a lot. I’m tired now from dreaming but not tired of dreaming. No one tires of dreaming, because to dream is to forget, and forgetting does not weigh on us, it is a dreamless sleep throughout which we remain awake. In dreams I have achieved everything.");
        mood7.add("Do not confuse my bad days as a sign of weakness. Those are the days I am actually fighting my hardest");
        mood7.add("The biggest wall you’ve gotta climb is the one you build in your mind.");
        mood7.add("Pain is temporary. It may last a minute, or an hour, or a day, or a year, but eventually it will subside and something else will take its place. If I quit, however, it lasts forever.");
        mood7.add("The souls that have seen the darkest days can shine the brightest light. Keep going!");
        mood7.add("When I’d get tired and want to stop, I’d wonder what my next opponent was doing. I’d wonder if he was still working out. I’d tried to visualize him. When I could see him working, I’d start pushing myself. When I could see him in the shower, I’d push myself harder.");
        mood7.add("You can do anything, but not everything.");
        mood7.add("Don’t stop when you are tired. Stop when you are done.");
        mood7.add("One word: ‘Fight.’ Anyone can do it when it feels good. When you’re hurting, that’s when it makes a difference, so you have to keep fighting.'");

        ArrayList<String> mood8 = new ArrayList<String>();//grief
        mood8.add("Perhaps they are not stars, but rather openings in heaven where the love of our lost ones pours through and shines down upon us to let us know they are happy.");
        mood8.add("I believe that imagination is stronger than knowledge. That myth is more potent than history. That dreams are more powerful than facts. That hope always triumphs over experience. That laughter is the only cure for grief. And I believe that love is stronger than death.");
        mood8.add("Grief is never something you get over. You don't wake up one morning and say, 'I've conquered that; now I'm moving on.' It's something that walks beside you every day. And if you can learn how to manage it and honour the person that you miss, you can take something that is incredibly sad and have some form of positivity.");
        mood8.add("There is a sacredness in tears. They are not the mark of weakness, but of power. They speak more eloquently than ten thousand tongues. They are the messengers of overwhelming grief, of deep contrition, and of unspeakable love.");
        mood8.add("I learned that, with grief, you have to take it one day at a time and learn how to find the happiness amid the heartbreak.");
        mood8.add("Grief is perhaps an unknown territory for you. You might feel both helpless and hopeless without a sense of a 'map' for the journey. Confusion is the hallmark of a transition. To rebuild both your inner and outer world is a major project.");
        mood8.add("I do a lot of book signings and conventions every year, and I meet a great many readers who are struggling... they're working through illness, injury, addiction, depression, grief, or some other trauma. It seems to me that there's a lot of heroism in fighting those things as well, as best you can.");
        mood8.add("Perhaps grief is not about empty, but full. The full breath of life that includes death. The completeness, the cycles, the depth, the richness, the process, the continuity and the treasure of the moment that is gone the second you are aware of it.");
        mood8.add("You will lose someone you can’t live without,and your heart will be badly broken, and the bad news is that you never completely get over the loss of your beloved. But this is also the good news. They live forever in your broken heart that doesn’t seal back up. And you come through. It’s like having a broken leg that never heals perfectly—that still hurts when the weather gets cold, but you learn to dance with the limp");
        mood8.add("Only people who are capable of loving strongly can also suffer great sorrow, but this same necessity of loving serves to counteract their grief and heals them.");





        // set up the RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.workshopParticipants);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        if(mMood == 1) {
            adapter = new MyRecyclerViewAdapter(this, mood1);
        }

        if(mMood == 2) {
            adapter = new MyRecyclerViewAdapter(this, mood2);
        }

        if(mMood == 3) {
            adapter = new MyRecyclerViewAdapter(this, mood3);
        }

        if(mMood == 4) {
            adapter = new MyRecyclerViewAdapter(this, mood4);
        }

        if(mMood == 5) {
            adapter = new MyRecyclerViewAdapter(this, mood5);
        }

        if(mMood == 6) {
            adapter = new MyRecyclerViewAdapter(this, mood6);
        }

        if(mMood == 7) {
            adapter = new MyRecyclerViewAdapter(this, mood7);
        }

        if(mMood == 8) {
            adapter = new MyRecyclerViewAdapter(this, mood8);
        }
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        //Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
        //Intent i = new Intent(this,PersonActivity.class);
        //startActivity(i);

    }


}