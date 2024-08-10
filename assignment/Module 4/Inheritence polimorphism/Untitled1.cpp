#include <iostream>
#include <vector>
#include <fstream>
#include <iomanip> // For std::setprecision and std::fixed

using namespace std;

// Item class representing a menu item
class Item {
private:
    string name;
    double price;
    int quantity;

public:
    Item(string n, double p, int q) : name(n), price(p), quantity(q) {}

    string getName() const { return name; }
    double getPrice() const { return price; }
    int getQuantity() const { return quantity; }

    void setQuantity(int q) { quantity = q; }
};

// Order class representing a customer's order
class Order {
private:
    vector<Item> items;
    double total;

public:
    Order() : total(0.0) {}

    void addItem(Item item) {
        items.push_back(item);
        total += item.getPrice();
    }

    double getTotal() const { return total; }

    void displayOrder() const {
        cout << "Your Order:\n";
        for (const Item& item : items) {
            cout << item.getName() << " - $" << item.getPrice() << "\n";
        }
        cout << "Total: $" << fixed << setprecision(2) << getTotal() << "\n";
    }

    // Save order to a file
    void saveOrderToFile() const {
        ofstream outFile("orders.txt", ios::app);
        if (outFile.is_open()) {
            outFile << "Order Total: $" << fixed << setprecision(2) << getTotal() << "\n";
            outFile << "Items:\n";
            for (const Item& item : items) {
                outFile << item.getName() << " - $" << item.getPrice() << "\n";
            }
            outFile << "----------------------------------------\n";
            outFile.close();
        } else {
            cout << "Unable to save order to file.\n";
        }
    }
};

// Function to display the menu
void displayMenu(const vector<Item>& menu) {
    cout << "Menu:\n";
    int num = 1;
    for (const Item& item : menu) {
        cout << num << ". " << item.getName() << " - $" << item.getPrice() << "\n";
        num++;
    }
}

// Function to simulate the ordering process
void orderProcess(vector<Item>& menu) {
    Order order;
    char choice = 'y';

    while (tolower(choice) == 'y') {
        displayMenu(menu);

        int selection;
        cout << "Enter item number to order (1-" << menu.size() << "): ";
        cin >> selection;

        if (selection >= 1 && selection <= menu.size()) {
            Item selectedItem = menu[selection - 1];
            order.addItem(selectedItem);

            cout << selectedItem.getName() << " added to your order.\n";

            cout << "Add another item? (y/n): ";
            cin >> choice;
        } else {
            cout << "Invalid selection. Please try again.\n";
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
        }
    }

    order.displayOrder();
    order.saveOrderToFile();
}

int main() {
    // Initialize menu items
    vector<Item> menu;
    menu.push_back(Item("Burger", 5.99, 10));
    menu.push_back(Item("Fries", 2.99, 20));
    menu.push_back(Item("Drink", 1.99, 15));

    // Simulate ordering process
    orderProcess(menu);

    return 0;
}

