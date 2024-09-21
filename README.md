# Gurukul Public School App

## Overview
The **Gurukul Public School App** is a mobile application developed using **Kotlin** and **Java** in **Android Studio**. The app serves as a complete digital interface for students, parents, and school administrators to manage various activities and stay updated with school-related information.

## Features

### 1. **Admission Form**
   - Users can fill out an online form to apply for admission to the school.
   
### 2. **Fee Payment**
   - Integrated payment system to allow students or parents to pay school fees online.

### 3. **School Gallery**
   - View images and videos of the school's events, activities, and infrastructure.

### 4. **Announcements**
   - Real-time updates and announcements from the school, integrated using Firebase Remote Config for dynamic content delivery.

### 5. **Messaging**
   - Push notifications system to send important updates or messages to users.

### 6. **Firestore Database**
   - All the data (admission forms, announcements, etc.) are securely stored and managed in Firebase Firestore for real-time updates and scalability.

### 7. **About Us**
   - Provides detailed information about Gurukul Public School, including its mission, vision, and history.

### 8. **Contact Us**
   - Users can contact the school through email or phone, which are listed under this section.

### 9. **Locate Us**
   - The app includes a location feature that provides directions to the school using Google Maps.

### 10. **Help**
   - A support section for users to get help on using the app or resolve common issues.

## Tech Stack
- **Languages**: Kotlin, Java
- **IDE**: Android Studio
- **Backend**: Firebase Firestore, Firebase Remote Config
- **Push Notifications**: Firebase Cloud Messaging (FCM)
- **Location Services**: Google Maps API

## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/gurukul-public-school-app.git
   ```
2. **Open the project in Android Studio:**
3. **Connect Firebase:**
   - Ensure Firebase services (Firestore, Remote Config, and Cloud Messaging) are properly configured by adding the google-services.json file:
      - Download the google-services.json file from the Firebase console.
      - Place it in the app/ directory of your project.
4. Build and Run:
      - Build the app using Android Studio.
      - Run the app on an Android emulator or a physical Android device.
  
## Contribution
Feel free to submit issues, fork the repository, and send pull requests. Contributions are welcomed to improve the app's functionality and user experience.
