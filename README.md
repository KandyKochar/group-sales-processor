# Group Sales Processor

A Java OOP application for processing and displaying sales data across customers and products.

## Overview
Models a sales processing system with customers, products, and bill generation. Demonstrates object relationships, collections, and formatted console output.

## Features
- Customer and Product data models
- Sales processor with billing logic
- Formatted bill display with totals
- Multi-customer batch processing

## Technologies Used
- **Language:** Java (JDK 8+)
- **IDE:** Eclipse

## Project Structure
```
src/
+-- Customer.java           # Customer data model
+-- Products.java           # Product model with pricing
+-- SalesProcessor.java     # Sales calculation engine
+-- DisplayBillSales.java   # Formatted bill output
+-- Main.java               # Entry point with sample data
```

## Usage
```bash
javac src/*.java -d out/
java -cp out/ Main
```

## Author
Kandy Kochar
