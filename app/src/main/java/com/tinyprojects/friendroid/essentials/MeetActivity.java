package com.tinyprojects.friendroid.essentials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MeetActivity extends AppCompatActivity {

    ListView lvMeet;
    String[] meetTitle = {"যে ১০টি কথা ছেলেদেরকে বলা উচিৎ নয় মেয়েদের","শাস্তি, বকাবকি নয়, শিশুর সঙ্গে গল্প করুন, বন্ধু হন","প্রকৃত বন্ধুর যেসব গুণাবলী থাকা উচিত"/*,"Meeting Title 4","Meeting Title 5",
                         "Meeting Title 6","Meeting Title 7","Meeting Title 8","Meeting Title 9","Meeting Title 10"*/};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet);
        lvMeet = findViewById(R.id.lvMeet);

        ChildListAdapter meetAdapter = new ChildListAdapter(this,meetTitle);
        lvMeet.setAdapter(meetAdapter);
        lvMeet.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            Intent intent = new Intent(MeetActivity.this,ReadingActivity.class);
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    intent.putExtra("Title","যে ১০টি কথা ছেলেদেরকে বলা উচিৎ নয় মেয়েদের");
                    intent.putExtra("Description","স্বভাবতই মেয়েরা একটু বেশি কথা বলে থাকে। প্রয়োজনীয়-অপ্রয়োজনীয় সকল ধরণের কথার ফুলঝুরি তৈরিই থাকে মেয়েদের কাছে। নিজের প্রেমিকের কাছে কোনো কথা বলা উচিৎ এবং কোনো কথা বলা উচিৎ নয় এই নিয়ে মেয়েদের মোটেই চিন্তা করতে দেখা যায় না। কিন্তু এই ব্যাপারটি অবশ্যই জানা উচিৎ প্রত্যেক মেয়ের। কারণ মুখ থেকে বের হওয়া সামান্য কথা সম্পর্কে আনতে পারে অন্যরকম মোড়। সস্পর্কের ক্ষেত্রে অনেক সময় না বুঝেই কিছু বোকামি করে ফেলি আমরা। সামান্য কিছু টিপস মনে রাখলে সহজেই আপনার সম্পর্কটি হয়ে উঠতে পারে সুন্দর ও স্বাচ্ছন্দ্যের। তবে চলুন জেনে নেই এমন ১০টি কথা যা কখনোই আপনার ছেলে বন্ধুটিকে বলতে যাবে না।\n" +
                            "\n" +
                            "১. তোমার বন্ধুটি খুব দারুণ!\n" +
                            "\n" +
                            "আপনি হয়ত আপনার সঙ্গীর কোনো ছেলে বন্ধুর সাথে পরিচিত হয়েছেন যাকে আপনার খুবই ভালো লেগেছে। বিশেষ করে তার পোশাক-আশাক কিংবা কথা বলার ধরণ। তা হলেও কোনোভাবেই আপনার সঙ্গীকে তা বুঝতে দেবেন না। আপনার হয়ত মনে হতে পারে তার বন্ধুর প্রশংসা করায় সে হয়ত খুশি হয়েছে কিন্তু আদতে ছেলেরা এতে ভেতরে হীনমন্য বোধ করে। বিশেষ করে যদি সে বন্ধুটির কোনো বিশেষ গুণ তার না থেকে থাকে।\n" +
                            "\n" +
                            "২. তুমি ব্যর্থতাকে স্বীকার করতে চাও না কেন?\n" +
                            "\n" +
                            "আপনার সঙ্গীর ব্যর্থতার কথা কখনোই তার মুখের উপরে বলতে যাবেন না। বিশেষ করে সেটি যদি হয় ক্যারিয়ারের উন্নতি কিংবা অর্থ-সম্পদ সংশ্লিষ্ট কোনো বিষয়। এতে ছেলেরা রাগান্বিত হয়ে উঠতে পারে। এমনকি আপনার উপর তার ঘৃণাও তৈরি হতে পারে।\n" +
                            "\n" +
                            "৩. আমার প্রাক্তন প্রেমিক এটা করতো, তুমি করো না কেন?\n" +
                            "\n" +
                            "সঙ্গীর সামনে কখনোই আপনার সাবেক প্রেমিকের প্রশংসা করবেন না। এমনকি 'প্রাক্তন প্রেমিক' ও 'তুমি' এই দু'টি শব্দকে এক বাক্যে আনতেই যাবেন না পারত পক্ষে! কারণ ছেলেরা এমনিতেই প্রতিযোগিতামূলক মনোভাবের হয়ে থাকে এবং সঙ্গিনীর মুখে তার প্রাক্তন প্রেমিকের প্রশংসাকে অপমান হিসাবে নেয়।\n" +
                            "\n" +
                            "৪. তোমার ওই বন্ধুটির সাথে আমাকে পরিচয় করিয়ে দিলে না কেন?\n" +
                            "\n" +
                            "এ কথাটি ভুল করেও আপনার ছেলে বন্ধুকে কখনো বলতে যাবেন না। সে তার সে সব বন্ধুদেরকেই আপনার সাথে পরিচয় করিয়ে দিবে যাদের প্রতি তার অগাধ বিশ্বাস ও আস্থা আছে। যাকে সে আপনার সাথে নিজ থেকে পরিচয় করিয়ে দেবে না আপনিও তার সাথে পরিচিত হবার কথা বলবেন না।\n" +
                            "\n" +
                            "৫. তোমার সমস্যাটা কি বুদ্ধু !\n" +
                            "\n" +
                            "বিশেষ করে তার পরিবার বা বন্ধুদের সামনে কখনোই এ কথাটি বলতে যাবেন না। ছেলেরা এমনিতে তার সঙ্গিনীর সাথে যতই বোকার মত আচরণ করুক না কেন তারা তাদের পরিবার ও বন্ধুদের সামনে সেটি প্রকাশ করতে চান না। কাজেই সবার সামনে এসব কথা বলে তাকে অপদস্থ না করাই ভালো।\n" +
                            "\n" +
                            "৬. তোমার চেয়ে অনেক যোগ্য লোকের সাথে আমি আগে মিশেছি\n" +
                            "\n" +
                            "এই বাক্যটি একেবারেই মনোবল ভেঙ্গে দিতে পারে একটি ছেলের। পরিস্থিতি যতই খারাপ হোক না কেন এই কথাটি বলার অর্থ আপনার সঙ্গীকে চূড়ান্ত ভাবে অপদস্থ করা। এ ধরণের কথা বার বার বলতে থাকলে সঙ্গীর সাথে অচিরেই সম্পর্কের ছেদ ঘটবে আপনার।   \n" +
                            "\n" +
                            "৭. থাক...আমি নিজেই করে নিব\n" +
                            "\n" +
                            "ছেলেরা সাধারণত মেয়েদেরকে তাদের ছোট-খাটো কাজগুলোতে সাহায্য করতে পছন্দ করে। যেমন বোতলের ছিপি খুলে দেয়া, ভারি ব্যাগ বহন করতে চাওয়া ইত্যাদি। এর মাধ্যমে ছেলেটি বোঝাতে চায় যে সে আপনাকে ভালোবাসে। কাজগুলো হয়ত তাকে ছাড়াই আপনি করতে সক্ষম। কিন্তু তাকে সেটা বুঝতে দেয়া উচিৎ নয়। এতে করে মনে কষ্ট পেতে পারে তারা।\n" +
                            "\n" +
                            "৮. তুমি খুবই অপরিপক্ব\n" +
                            "\n" +
                            "এই কথাটি ছেলেরা তার সঙ্গিনীর থেকে একদমই শুনতে চায় না। এই কথা বলা হলে ছেলেরা রাতারাতি তাদের ছেলেমানুষী ঝেড়ে ফেলে ভদ্র ও শান্ত হয়ে ওঠার চেষ্টা করে যা কিনা পরবর্তীতে সম্পর্ককে বিরক্তিকর ও একঘেয়ে করে তোলে।\n" +
                            "\n" +
                            "৯. তুমি আমাকে নিয়ে নিরাপত্তাহীনতায় ভোগো\n" +
                            "\n" +
                            "এই কথাটি যদি সত্যিও হয় তবুও তা সঙ্গীকে না বলাই ভালো। বিশেষ করে আপনি যদি আপনার সঙ্গীর তুলনায় বেশি সুন্দরী ও স্মার্ট হন। এই কথা সরাসরি আপনার সঙ্গীকে বললে তার নিরাপত্তাহীনতা আরো বেড়ে যাবে। এতে সে আপনাকে আরো বেশি করে সন্দেহ করবে।\n" +
                            "\n" +
                            "১০. তোমাকে কিছু কথা বলা দরকার\n" +
                            "\n" +
                            "সম্পর্কের মাঝে আপনাদের জরুরি কিছু কথা বলার থাককেই পারে। কিন্তু তাই বলে ঘটা করে এ কথাটি আপনার  সঙ্গীকে বলতে যাবেন না। এতে হিতে বিপরীত হতে পারে। এতে করে সে ভাবতে পারে আপনি হয়ত তাকে কোনো বিষয়ে অভিযোগ করতে যাচ্ছেন। এর ফলে তার থেকে আরো অসহযোগিতা পাওয়ার সম্ভাবনা বেড়ে যায়। এর চেয়ে হালকা কিছু দিয়ে কথা শুরু করে ধীরে ধীরে মূল প্রসঙ্গে আসা ভালো।");
                    startActivity(intent);
                }else if (i==1){
                    intent.putExtra("Title","শাস্তি, বকাবকি নয়, শিশুর সঙ্গে গল্প করুন, বন্ধু হন");
                    intent.putExtra("Description","শিশুরাই দেশ, সমাজ, জাতির ভবিষ্যত, ভবিষ্যতের কর্ণধার৷ বাবা-মার কাছে সন্তানের চেয়ে বড় আর কিছুই হতে পারে না৷ তাদের ঘিরেই তো সমস্ত পরিকল্পনা, সব স্বপ্ন৷ কিন্তু সন্তানকে মানুষের মতো মানুষ করে তোলা যে চাট্টিখানি কথা নয়!\n" +
                            "\n" +
                            "এই ‘মানুষ' করতে গিয়েই সমস্যার শুরু৷ শুরু বকাবকির, শুরু চর-থাপ্পর, খুন্তির খোঁচা, স্কেলের বাড়ি – এমন হাজারো রকম শাস্তির৷ আমাদের সমাজে হাজারো কাজের চাপ, টাকা-পয়সার টানাটানি, আবার অনেক সময় নেহায়েত অভ্যাসের বশেও বাবা-মা ছেলে-মেয়ের ওপর এমন শারীরিক ও মানসিক নির্যাতন করেন৷ আমি, আপনি বা আমাদের চেনাশোনা অনেকের জীবনেই এমন ঘটনা ঘটেছে, ঘটে চলেছে এখনো৷\n" +
                            "\n" +
                            "প্রশ্ন হলো, এমন শাস্তি কি সত্যিই কাজে দেয়? বাচ্চাকে গায়ের জোরে কি সত্যিই কিছু শেখানো যায়? জোর করে খাওয়ানো, পড়তে বসানো, খেলতে বারণ করা – এ সব আদতে কোনো কাজে আসে কিনা, সে কথা কখনও ভেবে দেখেছেন? আমার তো মনে হয়, এতে সন্তানের সঙ্গে দূরত্ব বাড়ে, বাড়ে উভয়পক্ষের মানসিক যন্ত্রণা, দ্বন্দ্ব, এমনকি অনেক সময় বিপথগামীও হয়ে যায় ছেলে বা মেয়েটি৷\n" +
                            "\n" +
                            "বাচ্চাদের যত্ন প্রয়োজন৷ তাদের আদর করে, নিয়ম করে হাঁটতে-দৌড়াতে-খেতে-পড়াশোনা করতে শেখাতে হয়৷ বন্ধুর মতো কাছে বসে জীবনের গুরুত্বপূর্ণ অধ্যায়গুলো তুলে ধরতে হয় সামনে৷ আসলে প্রকৃত শিক্ষা বলতে যা বোঝায় সেটা তো শুধু স্কুল-কলেজের লেখাপড়ার মধ্যে সীমাবদ্ধ নয়৷ চারিত্রিক ও আত্মিক উন্নয়নের বিষয়গুলোও যে এ শিক্ষার সঙ্গে জড়িত! আর সেই শিক্ষা বোধ হয় শুরু হয় জন্মের পরপরই৷\n" +
                            "\n" +
                            "দক্ষিণ এশিয়ার দেশগুলোতে বাবা-মা, আত্মীয়-স্বজন – সকলকেই প্রায়ই দেখা যায় বাচ্চার সঙ্গে, এমনকি শিশুর বয়স তিন-চার-পাঁচ-ছায়-সাত বছর পর্যন্তও, ‘ওলে বাবালে', ‘আমার সোনটা মনা' – এ সব আদুরে অর্থহীন ভাষায় কথা বলতে৷ এভাবে কথা বলা মানেই কি ভালোবাসা প্রকাশ? না, কক্ষনো না৷ আমার তো মনে হয়, এতে শিশুরা ঠিকমতো কথা বলতে শেখে না, শেখে না নিজের মনের কথা প্রকাশ করতে৷\n" +
                            "\n" +
                            "আবার দু-তিন বছরের বহু শিশুকেই দেখা যায় খেলনা, জিনিসপত্র নষ্ট করতে, যা খাচ্ছে তার অর্ধেক ফেলে দিতে, খাওয়ার বা অন্য কোনো কাজের সময় অহেতুক লাফালাফি করতে৷ আচ্ছা, এর জন্যও আমরা, মানে অভিভাবকরাই কি দায়ী নই? আমরা কি বলি না – ‘ও তো বাচ্চা, বড় হলে ঠিক হয়ে যাবে' অথবা ‘আমার ছেলে/মেয়েটি ভীষণ দুরন্ত, কী করি বলুন তো?' আর তারপর বাচ্চা আরো একটু বড় হয়ে যখন ঐ একই কাজ করে, আমরা কি তখন তার পিঠে এক ঘা অথবা কান ম'লে দেই না?\n" +
                            "\n" +
                            "নিজেকে একবার জিজ্ঞাসা করুন তো...৷ আপনি কি আপনার সন্তানকে নিয়ম করে একটি জায়গায় বসিয়ে খাইয়েছেন? হাতে মোবাইল ফোন, আইপ্যাড অথবা টেলিভিশন ছেড়ে নয়, বসিয়ে প্রতিদিন গল্পের বই পড়ে শুনিয়েছেন? আপনি নিজে কি সময়মতো খান? বই পড়েন? বা সব জিনিস গুছিয়ে রাখেন? ভুলেও আপনি কখনও তাদের সামনেই ঝগড়াঝাটি করেন না তো? দেন না তো গালাগাল?\n" +
                            "\n" +
                            "বাচ্চারা কিন্তু ছ'মাস বয়স থেকেই শিখতে শুরু করে৷ তখন থেকেই তারা যেমন আদর বোঝে, বোঝে ধমকও৷ বয়স দুই পেরোতে না পেরোতেই বাচ্চাদের নিয়ম-শৃঙ্খলা, সৌন্দর্যবোধ, গুছিয়ে রাখা, নষ্ট না করা, কোনটা করা উচিত এবং উচিত নয় – সেসব বোঝার ক্ষমতা আসে৷ এরপর ছয় বছরের মধ্যে তাদের মস্কিষ্ক পূর্ণতা পায়৷ এই বয়সের মধ্যে সে যা কিছু দেখে, শোনে এবং বোঝে, পরবর্তী জীবনে তার প্রতিফলন ঘটে৷ স্বার্থপরতা অথবা উদারতা, মায়া-মমতা – এগুলো কিন্তু সে আমাদের দেখেই শেখে, অথবা শেখে স্কুলের শিক্ষক-শিক্ষিকার কাছ থেকে৷\n" +
                            "\n" +
                            "ধরুন, আপনার বাচ্চাটা প্রতিদিন টিফিন ফেরত আনে৷ আপনি তখন তাকে যদি বলেন, ‘তুমি টিফিন খাও না কেন? তোমার বন্ধুরা খায় কেন? তুমি বোকা, না গাধা? আজ থেকে তোমার টিফিন বন্ধুরা যেন না খায়৷' এমনটা বলে তাকে কি আপনি আত্মকেন্দ্রিকতাই শেখালেন না? কেন বললেন না মিলেমিশে খাওয়ার কথা? আবার আপনার বাচ্চাটি খারাপ রেজাল্ট করার পর তাকে আপনি হয়ত বললেন, ‘তোমার খালাতো ভাই কত বুদ্ধিমান! খেলাধুলাতেও ভালো৷' অথবা ‘রানা কত ভালো রেজাল্ট করেছে দেখেছো? তুমি তো কিছুই পারো না৷' আচ্ছা, এতে করে আপনি আপনার সন্তানটিকে উৎসাহিত না নিরুৎসাহিত করলেন?\n" +
                            "\n" +
                            "এখানেই শেষ না৷ ঘরে যদি ছেলে থাকে, মেয়েও থাকে, তাহলে অনেকক্ষেত্রেই দেখা যায় বাবা-মা ছেলেটিকেই বেশি প্রাধান্য দিচ্ছে৷ তার পাতে বড় মাছটা, দুধের গ্লাসটা তুলে দিচ্ছি৷ ছেলেটিকে খেলতে পাঠাচ্ছি আনায়াসে, অথচ মেয়েটিকে, সে যদি ছেলেটির চেয়ে বয়সে ছোটও হয়, তাকে বলছি ঘরের কাজে হাত লাগাতে৷ কেন? এটা কি বৈষম্য নয়? এতে করে আপনার ছেলেটি কি কোনোদিন মেয়েদের সম্মান দিতে শিখবে? বড় হয়ে ওরাই কি মেয়েদের উত্যক্ত করবে না, বলুন?\n" +
                            "\n" +
                            "অথচ আমি, আপনারা, আমরা যদি ছোট থেকে ছেলে-মেয়েকে এক চোখে দেখতাম, যদি সান্নিধ্য, সাহচর্য দিয়ে, তাদের সাথে প্রাণখুলে স্পষ্ট ভাষায় কথা বলতাম, গল্প করতাম, বয়ঃসন্ধিতে বন্ধু হতাম – তাহলে হয়ত তাদের প্রতি আমাদের কঠোর হতে হতো না৷ প্রয়োজন হতো না গায়ে হাত তোলার, বকাঝকা করার৷ আর আমাদের কারো কারো সন্তানও হয়ে উঠতো না নিষ্ঠুর, সহিংস এবং পিতৃতন্ত্রের প্রতিভূ৷");
                    startActivity(intent);
                }else if (i==2){
                    intent.putExtra("Title","প্রকৃত বন্ধুর যেসব গুণাবলী থাকা উচিত");
                    intent.putExtra("Description","বিখ্যাত সমাজসেবক হেলেন কেলারের কথা মনে আছে? যিনি বলেছিলেন, ‘‘একাকী আলোয় হাঁটার চেয়ে একজন বন্ধুর সাথে অন্ধকারে হাঁটা উত্তম।’’\n" +
                            "\n" +
                            "আর জনপ্রিয় গায়ক অঞ্জন দত্তের সেই গানটির কথা-\n" +
                            "\n" +
                            "“বন্ধুত্বের হয় না পদবী\n" +
                            "\n" +
                            "বন্ধু তুমি কেঁদো না\n" +
                            "\n" +
                            "বন্ধু সবুজ চিরদিন\n" +
                            "\n" +
                            "বন্ধুত্বের বয়স বাড়ে না।\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "হয়তো তোমার বারান্দায়\n" +
                            "\n" +
                            "থাকবেনা আমার জামা\n" +
                            "\n" +
                            "তবুও মনের জানালায় অবাধ আনাগোনা\n" +
                            "\n" +
                            "বন্ধু তোমার আমি তাই, অন্য দাবি রেখো না।।’’\n" +
                            "\n" +
                            "সব নিয়ম অনিয়ম, বিশ্বাস, নির্ভরত আর বাধভাঙ্গা সম্পর্কের মিলনস্থল হচ্ছে বন্ধু। যে কথা কাউকে বলা যায় না, তার আগল অকপটে খুলে দেয়া যায় বন্ধুর সামনে। বন্ধু কখনো শিক্ষক, কখনো সকল দুষ্টুমির একমাত্র সঙ্গী। মনের বাঁধ ভাঙা উচ্ছ্বাস, আবেগ আর ছেলেমানুষী হুল্লোড়ের অপর নামই তো বন্ধুত্ব। চলার পথে যে সম্পর্কে থাকেনা জাতিভেদ, যে সম্পর্ক থাকে সব বাঁধনের ঊর্ধ্বে। সেই তো বন্ধু। অর্থ দিয়ে কেনা যায় না বন্ধুত্ব, কিংবা গায়ের জোরেও হয় না বন্ধুত্ব। বন্ধুত্বের জন্য চাই শুধু গুণ। আসুন জেনে নিই একজন ভালো বন্ধুর কিছু গুণাবলি।  \n" +
                            "\n" +
                            "প্রতি মুহূর্তের স্বতঃস্ফুর্ততা\n" +
                            "\n" +
                            "দু’জন মানুষকে পাশাপাশি রেখে বন্ধু হতে বললে বন্ধুত্ব হয় না। প্রেমের মতোই বন্ধুত্বও সাবলীল এবং স্বতঃস্ফুর্ত। ফলে প্রিয় বন্ধুরা কখনওই একসঙ্গে চুপচাপ থাকে না। তারা প্রাণবন্ত এবং উচ্ছল থাকে। যদি কথাই বলতে ইচ্ছা না করে তাহলে সেই বন্ধুত্ব না করাই ভালো। জোর করে অন্তত বন্ধুত্ব হয় না ৷\n" +
                            "\n" +
                            "বন্ধুত্ব চিরকালের\n" +
                            "\n" +
                            "প্রিয় বন্ধু চিরদিনের। হতে পারে দু’জনে আলাদা কলেজ গিয়েছেন, আলাদা শহরে জীবন-যাপন করেন, প্রাত্যহিক জীবনের নানা কর্মকান্ডে ব্যস্ত হয়ে পড়েছেন, কিন্তু এত কিছুর পরও ভালো বন্ধুত্ব কখনোই হারিয়ে যায় না। দুজন ভালো বন্ধু কখনোই একে অপরকে ভুলে যাবে না, বরং আরো বেশি করে একে অপরকে মনে করবে এবং সময় পেলেই একে অপরের সঙ্গে দেখা করে খুনসুটি করবে, এমনই হতে হবে বন্ধুত্ব। রাগ অভিমান করে পরস্পরকে ভুলে গেলে সেটা কখনোই প্রকৃত বন্ধুত্ব নয়। যেকোনো উপায়ে একে অপরের সাথে যুক্ত থাকা এবং মনের ভাব আদান-প্রদান করার চেষ্টার মধ্য দিয়ে বন্ধুত্বকে জিইয়ে রাখতে হয়।\n" +
                            "\n" +
                            "বন্ধুত্বে বিশ্বস্ত থাকা\n" +
                            "\n" +
                            "কথায় আছে বিশ্বাস ভালোবাসার শক্তি। আর বন্ধুত্বে বিশ্বাস রক্ষা করা খুবই জরুরি। তৃতীয় কোনো পক্ষের কথার সূত্র ধরে বন্ধুত্বের বিশ্বাসভঙ্গ কখনোই কাম্য নয়। প্রকৃত বন্ধুকে এ বিষয়টি সবসময় মাথায় রাখতে হয়, তবেই তো প্রকৃত বন্ধুত্ব হয়।\n" +
                            "\n" +
                            "দুঃসময়ে পাশে থাকা\n" +
                            "\n" +
                            "এক বন্ধুর বিপদে চিন্তা-ভাবনা ছাড়াই অন্য বন্ধুর সাড়া দেওয়াই হচ্ছে প্রকৃত বন্ধুত্বের পরিচয়। প্রয়োজনে সময়ে অসময়ে বন্ধুর বিপদে তাকে সাহায্য করা। যে বন্ধুর জন্য আপনি এমন করতে পারবেন এবং যে বন্ধু আপনার পাশে সর্বদা থাকতে পারবে, সে-ই আপনার সত্যিকার বন্ধু।\n" +
                            "\n" +
                            "বন্ধুত্বের ইচ্ছেকে সম্মান জানানো\n" +
                            "\n" +
                            "বন্ধুর ইচ্ছাকে সবসময় সম্মান জানানো উচিত। যদি তা পছন্দ না হয়, তবে সরাসরি বলুন। সম্পর্ক টিকিয়ে রাখতে পরস্পরের প্রতি শ্রদ্ধাবোধ থাকা অবশ্যই জরুরি। সমালোচনা করুন, তবে কটুক্তি নয়। তবে সমালোচনার ভাষা ব্যবহারে সচেতন হওয়ায় খুবই প্রয়োজন। একবার ভুল হলে তাকে ছুঁড়ে না ফেলে তা শুধরে নেওয়াই প্রকৃত বন্ধুর দায়িত্ব। বন্ধুর প্রতি বিনয়ী হওয়া বন্ধুত্বের প্রধান হাতিয়ার।\n" +
                            "\n" +
                            "বন্ধুর প্রকৃত শুভাকাঙ্ক্ষি হওয়া\n" +
                            "\n" +
                            "ভালো বন্ধু সবসময় বন্ধুর ভালো চায়। নিজের ভালো হোক সকলেই চায়, তবে তার জন্য বন্ধুর ক্ষতি হোক এমন ভাবা কিন্তু প্রকৃত বন্ধুর পরিচায়ক নয়। প্রকৃত বন্ধু চাইবেন তার নিজের উন্নতির পাশাপাশি আপনারও উন্নতি হোক। যেখানে কিংবা যত দূরেই থাকুন না কেন, বন্ধুর কল্যাণ কামনাই প্রিয় বন্ধুর পরিচায়ক\n" +
                            "\n" +
                            "বন্ধুত্বে সৎ থাকা\n" +
                            "\n" +
                            "বন্ধুত্বে অবশ্যই সৎ থাকতে হবে। মিথ্যা তথ্য কিংবা ধারণা দিয়ে বন্ধুত্বের সম্পর্ক গড়া যায়, কিন্তু গড়লেও তা কখনোই দীর্ঘস্থায়ী হয় না। আপনি যা সেটাই প্রকাশ করা এবং অযথা কৃত্রিমতা বর্জন করে নিজের ব্যক্তিত্বকে প্রদর্শনের মধ্য দিয়ে বন্ধুর কাছে স্বচ্ছ ধারণা তুলে ধরাই হচ্ছে প্রকৃত বন্ধুর দায়িত্ব। মনের মতো বন্ধু পেতে সততার কোনো বিকল্প নেই। সততা প্রিজারভেটিভ ছাড়াই সম্পর্কের বৃক্ষকে সতেজ রাখে।\n" +
                            "\n" +
                            "বন্ধুকে সময় দেওয়া\n" +
                            "\n" +
                            "দীর্ঘদিনের বন্ধুরা একে অন্যের পেছনে সময় ব্যয় করে। মানুষের পারিপার্শ্বিক অবস্থা প্রতিনিয়ত সময়ের সাথে সাথে পরিবর্তিত হয়। বন্ধুরা হয়তো আগের মতো সময় দিতে পারে না। এর ফলে যে দুই বন্ধুর মধ্যে সম্পর্কের ব্যাঘাত ঘটবে তা কিন্তু না। নতুন বন্ধুদের পাশাপাশি পুরোনো সম্পর্কগুলোকে ঝালাই করে নিতে হয় প্রতিনিয়ত। দৈনন্দিন ব্যস্ততায় পুরোনো বন্ধুত্বকে হারিয়ে ফেলা একদমই উচিত নয়। আপনার বন্ধু আর আপনার মাঝখানে কেবল এক মুঠোফোন দূরত্ব। বন্ধুকে মনে করুন, পুরোনো স্মৃতি রোমন্থন করুন।\n" +
                            "\n" +
                            "ভালো শ্রোতা হওয়া\n" +
                            "\n" +
                            "বন্ধুত্বে ভালো শ্রোতা হওয়াও খুব জরুরি। বন্ধুর সাথে আড্ডায় কেবল নিজের কথাগুলোকেই প্রাধান্য দেওয়া উচিত নয়। বন্ধুকেও কথা বলতে দেওয়া এবং আলোচনায় উৎসাহিত করার মধ্য দিয়ে দুজনের ভালো লাগা, মন্দ লাগা পরষ্পরের বুঝে নিতে সহজ হয়। বন্ধুর সমস্যাগুলোকে গুরুত্ব দেওয়া, বন্ধুর কাছে গুরুত্বপূর্ণ এমন বিষয় নিয়ে উপহাস না করাই প্রকৃত বন্ধুর দায়িত্ব। বন্ধু মানেই কেবল আমার সবটুকু কথা তাকে বলে ফেলা নয়, বরং তার কথাগুলোকেও আপন করে নেওয়া।\n" +
                            "\n" +
                            "বন্ধুত্বকে টিকিয়ে রাখতে শেখা\n" +
                            "\n" +
                            "বন্ধুত্ব টিকিয়ে রাখা অনেক কঠিন কাজ। তবে একজন প্রকৃত বন্ধু সব সময়ই সম্পর্ককে প্রাধান্য দেন। তবে অনেকেই জানে না যে বন্ধুত্ব কিভাবে টিকিয়ে রাখতে হয়। ফলে কারণে-অকারণে নানা সমস্যা সৃষ্টি হয়, দূরত্ব তৈরি হয়, বন্ধুত্ব ক্রমেই হারিয়ে যায়। বিপরীতে যারা দীর্ঘদিন বন্ধুত্ব টিকিয়ে রাখতে চান তাদের থাকতে হবে স্বাভাবিকতা আর প্রাণ চাঞ্চল্য। বন্ধুত্বের মাঝে ভুল বোঝাবুঝি, রাগ, অনুরাগ, ব্যস্ততা, এড়িয়ে চলা, নার্ভাস ভাব ইত্যাদি দূরে রাখা শিখতে হয়।\n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "বন্ধুত্ব নিয়ে কয়েকটি বিখ্যাত উক্তি-\n" +
                            "\n" +
                            "প্রকৃত বন্ধু হলো সেই যে তোমার পাশে থাকবে, যখন সারা বিশ্ব চলে যাবে অন্য পাশে। – ওয়াল্টার উইনচেল\n" +
                            "\n" +
                            "সত্যিকারের বন্ধুত্বের চেয়ে মূল্যবান কোনো কিছু এ পৃথিবীতে নেই। – থমাস একুইন্স\n" +
                            "\n" +
                            "পুরনো বন্ধুরা আশীর্বাদ স্বরূপ। কারণ তুমি তাদের সাথেই বোকা সাজতে পারো। – রাল্ফ ওয়াল্ডো এমারসন\n" +
                            "\n" +
                            "বন্ধুত্বের সম্পর্ক একটি মধুর দায়িত্ব, সুযোগ নয়। – খলিল গিব্রেন\n" +
                            "\n" +
                            "জীবনে বন্ধু পাওয়ার একমাত্র উপায় হচ্ছে নিজে একজন বন্ধু হওয়া। – রাল্ফ ওয়াল্ডো এমারসন\n" +
                            "\n" +
                            "বন্ধুত্ব হলো দুটি শরীরে এক মন। – ম্যানচিয়াস\n" +
                            "\n" +
                            "সত্যিকারের বন্ধুত্ব ভালো স্বাস্থ্যের মতো। যতক্ষণ না হারিয়ে যায় তার গুরুত্ব খুব কম উপলব্দি করা যায়। – চার্লস ক্যালেব কোল্টন\n" +
                            "\n" +
                            "আগুন্তক বলে কিছু নেই; কেবল বন্ধু, যাদের সাথে এখনো তোমার সাক্ষাৎ হয়নি। – উইলিয়াম কটলার ইয়েটস\n" +
                            "\n" +
                            "জীবনের সবচেয়ে বড় উপহার হচ্ছে বন্ধুত্ব, এবং আমি তা গ্রহণ করেছি। – হাবার্ট এইচ হামফ্রে\n" +
                            "\n" +
                            "বন্ধুত্ব এবং ভালো ব্যবহার তোমাকে সেখানে নিয়ে যাবে, যেখানে অর্থ তোমায় নিয়ে যেতে পারবে না। – মার্গারেট ওয়াকার\n" +
                            "\n" +
                            "একজন মানুষের বন্ধুত্ব তার সম্পত্তি পরিমাপের অন্যতম মাপকাঠি। – চার্লস ডারউইন");
                    startActivity(intent);
                }/*else if (i==3){
                    intent.putExtra("Title","");
                    intent.putExtra("Description","");
                    startActivity(intent);
                }else if (i==4){
                    intent.putExtra("Title","");
                    intent.putExtra("Description","");
                    startActivity(intent);
                }else if (i==5){
                    intent.putExtra("Title","");
                    intent.putExtra("Description","");
                    startActivity(intent);
                }else if (i==6){
                    intent.putExtra("Title","");
                    intent.putExtra("Description","");
                    startActivity(intent);
                }else if (i==7){
                    intent.putExtra("Title","");
                    intent.putExtra("Description","");
                    startActivity(intent);
                }else if (i==8){
                    intent.putExtra("Title","");
                    intent.putExtra("Description","");
                    startActivity(intent);
                }else if (i==9){
                    intent.putExtra("Title","");
                    intent.putExtra("Description","");
                    startActivity(intent);
                }*/
            }
        });
    }
}
