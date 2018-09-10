package com.tinyprojects.friendroid.essentials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class BeautyActivity extends AppCompatActivity {ListView lvTitleList;
    String [] itemTitle = {"মুখের উজ্জ্বলতা ও সৌন্দর্য বৃদ্ধি","ত্বক সুন্দর রাখতে অবশ্য করনীয়","ব্ল্যাকহেডস দূর করার ঘরোয়া উপায়",
            "ফল দিয়ে রূপচর্চা","ঝলমলে সুন্দর চুলের জন্য","রূপচর্চায় লেবুর কিছু ব্যবহার","ধরন বুঝে চুলের যত্ন","ত্বকের রুক্ষতা দূর করতে","চুলের অকালপক্কতা দূর করুন",
            "শীতের শেষে ত্বকের যত্ন","ত্বকের যত্নে সর্ষের তেল","আলুর রসে রূপচর্চা","নারকেল তেলে ঠোঁটের যত্ন"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty);
        lvTitleList = findViewById(R.id.lvBeauty);

        ChildListAdapter listAdapter = new ChildListAdapter(this,itemTitle);
        lvTitleList.setAdapter(listAdapter);
        lvTitleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            Intent intent = new Intent(BeautyActivity.this,ReadingActivity.class);
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0) {
                    intent.putExtra("Title","মুখের উজ্জ্বলতা ও সৌন্দর্য বৃদ্ধি");
                    intent.putExtra("Description","ঘরোয়া ও প্রাকৃতিক উপাদান ব্যবহার করেই উজ্জ্বল ও দীপ্তিময় ত্বক পাওয়া সম্ভব। \n" +
                            "প্রতিটা মানুষ জন্মগ্রহণের সময় সুন্দর ত্বক নিয়েই পৃথিবীতে আসে।\n" +
                            " ত্বকের সৌন্দর্য ধরে রাখার দায়িত্ব শিশুর অভিভাবকের এবং ব্যক্তির নিজের। \n" +
                            "বিভিন্নভাবে আপনি আপনার ত্বকের ক্ষতি করছেন। \n" +
                            "কিন্তু ভয় পাবেন না, কারণ কিছু প্রাকৃতিক উপাদানের সাহায্যে\n" +
                            "আপনি আপনার ত্বকের ক্ষতি পুষিয়ে নিতে পারেন। \n" +
                            "চলুন তাহলে সেই প্রাকৃতিক উপাদানগুলো সম্পর্কে জেনে নিই।\n" +
                            "\n" +
                            "১। কলার খোসা\n" +
                            "\n" +
                            "কলা খাওয়ার পরে খোসাটা ফেলে দেয়াই \n" +
                            "আমাদের সবার অভ্যাস কারণ ত্বকের \n" +
                            "উপর কলার খোসার জাদুকরি প্রভাবের \n" +
                            "কথা অনেকেই জানেন না। \n" +
                            "এখন থেকে কলার খোসা ফেলে না \n" +
                            "দিয়ে এর ভেতরের সাদা অংশটুকু\n" +
                            " মুখে ও ঘাড়ে ভালো করে ঘসে ঘসে লাগান। \n" +
                            "২০ মিনিট পর শুকিয়ে গেলে উষ্ণ \n" +
                            "গরম পানি দিয়ে ধুয়ে ফেলুন। এটি ব্যবহারের \n" +
                            "ফলে আপনার ত্বক উজ্জ্বল হবে। \n" +
                            "ভালো ফল পাওয়ার জন্য সপ্তাহে \n" +
                            "কয়েকবার এটি ব্যবহার করুন।\n" +
                            "\n" +
                            "২। মধু ও লেবু\n" +
                            "\n" +
                            "মধু ও লেবুর সমন্বয়ে তৈরি ফেস প্যাক ত্বক ফর্সা করতে পারে। \n" +
                            "সমপরিমাণ মধু ও লেবুর রস নিয়ে ভালোভাবে মেশান। \n" +
                            "এই মিশ্রণটি মুখে লাগিয়ে ২০ মিনিট রাখুন। তারপর ধুয়ে ফেলুন। \n" +
                            "যদি আপনার ত্বক শুষ্ক হয়ে থাকে তাহলে \n" +
                            "মধু ও শশার রস ব্যবহার করতে পারেন। \n" +
                            "এছাড়াও মধুর সাথে সমপরিমাণ দুধ মিশিয়ে \n" +
                            "ব্যবহার করতে পারে। যদি আপনার ত্বক \n" +
                            "তৈলাক্ত হয় তাহলে লো ফ্যাট দুধ ব্যবহার করুন। \n" +
                            "এই মিশ্রণটি মুখে লাগিয়ে কিছুক্ষণ পরে বৃত্তাকারে \n" +
                            "ম্যাসাজ করুন। তারপর ঠান্ডা পানি দিয়ে ধুয়ে ফেলুন।\n" +
                            "\n" +
                            "৩। টমাটো\n" +
                            "\n" +
                            "প্রতিমাসে একবার স্পেনের লা টোমাটিনা \n" +
                            "ফেস্টিভ্যালে অংশগ্রহণ করতে পারলে \n" +
                            "ফর্সা ও উজ্জ্বল ত্বক পাওয়া সহজ হত। \n" +
                            "টমাটোতে ত্বকের বর্ণ হালকা করার উপাদান আছে। \n" +
                            "এটি ত্বকের তেল শোষণ করে এবং ত্বকের \n" +
                            "উন্মুক্ত ছিদ্রের নিরাময় করে। আপনার ত্বকের \n" +
                            "জন্য প্রয়োজনীয় পরিমাণ টমাটো থেঁতলে নিয়ে \n" +
                            "মুখে ও শরীরের অন্যান্য স্থানে লাগান। \n" +
                            "শুকানো পর্যন্ত অপেক্ষা করুন। \n" +
                            "তারপর পানি দিয়ে ধুয়ে ফেলুন। \n" +
                            "টমাটো আপনার ত্বকে গোলাপি আভা এনে দেবে।\n" +
                            "\n" +
                            "৪। চন্দন\n" +
                            "\n" +
                            "প্রাচীন কাল থেকেই ত্বক ফর্সা করতে ব্যবহার হয়ে আসছে \n" +
                            "চন্দনের গুঁড়া যাকে কেউ হারাতে পারেনি। \n" +
                            "চন্দন ও হলুদ গুঁড়া মিশিয়ে পেস্ট তৈরি করুন। \n" +
                            "এর সাথে কাঠ বাদামের তেল মিশাতে পারেন। \n" +
                            "তারপর মিশ্রণটি আপনার মুখে লাগান। \n" +
                            "কিছুক্ষণ পরে বৃত্তাকারে ম্যাসাজ করুন। \n" +
                            "কিছুক্ষণ পরে ঠান্ডা পানি দিয়ে ধুয়ে ফেলুন। \n" +
                            "এটির ব্যবহারে আপনার ত্বকের বর্ণ হালকা হবে \n" +
                            "এবং আপনার মুখের দ্যুতি ছড়াবে।\n" +
                            "\n" +
                            "সব কিছুর শেষ কথা হচ্ছে ক্লিঞ্জিং, \n" +
                            "টোনিং ও ময়শ্চারাইজিং এই ৩ টির \n" +
                            "সমন্বয় ছাড়া ত্বক ভালো রাখা সম্ভব নয়। \n" +
                            "ত্বকের উজ্জ্বলতা অটুট রাখার জন্য ঘরের \n" +
                            "বাহিরে যাওয়ার পূর্বে ভালমানের সানস্ক্রিন \n" +
                            "লাগাতে ভুলবেন না যেনো।");
                    startActivity(intent);

                }else if (i==1){
                    intent.putExtra("Title","ত্বক সুন্দর রাখতে অবশ্য করনীয়");
                    intent.putExtra("Description","২। রোদ পরিহার করুনঃ\n" +
                            "ত্বকের উজ্জলতা বাড়াতে সবচাইতে বেশী জরুরী ত্বককে সূর্যের ক্ষতিকর রশ্মি থেকে বাঁচানো। যতটা সম্ভব রোদ এড়িয়ে চলবেন। বাইরে বের হলে ছাতা ও স্কার্ফ ব্যবহার করবেন অবশ্যই। বাজারে নানান রকমের সানস্ক্রিন কিনতে পাওয়া যায়, তবে সেগুলো অনেকের ত্বকেই মানানসই হয় না। বাইরে থেকে ফিরে প্রতিদিন একটি টমেটোর রস বা থেঁতো করা টমেটো মুখে লাগিয়ে ১৫ মিনিট রাখুন। তারপর ধুয়ে ফেলুন। রোদে পোড়ার ছাপ পড়বে না।\n" +
                            "\n" +
                            "৩। ঘরে বসেই ব্লিচ করুনঃ\n" +
                            "ব্লিচ করলে ত্বকের উজ্জলতা বৃদ্ধি পায়। কিন্তু এর জন্য পার্লারে যাওয়ার কোন প্রয়োজন নেই। বাসায় বসেই ব্লিচ করুন। সপ্তাহের ২/৩ বার করতে পারেন। \n" +
                            "\n" +
                            "    -ব্লিচের জন্য সব চাইতে ভালো প্রাকৃতিক উপাদান লেবু। একটি লেবু নিয়ে মাঝামাঝি কেটে নিন। এরপর এক খণ্ড নিয়ে মুখে হালকা ভাবে ঘষে ত্বকে শুকতে দিন। শুকিয়ে যাবার পর হালকা গরম পানি দিয়ে ঘষে তুলে ফেলুন। তবে যদি অ্যালার্জির সমস্যা থেকে থাকে তাহলে এটা ব্যবহার না করাই ভালো।\n" +
                            "    -যাদের অ্যালার্জির সমস্যা আছে তারা ১ টেবিল চামচ দুধ ও ১ টেবিল চামচ মধু মিশিয়ে ত্বকে লাগান। শুকিয়ে গেলে হালকা গরম পানি দিয়ে সামান্য ঘষে তুলে ফেলুন। এটা রোজ করতে পারবেন।\n" +
                            "\n" +
                            "৪। ত্বকের উপরিভাগ পরিষ্কার করুন প্রতিদিনঃ\n" +
                            "আমরা প্রতিদিনই প্রায় বাসা থেকে বের হই। বাইরে বের হলে যে কোনো ঋতুতেই ত্বকের ওপরে ধুলোর আস্তরণ পড়ে। বাসায় ফিরে শুধু ফেসওয়াস ব্যবহারে এই ধুলো যেতে চায় না। আর এই সব ধুলো দূর করতে আপনাকে প্রতিদিন ত্বকের উপরিভাগ পরিষ্কার করতে হবে। কিন্তু প্রতিদিন স্ক্রাব করাও সম্ভব নয়। সুতরাং আপনাকে ত্বকের উপরিভাগ হালকা করে অন্য কোনোভাবে পরিষ্কার করে নিতে হবে। এই জন্য প্রথমে ফেস ওয়াশ দিয়ে মুখ ধুয়ে নিন। এতে আলগা ময়লা পরিষ্কার হবে। তারপর কাঁচা দুধে তুলো ভিজিয়ে সেই তুলো দিয়ে মুখ ভালো করে পরিষ্কার করুন। কালো হয়ে ওঠা তুলোই প্রমাণ করবে কী পরিমাণ ময়লা আপনার ত্বকে জমে ছিল।\n" +
                            "\n" +
                            "৫। ত্বকে লাগান ঘরে তৈরি ত্বক উজ্জ্বল করার মাস্কঃ\n" +
                            "ত্বকের উজ্জ্বলতার জন্য মাস্ক ব্যবহার করতে হবে। আর তা ঘরে বসেই তৈরি করে নিন। ব্লিচ করার মত এই মাস্কও প্রতিদিনই ব্যবহার করুন। ১ সপ্তাহে রঙ উজ্জ্বল হবেই। -১ চা চামচ হলুদ বাটা নিন। হলুদ বাটা মিহি হতে হবে। হলুদ গুঁড়োও ব্যবহার করতে পারেন। এর সাথে ৩ টেবিল চামচ লেবুর রস নিয়ে ভালো করে মিশিয়ে নিন। ত্বকে লাগান। ১৫ মিনিট পরে পানি দিয়ে ধুয়ে ফেলুন। অ্যালার্জির সমস্যা থেকে থাকে তবে এটা ব্যবহার না করাই ভালো। -যাদের অ্যালার্জির সমস্যা আছে তারা ২ টেবিল চামচ মধু ও ২ টেবিল চামচ টক দই ভালো করে মিশিয়ে মুখে লাগান। ২০ মিনিট পর ভালো করে পানি দিয়ে ধুয়ে ফেলুন।\n" +
                            "\n" +
                            "৬। ভালো স্কিন প্রোডাক্টঃ\n" +
                            "সব কিছুর শেষে অবশ্যই ত্বকে ময়েসচারাইজার লাগাতে হবে। এর জন্য ভালো কোন ব্র্যান্ডের ময়েসচারাইজার ব্যবহার করুতে পারেন। যে সব স্কিন প্রোডাক্টে হাইড্রেটের মাত্রা বেশী সেসব কিনুন ও ব্যবহার করুন। ব্লিচের পর বা মাস্ক লাগিয়ে মুখ ধোয়ার পরে অবশ্যই ত্বকে ময়েসচারাইজার লাগাবেন। রাসায়নিক প্রসাধন ব্যবহার করতে না চাইলে অলিভ ওয়েল ব্যবহার করুন। রাতে অবশ্যই নাইট ক্রিম কিংবা অলিভওয়েল মেখে ঘুমোতে যাবেন। ১ সপ্তাহে ত্বকের উজ্জ্বলতা বাড়বেই।\n");
                    startActivity(intent);
                }
                else if (i==2){
                    intent.putExtra("Title","ব্ল্যাকহেডস দূর করার ঘরোয়া উপায়");
                    intent.putExtra("Description","ব্ল্যাকহেডস নাকের পাশে, থুতনিতে এবং কপালে জায়গাগুলোকে কালচে করে ফেলে। পরে এগুলো শক্ত হয়ে ত্বকের ছিদ্রপথ বন্ধ করে দেয়। এগুলোই ব্ল্যাকহেডস নামে পরিচিত। ব্ল্যাক হেডস দূর করার জন্য নিয়মিত ফেসিয়াল করতে হয়। পার্লারে গিয়ে ফেসিয়াল করা সময় ও খরচসাপেক্ষ। তাই চাইলে ঘরে বসেই সমাধান করতে পারেন এই সমস্যার।রথমে ত্বকের মরা চামড়া যেগুলো ত্বকের ছিদ্রপথ বন্ধ করে দিচ্ছে সে গুলা দূর করার জন্য ডিপ ফেস ক্লিনার ব্যবহার করুন। এরপর গরম পানির ভাপ দিয়ে ১০-১৫ মিনিট স্ট্রিম করুন। এতে ব্ল্যাকহেডস নরম হয়ে যাবে। পরে ফেসওয়াস দিয়ে ভালো করে মুখ ধুয়ে নিতে হবে। এভাবে নিয়মিত করলে ফল পাবেন। এক কাপ পানিতে ৪ টেবিল চামচ বেকিং সোডা পেস্ট করে মুখে লাগান। প্যাকটি ১০-১৫ মিনিট রাখুন পরে ভালো করে হালকা কুসুম গরম পানিতে মুখ ভালো করে ধুয়ে ফেলুন। এতেও আপনি উপকার পাবেন। দাঁত মাজার পেস্টের সাথে লবণ ও লেবু মিশিয়ে ব্রাশ দিয়ে আক্রান্ত এলাকা করে ঘষলেও ব্ল্যাকহেডস দূর হয়।");
                    startActivity(intent);
                } else if (i==3){
                    intent.putExtra("Title","ফল দিয়ে রূপচর্চা ");
                    intent.putExtra("Description","ত্বকের নানারকম সমস্যা থেকে মুক্তি পেতে বেছে নিতে পারেন প্রাকৃতিক পদ্ধতি। যাদের প্রতিদিন কোনো না কোনো কাজে বাইরে বের হতে হয় নানা কাজের প্রয়োজনে তাদের ধুলা-ময়লা এড়িয়ে যাওয়া খুব একটা সম্ভব নয়। আর তাই আবহাওয়ার বিরূপ প্রভাব থেকে ত্বককে রক্ষার জন্য সাহায্য নিতে পারেন ঘরোয়াভাবে তৈরি ফলের মাস্কের। এতে কোনো পার্শ্বপ্রতিক্রিয়া নেই, খুব সহজেই হাতের কাছে পাওয়া যায়। যে কোনো রকমের ত্বকের সমস্যা অনায়াসেই সারিয়ে তোলা সম্ভব নিয়মিত ফলের তৈরি মাস্কের সাহায্যে। কমলা\n" +
                            "কমলার খোসা শুকিয়ে গুঁড়া করে জারে রেখে দিতে পারেন। প্রতিদিন পানির সঙ্গে এ গুঁড়া মিশিয়ে লাগাতে পারে।\n" +
                            "\n" +
                            "আপেল\n" +
                            "আপেলের জুসের সঙ্গে ভিনেগার মিশিয়ে চুলের রং তৈরি করা যায়। এছাড়া আপেলের সঙ্গে মধু অথবা দুধ মিশিয়ে ফেসমাস্ক তৈরি করে মুখে লাগান। এতে আপনার মুখমণ্ডলের সৌন্দর্য বৃদ্ধি পাবে।\n" +
                            "\n" +
                            "এপ্রিকোট\n" +
                            "শুষ্ক, খসখসে ও মৃত ত্বক জীবন্ত করতে এপ্রিকোট বেছে নিতে পারেন। এপ্রিকোট মধু বা দুধের সঙ্গে ভালো করে মিশিয়ে ফেসমাস্ক তৈরি করুন।\n" +
                            "\n" +
                            "কলা\n" +
                            "মুখের দাগ দূর করার জন্য কলার বিকল্প নেই। পাকা কলা, মধু, দই বা দুধ ভালো করে মিশিয়ে পেস্ট তৈরি করে নিয়ে মুখে লাগান। কলা ও দই দিয়ে পেস্ট তৈরি করে ত্বকে লাগালে নরম ত্বকের অধিকারী হবেন। এ প্যাকটি চুলের জন্যও উপকারী।");
                    startActivity(intent);
                } else if (i==4){
                    intent.putExtra("Title","ঝলমলে সুন্দর চুলের জন্য");
                    intent.putExtra("Description","ঝলমলে চুলের আকাঙ্ক্ষা থাকে সবারই। তবু নানা কারণে চুল মলিন হয়ে পড়তে পারে। চুলের উজ্জ্বলতা ফেরাতে বেছে নিতে পারেন কিছু প্রাকৃতিক উপায়। চলুন জেনে নেয়া যাক-\n" +
                            "\n" +
                            "ডিম : ডিমের সাদা অংশের সাথে লেবু মিশিয়ে চুলে লাগিয়ে ১৫-২০ মিনিট পর শ্যাম্পু দিয়ে ধুয়ে ফেলুন। উপকার পাবেন।\n" +
                            "\n" +
                            "নারকেল তেল : প্রাকৃতিক ভাবে চুল স্ট্রেইট এবং ঝলমলে করতে নারবেল তেলের জুড়ি নেই। সপ্তাহে অন্তত ১ দিন নারকেল তেলের সাথে লেবু মিশিয়ে চুলে রাগান । ১ ঘন্টা পর শ্যাম্পু দিয়ে ধুয়ে ফেলুন।\n" +
                            "\n" +
                            "পাকা কলা : পাকা কলা চটকে নারকেল তেলের সাঘে মিিিশয়ে ব্যবহার করলে চুলের উজ্জলতা বৃদ্ধিপায়\n" +
                            "\n" +
                            "এলোভেরা : এলোভেরার রসের সাথে নারকেল তেল ও লেবু মিশিয়ে ব্যবহার করলে উপকার পাবেন আশা করি।");
                    startActivity(intent);
                } else if (i==5){
                    intent.putExtra("Title","রূপচর্চায় লেবুর কিছু ব্যবহার");
                    intent.putExtra("Description","শুধু সুগন্ধি ফল হিসেবেই নয়, ত্বকের যত্নেও লেবুর রয়েছে সমান কদর। ত্বক পরিষ্কার রাখতে লেবুর বিকল্প নেই। ব্রণ কমাতেও লেবুর রসের গুরুত্ব অনেক। এছাড়া চুলের সতেজতা বাড়াতেও রয়েছে লেবুর ভূমিকা। চলুন জেনে নেই রূপচর্চায় লেবুর কিছু ব্যবহার-\n" +
                            "\n" +
                            "ত্বক পরিস্কার করতে :\n" +
                            "লেবুর রসের সাথে মধু/ কাচা দুধ/ কাচা হলুদ বাটা/ মিশিয়ে নিয়মিত মুখে দিলে ত্বক পরিষ্কার থাকে। ত্বকের তেলতেলে ভাব দূর হয় মুখ উজ্জ্বল করে।\n" +
                            "\n" +
                            "ব্রণ থেকে মুক্ত পেতে :\n" +
                            "লেবুর রসের সাথে হালকা মধু মিশিয়ে তুলা দিয়ে ব্রণের উপর প্রলেপ দিয়ে রাখুন এতে করে রণের জীবাণু ধংস হয়ে ব্রণ থেকে মুক্তি পেতে সহায়তা করবে।\n" +
                            "\n" +
                            "চুলের উজ্জ্বলতা বৃদ্ধিতে :\n" +
                            "লেবুর রসের সাথে ডিমের সাদা অংশ দিয়ে পেস্ট তৈরি করে নিয়মিত চুলে দিলে চুলের গোড়া শক্ত হয় এবং চুল ঝলমলে ও উজ্জ্বল কালো হয়।");
                    startActivity(intent);
                } else if (i==6){
                    intent.putExtra("Title","ধরন বুঝে চুলের যত্ন ");
                    intent.putExtra("Description","সুন্দর চুল পেতে চাইলে প্রয়োজন পড়ে নিয়মিত পরিচর্যার। তবে সব ধরনের চুলের যত্ন একইরকম নয়। শুষ্ক, তৈলাক্ত আর স্বাভাবিক- এই তিন ধরনের চুল হতে পারে। তাই চুলের যত্নও নিতে হবে সে অনুযায়ী। চলুন জেনে নেই কিভাবে এই তিন ধরনের চুলের যত্ন নেবেন।\n" +
                            "\n" +
                            "শুষ্ক চুলের যত্ন : \n" +
                            "শীতে যত্ন নিতে জবাফুল বাটা, ২ চা চামচ মধু, ২ চা চামচ আমলকীর রস, টক দই, ডিমের কুসুম, মেথি গুঁড়া ও ২ চা চামচ ক্যাস্টর অয়েল একসঙ্গে মিশিয়ে পুরো চুলে লাগিয়ে রাখুন ঘণ্টাখানেক। তারপর শ্যাম্পু করে ধুয়ে ফেলুন। চুলের উজ্জ্বল ও মসৃণ ভাব ফিরিয়ে আনতে আধা মগ পানিতে লেবুর রস ও চায়ের লিকার মিশিয়ে চুল ধুয়ে ফেলুন। নিয়মিত করলে চুলের উজ্জ্বলতা ও মসৃণতা ফিরে আসবে।\n" +
                            "\n" +
                            "যদি স্বাভাবিক চুলের জন্য : \n" +
                            "স্বাভাবিক পরিচর্যাই যথেষ্ট। হট অয়েল ট্রিটমেন্ট ব্যবহার করতে পারেন সপ্তাহে দুই দিন। নিয়মিত চুল পরিষ্কার রাখুন। ন্যাচারাল কন্ডিশনিংয়ের জন্য চুলে তেল দিন। দিনে কয়েকবার মোটা দাঁতের চিরুনি দিয়ে চুল আঁচড়াবেন, তাহলে চুলে যেমন জট হবে না তেমনি মাথার ত্বকে রক্তসঞ্চালনও ভালো থাকবে।\n" +
                            "\n" +
                            "তৈলাক্ত চুলের যত্ন : \n" +
                            "এ রকম চুলের জন্য শুকনো রিঠা, শিকাকায়ি, আমলকী সারা রাত ভিজিয়ে পরদিন ফুটিয়ে ছেঁকে নিন। তরল মিশ্রণটি শ্যাম্পুর বিকল্প হিসেবে ব্যবহার করতে পারেন।\n" +
                            "\n" +
                            "সপ্তাহে দু’দিন বাড়িতে তৈরি হেয়ার প্যাক লাগান। ২ চা চামচ নিমপাতা গুঁড়া, ২ চা চামচ মেথি গুঁড়া, ২ চা চামচ আমলা, ২ চা চামচ টক দই, ১টি ডিমের সাদা অংশ, আধা কাপ উষ্ণ গরম পানি দিয়ে মিশিয়ে পুরো চুলে লাগিয়ে ঘণ্টাখানেক রাখুন। এরপর শ্যাম্পু করে ধুয়ে ফেলুন।\n" +
                            "\n" +
                            "খুশকি দূর করতে : \n" +
                            "\n" +
                            "নিজের চিরুনি, ব্রাশ, তোয়ালে, বালিশের কভার যথাসাধ্য পরিষ্কার ও আলাদা রাখুন। টক দই, মেহেদি পাতা বাটা, মেথি বাটা একসঙ্গে মিশিয়ে প্যাক হিসেবে পুরো চুলে ৩০-৪৫ মিনিট লাগিয়ে রেখে তারপর শ্যাম্পু করে ধুয়ে ফেলুন। ২-৩ বার ব্যবহারেই খুশকি সম্পূর্ণভাবে চলে যাবে। চুল হয়ে উঠবে অনেক সুন্দর।");
                    startActivity(intent);
                }else if (i==7){
                    intent.putExtra("Title","ত্বকের রুক্ষতা দূর করতে ঘরোয়া সমাধান");
                    intent.putExtra("Description","ত্বকের রুক্ষতা একেবারে অতিরিক্ত না হলে ঘরে বসেই সাধারণ রুক্ষ শুষ্ক ত্বকের পরিচর্যা করে ত্বকের কোমলতা ও মসৃণতা ফিরিয়ে আনতে পারেন খুব সহজেই।\n" +
                            "তবে ত্বক অতিরিক্ত শুষ্ক এবং ঘরোয়া সমাধান কাজে না লাগলে পার্লারে স্কিন এক্সপার্টের পরামর্শে স্কিন ট্রিটমেন্ট করা জরুরি। \n" +
                            "চলুন জেনে নেয়া যাক রুক্ষ শুষ্ক ত্বকের কোমলতা ফিরিয়ে আনতে ঘরোয়া সমাধান। \n" +
                            "\n"+
                            " ১ টেবিল চামচ বাটার, ১ চা চামচ মধু ও ১/৪ চা চামচ লেবুর রস নিন। এবার সব উপকরণ একটি বাটিতে একসাথে মিশিয়ে মসৃণ ক্রিমই পেস্টের মতো তৈরি করে নিন। \n" +
                            "এটি পরিষ্কার ত্বকে ব্রাশের মাধ্যমে সমান পাতলা করে পুরো ত্বকে লাগিয়ে নিন। \n" +
                            "\n"+
                            "২০ থেকে ৩০ মিনিট অপেক্ষা করুন এবং তারপর কুসুম গরম পানিতে একটি পাতলা নরম কাপড় ভিজিয়ে ত্বক পরিষ্কার করে নিন ভালো করে।\n" +
                            " ত্বক পুরো পরিষ্কার হতে যতোবার ভেজা কাপড় ব্যবহার করা লাগে করে নিন। এরপর শুকনো কাপড় দিয়ে ত্বক শুকিয়ে নিন।  \n" +
                            "\n"+
                            "সপ্তাহে ২/১ বার ব্যবহার করতে পারেন এই প্যাকটি, বাটার এবং মধু খুবই ভালো ময়েসচারাইজিং উপাদান যা ত্বকের রুক্ষতা একেবারেই দূর করে দিতে সক্ষম। \n" +
                            "তবে এই প্যাকটি ব্যাবহারের আগে অবশ্যই ত্বক স্ক্রাব করে ত্বক পরিষ্কার করে নিতে হবে এবং প্যাকটি বানিয়ে ফ্রিজে রাখা যাবে।");
                    startActivity(intent);
                }else if (i==8){
                    intent.putExtra("Title","যেভাবে চুলের অকালপক্কতা দূর করবেন");
                    intent.putExtra("Description","\n" +
                            "অল্প বয়সে চুল পেকে যাওয়ার সমস্যা শারীরিক কারণে শুরু হলেও ক্রমশ তা মানসিক দুশ্চিন্তার বিষয় হয়ে ওঠে। " +
                            "\n"+" কম বয়সে চুল পেকে যাওয়াকে ডাক্তারি পরিভাষায় বলে, প্রিম্যাচিওর ক্যান্যাইটিস। " +
                            "\n" +
                            " আধুনিক লাইফস্টাইলের পাশাপাশি এ সমস্যার কারণ কিন্তু অনেকটাই জিনগত।" +
                            " স্ট্রেসের ফলে শরীরে আয়রন, ম্যাঙ্গানিজ, প্যান্টোথেনিক অ্যাসিডের অভাব হতে পারে। যার থেকে চুলে অকালপক্কতা দেখা যেতে পারে। "+
                            " \n \n লিভারের ধারাবাহিক সমস্যা থাকলেও কম বয়সে চুল পেকে যায়। তাই সে ক্ষেত্রে লিভারের পরীক্ষা-নিরীক্ষা করাও জরুরি। এই সমস্যা পুরোপুরি জিনগত নয়। ২০ শতাংশ ক্ষেত্রেই দেখা গিয়েছে, উত্তরাধিকার সূত্রে লিউকোডার্মার সমস্যা হতে পারে। তাই সতর্ক হওয়া প্রয়োজন। " +
                            "\n"+
                            "\n"+ "পাকা চুল তুলে ফেললে পাকা চুল হওয়ার সম্ভাবনা বাড়ে, এটা কিন্তু সম্পূর্ণ ভুল ধারণা। যদি সামান্য কয়েকটা চুল সাদা হয়ে থাকে, তবে সেগুলো তোলার বদলে রুট থেকে কেটে ফেলাই হবে বুদ্ধিমানের কাজ। চুল রং করতে হেনা-মেহেন্দির মতো ন্যাচারাল প্রডাক্ট ব্যবহার করা যেতে পারে। " + "\n" +
                            "\n"+
                            "কারণ কেমিক্যাল প্রডাক্টে অনেক ক্ষেত্রে অ্যালার্জির ভয় থাকে। ভিটামিনের অভাব দূরীকরণের জন্য ৬ মাস বা এক বছরের কোর্স করা যেতে পারে। এ ছাড়া রোজকার ডায়েটে সবুজ শাকপাতা \n" +
                            "বা টাটকা ফল থাকা ভীষণভাবে জরুরি। যে সমস্যার ওপর আপনার হাত নেই, তা নিয়ে ভেবে ভেবে চুল আরও সাদা করে ফেলার কোনও প্রয়োজন নেই। " +
                            "\n"+
                            " তবে আপনি যা করতে পারেন, তা হলো খাদ্যাভাসে বদল ও স্বাস্থ্যকর জীবনযাপন। " +
                            " \n \n আর চুল রং করা এখন ফ্যাশন। সমস্যার জন্য হোক বা মনের খুশিতে হোক, চুল রাঙিয়ে নেওয়ার সুযোগ তো সব সব সময়ই রয়েছে। তবে সে ক্ষেত্রেও কী প্রডাক্ট ব্যবহার করছেন, তা নিয়ে অবশ্যই সতর্ক হবেন।");
                    startActivity(intent);
                }else if (i==9){
                    intent.putExtra("Title","শীতের শেষে ত্বকের যত্ন");
                    intent.putExtra("Description","শীত শেষের দিকে। বাতাসে ফাগুনের আমেজ যেন। প্রকৃতির হঠাৎ পরিবর্তনের চিহ্ন পড়ে আমাদের ত্বকেও। তাই এই সময়ে ত্বকের দিকে খেয়াল রাখা জরুরি। " +
                            "\n"+"ত্বক ভালো রাখতে আমরা যতো কিছুই করি না কেন, ত্বক পরিষ্কার-পরিচ্ছন্ন রাখা হচ্ছে প্রথম শর্ত। তাহলে ত্বক থাকবে সুন্দর ও সজীব। এছাড়া নিয়মিত ত্বকের পরিচর্যা করতে হবে। চলুন জেনে নেই এই সময়ে ত্বকের যত্ন নেয়ার কিছু উপায়- \n" +
                            "\n" +
                            "মুলতানি মাটি, কাঁচা হলুদ ও জলপাইয়ের তেল একসঙ্গে মিশিয়ে মাস্ক তৈরি করে মুখে, হাতে ও পায়ে লাগিয়ে ২০ মিনিট রেখে ধুয়ে ফেললেও ত্বক সতেজ হবে।\n" +
                            "\n"+
                            "যাদের হাতের চামড়া অত্যাধিক পরিমাণে রুক্ষ, তারা ক্ষারযুক্ত সাবান ব্যবহার না করে ময়েশ্চারাইজারযুক্ত সাবান ব্যবহার করলে উপকার পাবেন।\n" +
                            "তিলের তেল, গ্লিসারিন ও গোলাপজল সমপরিমাণে মিশিয়ে ত্বকে ব্যবহার করলে ত্বক সুন্দর ও মসৃণ হয়।\n" +
                            "\n"+
                            "সপ্তাহে একদিন মধু, গ্লিসারিন, লেবুর রস একসঙ্গে মিশিয়ে মাস্ক তৈরি করে লাগাতে পারেন। এই মাস্ক পরিষ্কারের পাশাপাশি ময়েশ্চারাইজারের কাজ করবে।\n" +
                            "পানি ত্বকের ময়েশ্চারাইজ হিসেবে কাজ করে। প্রচুর পরিমাণে পানি পান করলে ত্বকের ময়েশ্চারাইজ বজায় থাকবে।\n" +
                            "\n"+
                            "মাসে অন্তত একবার ভালো কোনো বিউটিপার্লার থেকে মেনিকিউর ও পেডিকিউর করলে হাত-পায়ের ত্বক সুন্দর থাকে। ত্বকে কালো দাগ হলে দাগযুক্ত স্থানে লেবুর রস ও মধু লাগান। লেবুর রস ও মধু ত্বকের কালো দাগ দূর করে। হাত-পায়ে গ্লিসারিন বা লোশন ম্যাসাজ করলে ত্বকের ভিতরে রক্ত-সঞ্চালনে হয়, ফলে ত্বক সজীব হয়ে ওঠে।\n" +
                            "এসময় প্রচুর তাজা ফলমূল ও শাক-সবজি পাওয়া যায়, এসব খেলেও ত্বক ভালো থাকে।");
                    startActivity(intent);
                }else if (i==10){
                    intent.putExtra("Title","ত্বকের যত্নে সর্ষের তেল");
                    intent.putExtra("Description","খাবারে সর্ষের তেলের ব্যবহার বেশ পুরানো। খিচুরি, তেহারি, ইলিশ ভাজা, ঝালমুড়ি, আচার- কোথায় না দরকার পরে সর্ষের তেলের! মজার ব্যাপার হলো সর্ষের তেলের এই ব্যবহার শুধু খাবারেই নয়, রয়েছে ত্বকের যত্নেও। আজ জেনে নেবো ত্বকের যত্নে সর্ষের তেলের কিছু ব্যবহার-\n" +
                            "\n" +
                            "ডার্ক স্পট, ট্যান বা পিগমেন্টেশন কাটিয়ে ওঠার জন্য বেসন, দই, লেবুর রসের সঙ্গে সর্ষের তেল মিশিয়ে মুখে-ঘাড়ে ১০-১৫ মিনিট লাগিয়ে রেখে ঠান্ডা পানিতে ধুয়ে ফেলতে হবে। সপ্তাহে তিন দিন তেল দিয়ে তৈরি এই মাস্ক ব্যবহার করলে এক মাসের মধ্যেই ফল পাওয়া যাবে।\n" +
                            "\n" +
                            "অনেক সময়ই স্কিন টোন হাল্কা করার জন্য আমরা অনেক চেষ্টা করি। টোনিং হাল্কা করতে সম পরিমাণে সর্ষের তেল ও নারকেল তেল মিশিয়ে প্রতি রাতে মিনিট পনেরো মুখে মাসাজ করতে হবে। তার পর মাইল্ড ফেস ওয়াশ দিয়ে ধুয়ে ফেলতে হবে।\n" +
                            "\n" +
                            "এই তেলে রয়েছে ভিটামিন এ, বি কমপ্লেক্স এবং ই। ফলে ত্বকের উপর সরষের তেলের নিয়মিত ব্যবহারে রিংকল কমে। ত্বককে করে তোলে সুস্থ ও সতেজ।\n" +
                            "\n" +
                            "রোদে বেরোনোর আগে অত্যন্ত অল্প পরিমাণে সর্ষের তেল মুখে লাগিয়ে নিন। এটা ক্ষতিকারক আলট্রাভায়োলেট রশ্মি থেকে ত্বককে রক্ষা করবে। কাজ করবে প্রাকৃতিক সানস্ক্রিনের মতোই। তবে বেশি পরিমাণ তেল লাগালে ত্বকে ধুলোবালি আটকে যাওয়ারও সম্ভাবনা থাকে।\n" +
                            "\n" +
                            "অনেকেরই সারা বছর ফাটা ঠোঁটের সমস্যা থাকে। প্রতি রাতে শোয়ার আগে নাভিতে দু’-তিন ফোঁটা সর্ষের তেল বুলিয়ে ঘুমান। পাবেন এই সমস্যা থেকে রেহাই।\n" +
                            "\n" +
                            "সর্ষের তেলে অ্যান্টি ব্যাকটিরিয়াল, অ্যান্টি ফাঙ্গাল উপাদান থাকার দরুন নানা অ্যালার্জি ও র্যাশ কমাতে সাহায্য করে। এমনকি ত্বকের শুষ্কতা ও চুলকানিও প্রতিরোধ করে।");
                    startActivity(intent);
                }else if (i==11){
                    intent.putExtra("Title","আলুর রসে রূপচর্চা ");
                    intent.putExtra("Description","সবচেয়ে পরিচিত আর সবচেয়ে জনপ্রিয় সবজিটি হচ্ছে আলু। এই এক আলু দিয়ে হরেক রকম খাবার তৈরি করা যায়। আবার অনেক রকম রান্নার সঙ্গে ব্যবহার করা যায় আলু। এসব তো রয়েছেই, আমাদের ত্বক ও চুলের যত্নেও আলু সমান কার্যকর। আর তাই তো রূপচর্চায় আলুর রসের ব্যবহার এখন উল্লেখযোগ্য অংশ। চলুন জেনে নেয়া যাক সেরকমই কয়েকটি ব্যবহার।\n" +
                            "\n" +
                            "লেবু রস ও আলু ছেঁচে তার রস মিশিয়ে মুখের লাগান। কালো দাগ দূর হয়ে যাবে। আলুর রস পুরো মুখে লাগান। ব্রন নিরাময়ে ভালো কাজ দেবে।\n" +
                            "\n" +
                            "একটি আলু ছেঁচে তার সঙ্গে গোলাপজল মিশিয়ে নিন। এক টেবিল চামচ লেবুর রস মেশান। তৈলাক্ত ত্বকে ১৫ মিনিট ব্যবহার করলে তেলতেলে ভাব দূর হবে। একটি আলু ছেঁচে তাতে এক টেবিল চামচ দই মিশিয়ে পেস্ট তৈরি করুন। এটি ত্বকের বলিরেখা দূর করবে।\n" +
                            "\n" +
                            "চোখের নিচের ডার্ক সার্কেল দূর করতে হলে আলু কেটে সেখানে লাগিয়ে রাখুন। চোখের ফোলা ভাব দূর করতে হলে আলু চাকতি করে কেটে চোখের ওপর দিয়ে রাখুন। বেশ আরামও পাবেন চোখে।\n" +
                            "\n" +
                            "ত্বকের ওপরে হালকা জখম হলে তাতে আলু পাতলা করে কেটে লাগিয়ে রাখুন। প্রদাহ কমে যাবে। তবে বেশি ক্ষততে লাগাবেন না। একটি ডিমের সাদা অংশ এবং আলু ছেঁচে তার রস নিয়ে মিশ্রণ তৈরি করুন। একটি ব্রাশ দিয়ে ত্বকে লাগান। ২০ মিনিট পর ধুয়ে ফেলুন। এটি মাস্কের কাজ করে।\n" +
                            "\n" +
                            "মাঝারি সাইজের আস্ত একটি আলু ছেঁচে তাতে একটি লেবুর রস মিশিয়ে মুখে লাগান। ৩০ মিনিট পর ধুয়ে ফেলুন। এতে ত্বকের ক্ষতিগ্রস্ত কোষগুলো সুস্থতা ফিরে পাবে। একটি আলু ও একটি শসা একসঙ্গে ব্লেন্ড করে নিন। এতে এক টেবিল চামচ বেকিং সোডা ও এক টেবিল চামচ পানি মেশান। এটি একটি দারুণ ক্লিনজার হিসেবে কাজ করবে।\n" +
                            "\n" +
                            "অতিবেগুনী রশ্মিতে ত্বক পুড়ে গেলে আলুর স্লাইস দারুণ কাজে দেয়। হালকা চুলকানি, লালচে ভাব হওয়া এবং পোকা-মাকড়ের কামড়ে আলু কেটে লাগালে যন্ত্রণা প্রশমিত হবে।\n" +
                            "\n" +
                            "আলু ছেঁচে তার রসে একটি টিস্যু বা পেপার টাওয়েল ভিজিয়ে নিয়ে ত্বকে ২০ মিনিট লাগিয়ে রাখুন। এটি একটি উপকারী আলুর ফেস মাস্ক। আলুর রসের সঙ্গে দুই টেবিল চামচ অলিভ ওয়েল এবং এক টেবিল চামচ মধু মিশিয়ে নিন। এই মিশ্রণটি ১০ মিনিট ত্বকে লাগিয়ে রাখুন। ময়েশ্চারের অভাব দূর হবে।\n" +
                            "\n" +
                            "রুক্ষ ও শুষ্ক চুলে আলু ছেঁচে তার রস লাগালে তা চুলের ময়েশ্চারের কাজ করে। একটি আলু ছেঁচে তার সঙ্গে গোলাপজল মিশিয়ে নিন। শুষ্ক ত্বকে ১৫ মিনিট ব্যবহার করলে তেলতেলে ভাব চলে আসবে।");
                    startActivity(intent);
                }else if (i==12){
                    intent.putExtra("Title","নারকেল তেলে ঠোঁটের যত্ন");
                    intent.putExtra("Description","ঠোঁটের শুষ্কতার সমস্যা শুধু শীতেই নয়, অনেকের ক্ষেত্রে সারা বছরই দেখা যায়। বাজারের বেশিরভাগ লিপবামে থাকা রাসায়নিক উপাদান ঠোঁটকে আরো রুক্ষ করে তোলে তাই ঠোঁট ভালো রাখতে লিপবামের পরিবর্তে ব্যবহার করুন নারকেল তেল। এতে যেমন কোনো পার্শ্বপ্রতিক্রিয়া হবে না, তেমনই ঠোঁট থাকবে নরম ও সজীব।\n" +
                            "\n" +
                            "নারকেল তেল দিয়ে বাড়িতেই বানিয়ে ফেলুন লিপবাম। এক চা চামচ নারকেল তেলের সঙ্গে এক চা চামচ অলিভ অয়েল মেশান। তাতে সামান্য মধু মিশিয়ে দিন। নিয়ম করে প্রতিদিন মিশ্রণটি ঠোঁটে লাগান।\n" +
                            "\n" +
                            "হাতে সামান্য নারকেল তেল নিয়ে ঠোঁটে লাগান। এবার হালকাভাবে ম্যাসাজ করুন। দেখবেন, ঠোঁট আগের চেয়ে অনেক নরম হয়েছে।\n" +
                            "\n" +
                            "একটি বাটিতে কয়েক ফোঁটা নারকেল তেল নিন। তাতে সামান্য লবণ মেশান। মিশ্রনটিতে তুলো ডুবিয়ে সেটি ঠোঁটে লাগান। এবার হাত দিয়ে ভালো করে ঠোঁট ঘষে নিন। কিছুক্ষণ রাখার পর ধুয়ে নিন। দেখবেন ঠোঁটের রুক্ষতা অনেকটা চলে গেছে।");
                    startActivity(intent);
                }
            }
        });
    }
}
