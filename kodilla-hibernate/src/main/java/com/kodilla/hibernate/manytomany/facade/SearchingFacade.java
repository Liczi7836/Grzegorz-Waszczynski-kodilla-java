package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SearchingFacade {

   private static final Logger LOGGER = LoggerFactory.getLogger(SearchingFacade.class);

   private final CompanyDao companyDao;

   private final EmployeeDao employeeDao;

   @Autowired
   public SearchingFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
      this.companyDao = companyDao;
      this.employeeDao = employeeDao;
   }

   public List<Employee> employeeSearch(String partOfName){
      LOGGER.info("Searching employee by given part of name");
      boolean wasError = false;
      try {
         List<Employee> employeeList = employeeDao.retrieveEmployeeByPartOfName(partOfName);
         if (employeeList.isEmpty()){
            LOGGER.error("List of employees is empty");
            wasError = true;
         }
         return employeeList;
      } finally {
         if (wasError){
         LOGGER.info("Employee not found!");
         }

      }
   }

   public List<Company> companySearch(String partOfName){
      LOGGER.info("Searching company by given part of name");
      boolean wasError = false;
      try {
         List<Company> companyList = companyDao.retrieveCompanyByPartOfName(partOfName);
         if (companyList.isEmpty()){
            LOGGER.error("List of companies is empty");
            wasError = true;
         }
         return companyList;
      } finally {
         if (wasError){
            LOGGER.info("Company not found!");
         }
      }
   }


}
