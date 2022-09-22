package com.ahmedalamin.androidnativeinterviewquestions

/**
 * Created by Ahmed Alamin on 9/22/2022.
 * i will explain multiple questions related to android development interviews
 */

/*

1-What is Application class?
The Application class in Android is the base class within an Android app that contains all
other components such as activities and services. The Application class, or any subclass of the
Application class, is instantiated before any other class when the process for your application/package is created.
https://guides.codepath.com/android/Understanding-the-Android-Application-Class  >>Check this link for more explanation




2-What is Context?

It allows us to access resources.
It allows us to interact with other Android components by sending messages.
It gives you information about your app environment.
there are two kind of context 1- Applcation Constent  2- Activity context
https://www.geeksforgeeks.org/what-is-context-in-android/  >Check this link for more explanation



3-Why can't bytecode be run in Android?
Because to run Java bye code, you need a JVM (Java Virtual Machine).
Android doesn’t have JVM. It has something called ART (Android Run Time).
Before ART there was DVM (Dalvik Virtual Machine).
The main reason why Android doesn’t use JVM is - it’s heavy resource
intensive and hence not suited for resource constrained environment of a mobile device.



What is a BuildType in Gradle? And what can you use it for?




Explain the build process in Android:
What is the Android Application Architecture?
Describe activities
Lifecycle of an Activity
What’s the difference between onCreate() and onStart()?
Scenario in which only onDestroy is called for an activity without onPause() and onStop()?
Why would you do the setContentView() in onCreate() of Activity class?
onSavedInstanceState() and onRestoreInstanceState() in activity?
Describe services
Difference between Service & Intent Service
Difference between AsyncTasks & Threads?
Difference between Service, Intent Service, AsyncTask & Threads
What are Handlers?
What is a Job Scheduling?
How does memory leak happen?
What is the onTrimMemory() method?
Android Bound Service
What is a ThreadPool? And is it more effective than using several separate Threads?
Difference between Serializable and Parcelable?
Difference between Activity & Service
How would you update the UI of an activity from a background service?
What is an intent?
Launch modes in Android?
How does the activity respond when the user rotates the screen?
How to prevent the data from reloading and resetting when the screen is rotated?
Mention two ways to clear the back stack of Activities when a new Activity is called using intent
What’s the difference between FLAG_ACTIVITY_CLEAR_TASK and FLAG_ACTIVITY_CLEAR_TOP?
Describe content providers
Access data using Content Provider:
What is a Sticky Intent?
What is a Pending Intent?
What is an Action?
What are intent Filters?
Describe fragment
Describe fragment lifecycle
What is the difference between fragments & activities. Explain the relationship between the two.
When should you use a fragment rather than an activity?
Difference between adding/replacing fragment in backstack?
Why is it recommended to use only the default constructor to create a Fragment?
What are retained fragments?
Difference between FragmentPagerAdapter vs FragmentStatePagerAdapter?
How to support different screen sizes?
Briefly describe some ways that you can optimize View usage
What are the permission protection levels in Android?
What’s the difference between commit() and apply() in SharedPreferences?

 */