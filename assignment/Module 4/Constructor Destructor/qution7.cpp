//7. Write a C++ program to implement a class called Date that has private
//member variables for day, month, and year. Include member functions to
//set and get these variables, as well as to validate if the date is valid.
#include <iostream>
using namespace std;
class Date {
private:
    int day;
    int month;
    int year;

public:
    Date(int d, int m, int y) {
    	day= d;
    	month=m;
    	year=y;
    }
    int getDay() const {
        return day;
    }

    int getMonth() const {
        return month;
    }

    int getYear() const {
        return year;
    }
     isValidDate() const {
        if (month < 1 || month > 12) {
        cout<<"invalid month";
        }
        if (day < 1 || day > 31) {
             cout<<"invalid day";
        }
        if (year < 0) {
            cout<<"invalid year";
        }
        cout<<"valid date";
    }
};

main() {
    Date date(23, 7, 2024);
    std::cout << "Date: " << date.getDay() << "/" << date.getMonth() << "/" << date.getYear() << std::endl;
        if (date.isValidDate()) {
        std::cout << "This is a valid date." << std::endl;
    } else {
        std::cout << "This is not a valid date." << std::endl;
    }
}

        	
