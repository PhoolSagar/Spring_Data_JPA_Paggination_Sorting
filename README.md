# Spring Data JPA - Sorting & Pagination 🚀

This repository demonstrates the implementation of Sorting and Pagination in Spring Data JPA using Spring Boot and JDK 21 (LTS).

It explains how to efficiently manage and retrieve large datasets using the Sort and Pageable interfaces.

---

## 📂 Project Structure

Spring_Data_Jpa_Sort_Ex-1  
Spring_Data_Jpa_Pagination_Ex-1  
Spring_Data_Jpa_Pagination_Ex-2  
Spring_Data_Jpa_Pagination_Ex-3  

Each module focuses on a specific implementation of sorting or pagination features.

---

## 🛠️ Technologies Used

- JDK 21 (LTS)
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL / H2 Database
- Maven

---

## 📌 Concepts Covered

✔ Sorting using `Sort` class  
✔ Sorting by Single & Multiple Fields  
✔ Ascending & Descending Order  
✔ Pagination using `Pageable` interface  
✔ `PageRequest` implementation  
✔ Working with `Page` object  
✔ Combining Sorting and Pagination  
✔ Performance Optimization for Large Datasets  

---

## 💡 Why Sorting & Pagination?

In real-world backend applications, handling large datasets efficiently is critical.

- Sorting allows organized data retrieval.
- Pagination improves performance by limiting records fetched per request.
- Reduces memory usage and enhances scalability.

---

## 🧠 Example Code

### Sorting Example

```java
Sort sort = Sort.by("salary").descending();
List<Employee> employees = repository.findAll(sort);
