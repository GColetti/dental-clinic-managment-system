package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import java.net.URISyntaxException;
import java.net.URI;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@SpringBootApplication
public class HerokuConnectApplication {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, @ModelAttribute("username") String username, @ModelAttribute("password") String password) {
        String error = "";
        if (username.equals("admin") && password.equals("admin123")) {
            return "adminview";
        } else if (username.equals("patient") && password.equals("patient123")) {
            return "patientview";
        } else if (username.equals("employee") && password.equals("employee123")) {
            return "employeeview";
        } else {
            error = "Invalid username or password";
            model.addAttribute("error", error);
            return "login";
        }
    }

    @RequestMapping(value = "/")
    public String home(Model model) {
        return "home";
    }

    @RequestMapping(value = "/home")
    public String home2(Model model) {
        return "home";
    }

    @RequestMapping("/adminview")
    public String adminview(Model model) {
        return "adminview";
    }

    @RequestMapping("/patientview")
    public String patientview(Model model) {
        return "patientview";
    }

    @RequestMapping("/employeeview")
    public String employeeview(Model model) {
        return "employeeview";
    }

    @RequestMapping("/createappointmentform")
    public String createAppointmentForm(Model model) {
        model.addAttribute("appointment", new Appointment());
        return "createappointment";
    }

    @RequestMapping("/createbranchform")
    public String createBranchForm(Model model) {
        model.addAttribute("branch", new Branch());
        return "createbranch";
    }

    @RequestMapping("/createdentalprocedureform")
    public String createDentalProcedureForm(Model model) {
        model.addAttribute("dentalprocedure", new DentalProcedure());
        return "createdentalprocedure";
    }

    @RequestMapping("/createdentistappointmentform")
    public String createDentalAppointmentForm(Model model) {
        model.addAttribute("dentistappointment", new Dentist_Appointment());
        return "createdentistappointment";
    }

    @RequestMapping("/createpatient")
    public String createPatient(Model model) {
        model.addAttribute("patient", new Patient());
        return "createpatient";
    }

    @RequestMapping("/createinvoiceform")
    public String createInvoiceForm(Model model) {
        model.addAttribute("invoice", new Invoice());
        return "createinvoice";
    }

    @RequestMapping("/createemployeeform")
    public String createEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "createemployee";
    }

    @RequestMapping("/createdentalprofessionalform")
    public String createDentalProfessionalForm(Model model) {
        model.addAttribute("dentalprofessional", new DentalProfessional());
        return "createdentalprofessional";
    }

    @RequestMapping("/createreview")
    public String createReview(Model model) {
        model.addAttribute("review", new Review());
        return "createreview";
    }

    @RequestMapping("/appointments")
    public String Appointment(Model model) {
        try {
            Connection connection = getConnection();
            Statement stmt = connection.createStatement();
            String sql;
            sql = "SELECT AppointmentId, PatientId,  ApptDate, StartTime, EndTime, AppointmentType, Status, RoomAssigned FROM Appointment";
            ResultSet rs = stmt.executeQuery(sql);
            StringBuffer sb = new StringBuffer();
            List appointments = new ArrayList<>();
            // Extract data from result set
            while (rs.next()) {
                int AppointmentId = rs.getInt("AppointmentId");
                int PatientId = rs.getInt("PatientId");
                Date ApptDate = rs.getDate("ApptDate");
                Time StartTime = rs.getTime("StartTime");
                Time EndTime = rs.getTime("EndTime");
                String AppointmentType = rs.getString("AppointmentType");
                String Status = rs.getString("Status");
                int RoomAssigned = rs.getInt("RoomAssigned");
                appointments.add(new Appointment(AppointmentId, PatientId, ApptDate, StartTime, EndTime,
                        AppointmentType, Status, RoomAssigned));
            }
            model.addAttribute("appointments", appointments);
            return "appointment";
        } catch (Exception e) {
            return e.toString();
        }
    }

    @RequestMapping("/branches")
    public String Branch(Model model) {
        try {
            Connection connection = getConnection();
            Statement stmt = connection.createStatement();
            String sql;
            sql = "SELECT BranchId, City FROM Branch";
            ResultSet rs = stmt.executeQuery(sql);
            StringBuffer sb = new StringBuffer();
            List branches = new ArrayList<>();
            // Extract data from result set
            while (rs.next()) {
                int BranchId = rs.getInt("branchid");
                String City = rs.getString("city");
                branches.add(new Branch(BranchId, City));
            }
            model.addAttribute("branches", branches);
            return "branch";
        } catch (Exception e) {
            return e.toString();
        }
    }

    @RequestMapping("/dentalprocedures")
    public String DentalProcedure(Model model) {
        try {
            Connection connection = getConnection();
            Statement stmt = connection.createStatement();
            String sql;
            sql = "SELECT  ProcedureCode, ProcedureType, Description, TotalCharge FROM DentalProcedure";
            ResultSet rs = stmt.executeQuery(sql);
            StringBuffer sb = new StringBuffer();
            List dentalprocedures = new ArrayList<>();
            // Extract data from result set
            while (rs.next()) {
                String ProcedureCode = rs.getString("procedurecode");
                String ProcedureType = rs.getString("proceduretype");
                String Description = rs.getString("description");
                int TotalCharge = rs.getInt("totalcharge");
                dentalprocedures.add(new DentalProcedure(ProcedureCode, ProcedureType, Description, TotalCharge));
            }
            model.addAttribute("dentalprocedures", dentalprocedures);
            return "dentalprocedure";
        } catch (Exception e) {
            return e.toString();
        }
    }

    @RequestMapping("/patient")
    public String Patient(Model model) {
        try {
            Connection connection = getConnection();
            Statement stmt = connection.createStatement();
            String sql;
            sql = "SELECT  UserId, PatientId, Email, DateOfBirth FROM Patient";
            ResultSet rs = stmt.executeQuery(sql);
            StringBuffer sb = new StringBuffer();
            List patient = new ArrayList<>();
            // Extract data from result set
            while (rs.next()) {
                int UserId = rs.getInt("UserId");
                int PatientId = rs.getInt("PatientId");
                String Email = rs.getString("Email");
                Date DateOfBirth = rs.getDate("DateOfBirth");
                patient.add(new Patient(UserId, PatientId, Email, DateOfBirth));
            }
            model.addAttribute("patient", patient);
            return "patient";
        } catch (Exception e) {
            return e.toString();
        }
    }

    @RequestMapping("/review")
    public String Review(Model model) {
        try {
            Connection connection = getConnection();
            Statement stmt = connection.createStatement();
            String sql;
            sql = "SELECT ReviewId, PatientId,  Professionalism, Communication, Cleanliness, EmployeeValue FROM Review";
            ResultSet rs = stmt.executeQuery(sql);
            StringBuffer sb = new StringBuffer();
            List review = new ArrayList<>();
            // Extract data from result set
            while (rs.next()) {
                int ReviewId = rs.getInt("ReviewId");
                int PatientId = rs.getInt("PatientId");
                int Professionalism = rs.getInt("Professionalism");
                int Communication = rs.getInt("Communication");
                int Cleanliness = rs.getInt("Cleanliness");
                int EmployeeValue = rs.getInt("EmployeeValue");
                review.add(
                        new Review(ReviewId, PatientId, Professionalism, Communication, Cleanliness, EmployeeValue));
            }
            model.addAttribute("reviews", review);
            return "review";
        } catch (Exception e) {
            return e.toString();
        }
    }

    @RequestMapping("/dentistappointments")
    public String Dentist_Appointment(Model model) {
        try {
            Connection connection = getConnection();
            Statement stmt = connection.createStatement();
            String sql;
            sql = "SELECT AppointmentId, DentistId FROM Dentist_Appointment";
            ResultSet rs = stmt.executeQuery(sql);
            StringBuffer sb = new StringBuffer();
            List dentistappointment = new ArrayList<>();
            // Extract data from result set
            while (rs.next()) {
                int AppointmentId = rs.getInt("AppointmentId");
                int DentistId = rs.getInt("DentistId");
                dentistappointment.add(new Dentist_Appointment(AppointmentId, DentistId));
            }
            model.addAttribute("dentistappointments", dentistappointment);
            return "dentistappointment";
        } catch (Exception e) {
            return e.toString();
        }
    }

    @RequestMapping("/invoices")
    public String Invoice(Model model) {
        try {
            Connection connection = getConnection();
            Statement stmt = connection.createStatement();
            String sql;
            sql = "SELECT  InvoiceId, UserId, ReceptionistId, FeeId, InsuranceClaimId, DateOfIssue, Contact, PatientCharge, InsuranceCharge, TotalCharge, Discount, Penalty, PaymentType FROM Invoice";
            ResultSet rs = stmt.executeQuery(sql);
            StringBuffer sb = new StringBuffer();
            List invoice = new ArrayList<>();
            // Extract data from result set
            while (rs.next()) {
                int InvoiceId = rs.getInt("InvoiceId");
                int UserId = rs.getInt("UserId");
                int ReceptionistId = rs.getInt("ReceptionistId");
                int FeeId = rs.getInt("FeeId");
                int InsuranceClaimId = rs.getInt("InsuranceClaimId");
                Date DateOfIssue = rs.getDate("DateOfIssue");
                String Contact = rs.getString("Contact");
                int PatientCharge = rs.getInt("PatientCharge");
                int InsuranceCharge = rs.getInt("InsuranceCharge");
                int TotalCharge = rs.getInt("TotalCharge");
                int Discount = rs.getInt("Discount");
                int Penalty = rs.getInt("Penalty");
                String PaymentType = rs.getString("paymenttype");
                invoice.add(new Invoice(InvoiceId, UserId, ReceptionistId, FeeId, InsuranceClaimId, DateOfIssue,
                        Contact, PatientCharge, InsuranceCharge, TotalCharge, Discount, Penalty, PaymentType));
            }
            model.addAttribute("invoices", invoice);
            return "invoice";
        } catch (Exception e) {
            return e.toString();
        }
    }

    @RequestMapping("/employees")
    public String Employee(Model model) {
        try {
            Connection connection = getConnection();
            Statement stmt = connection.createStatement();
            String sql;
            sql = "SELECT  UserId, EmployeeId, EmployeeEmail, Salary FROM Employee";
            ResultSet rs = stmt.executeQuery(sql);
            StringBuffer sb = new StringBuffer();
            List employee = new ArrayList<>();
            // Extract data from result set
            while (rs.next()) {
                int UserId = rs.getInt("UserId");
                int EmployeeId = rs.getInt("EmployeeId");
                String EmployeeEmail = rs.getString("EmployeeEmail");
                int Salary = rs.getInt("Salary");
                employee.add(new Employee(UserId, EmployeeId, EmployeeEmail, Salary));
            }
            model.addAttribute("employees", employee);
            return "employee";
        } catch (Exception e) {
            return e.toString();
        }
    }

    @RequestMapping("/dentalprofessionals")
    public String DentalProfessional(Model model) {
        try {
            Connection connection = getConnection();
            Statement stmt = connection.createStatement();
            String sql;
            sql = "SELECT  BranchId, EmployeeId, DpRole FROM DentalProfessional";
            ResultSet rs = stmt.executeQuery(sql);
            StringBuffer sb = new StringBuffer();
            List dentalprofessionals = new ArrayList<>();
            // Extract data from result set
            while (rs.next()) {
                int BranchId = rs.getInt("BranchId");
                int EmployeeId = rs.getInt("EmployeeId");
                String DpRole = rs.getString("DpRole");
                dentalprofessionals.add(new DentalProfessional(BranchId, EmployeeId, DpRole));
            }
            model.addAttribute("dentalprofessionals", dentalprofessionals);
            return "dentalprofessional";
        } catch (Exception e) {
            return e.toString();
        }
    }

    @RequestMapping(value = "/createbranch", method = RequestMethod.POST)
    public String createAppointment(@ModelAttribute Branch branch, Model model) {
        model.addAttribute("branch", branch);
        int BranchId = branch.getBranchId();
        String City = branch.getCity();
        try {
            Connection connection = getConnection();
            Statement stmt = connection.createStatement();
            String sql;
            // SELECT BranchId, City FROM Branch
            sql = "INSERT INTO branch(branchid, city) VALUES " +
                    "('" + BranchId + "', '" + City + "');";
            System.out.println(sql);
            int result = stmt.executeUpdate(sql);
            System.out.println("Execute update returned: " + result);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("Exception", e.toString());
        }
        return "branchresult";
    }

    @RequestMapping(value = "/createappointment", method = RequestMethod.POST)
    public String createAppointment(@ModelAttribute Appointment appointment, Model model) {
        model.addAttribute("appointment", appointment);
        int AppointmentId = appointment.getAppointmentId();
        int PatientId = appointment.getPatientId();
        Date ApptDate = appointment.getApptDate();
        Time StartTime = appointment.getStartTime();
        Time EndTime = appointment.getEndTime();
        String AppointmentType = appointment.getAppointmentType();
        String Status = appointment.getStatus();
        int RoomAssigned = appointment.getRoomAssigned();
        try {
            Connection connection = getConnection();
            Statement stmt = connection.createStatement();
            String sql;
            // SELECT AppointmentId, PatientId, ApptDate, StartTime, EndTime,
            // AppointmentType, Status, RoomAssigned FROM Appointment
            sql = "INSERT INTO appointment(AppointmentId, PatientId, ApptDate, StartTime, EndTime, AppointmentType, Status, RoomAssigned) VALUES "
                    +
                    "('" + AppointmentId + "', '" + PatientId + "', '" + ApptDate + "', '" + StartTime + "', '"
                    + EndTime + "', '" + AppointmentType + "', '" + Status + "', '" + RoomAssigned + "');";
            System.out.println(sql);
            int result = stmt.executeUpdate(sql);
            System.out.println("Execute update returned: " + result);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("Exception", e.toString());
        }
        return "appointmentresult";
    }

    @RequestMapping(value = "/createpatient", method = RequestMethod.POST)
    public String createPatient(@ModelAttribute Patient patient, Model model) {
        model.addAttribute("patient", patient);
        int UserId = patient.getUserId();
        int PatientId = patient.getPatientId();
        String Email = patient.getEmail();
        Date DateOfBirth = patient.getDateOfBirth();
        try {
            Connection connection = getConnection();
            Statement stmt = connection.createStatement();
            String sql;
            sql = "INSERT INTO patient(UserId, PatientId, Email, DateOfBirth) VALUES " +
                    "('" + UserId + "', '" + PatientId + "', '" + Email + "', '" + DateOfBirth + "');";
            System.out.println(sql);
            int result = stmt.executeUpdate(sql);
            System.out.println("Execute update returned: " + result);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("Exception", e.toString());
        }
        return "patientresult";
    }

    @RequestMapping(value = "/createreview", method = RequestMethod.POST)
    public String createReview(@ModelAttribute Review review, Model model) {
        model.addAttribute("review", review);
        int ReviewId = review.getReviewId();
        int PatientId = review.getPatientId();
        int Professionalism = review.getProfessionalism();
        int Communication = review.getCommunication();
        int Cleanliness = review.getCleanliness();
        int EmployeeValue = review.getEmployeeValue();
        try {
            Connection connection = getConnection();
            Statement stmt = connection.createStatement();
            String sql;
            sql = "INSERT INTO review(ReviewId, PatientId, Professionalism, Communication) VALUES " +
                    "('" + ReviewId + "', '" + PatientId + "', '" + Professionalism + "', '" + Communication + "', '"
                    + Cleanliness + "', '" + EmployeeValue + "');";
            System.out.println(sql);
            int result = stmt.executeUpdate(sql);
            System.out.println("Execute update returned: " + result);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("Exception", e.toString());
        }
        return "reviewresult";
    }

    @RequestMapping(value = "/createdentalprocedure", method = RequestMethod.POST)
    public String createDentalProcedure(@ModelAttribute DentalProcedure dentalprocedure, Model model) {
        model.addAttribute("dentalprocedure", dentalprocedure);
        String ProcedureCode = dentalprocedure.getProcedureCode();
        String ProcedureType = dentalprocedure.getProcedureType();
        String Description = dentalprocedure.getDescription();
        int TotalCharge = dentalprocedure.getTotalCharge();
        try {
            Connection connection = getConnection();
            Statement stmt = connection.createStatement();
            String sql;
            // SELECT ProcedureCode, ProcedureType, Description, TotalCharge FROM
            // DentalProcedure
            sql = "INSERT INTO dentalprocedure(ProcedureCode, ProcedureType, Description, TotalCharge) VALUES " +
                    "('" + ProcedureCode + "', '" + ProcedureType + "', '" + Description + "', '" + TotalCharge + "');";
            System.out.println(sql);
            int result = stmt.executeUpdate(sql);
            System.out.println("Execute update returned: " + result);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("Exception", e.toString());
        }
        return "dentalprocedureresult";
    }

    @RequestMapping(value = "/createinvoice", method = RequestMethod.POST)
    public String createInvoice(@ModelAttribute Invoice invoice, Model model) {
        model.addAttribute("invoice", invoice);
        int InvoiceId = invoice.getInvoiceId();
        int UserId = invoice.getUserId();
        int ReceptionistId = invoice.getReceptionistId();
        int FeeId = invoice.getFeeId();
        int InsuranceClaimId = invoice.getInsuranceClaimId();
        Date DateOfIssue = invoice.getDateOfIssue();
        String Contact = invoice.getContact();
        int PatientCharge = invoice.getPatientCharge();
        int InsuranceCharge = invoice.getInsuranceCharge();
        int TotalCharge = invoice.getTotalCharge();
        int Discount = invoice.getDiscount();
        int Penalty = invoice.getPenalty();
        String PaymentType = invoice.getPaymentType();
        try {
            Connection connection = getConnection();
            Statement stmt = connection.createStatement();
            String sql;
            // "SELECT InvoiceId, UserId, ReceotionistId, FeeId, InsuranceClaimId,
            // DateOfIssue, Contact, PatientCharge,
            // InsuranceCharge, TotalCharge, Discount, Penalty, PaymentType FROM Invoice"
            sql = "INSERT INTO invoice(InvoiceId, UserId, ReceptionistId, FeeId, InsuranceClaimId, DateOfIssue, Contact, PatientCharge, InsuranceCharge, TotalCharge, Discount, Penalty, PaymentType) VALUES "
                    +
                    "('" + InvoiceId + "', '" + UserId + "', '" + ReceptionistId + "', '" + FeeId + "', '"
                    + InsuranceClaimId
                    + "', '" + DateOfIssue + "', '" + Contact + "', '" + PatientCharge + "', '" + InsuranceCharge
                    + "', '"
                    + TotalCharge + "', '" + Discount + "', '" + Penalty + "', '" + PaymentType + "');";
            System.out.println(sql);
            int result = stmt.executeUpdate(sql);
            System.out.println("Execute update returned: " + result);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("Exception", e.toString());
        }
        return "invoiceresult";
    }

    @RequestMapping(value = "/createemployee", method = RequestMethod.POST)
    public String createEmployee(@ModelAttribute Employee employee, Model model) {
        model.addAttribute("employee", employee);
        int UserId = employee.getUserId();
        int EmployeeId = employee.getEmployeeId();
        String EmployeeEmail = employee.getEmployeeEmail();
        int Salary = employee.getSalary();
        try {
            Connection connection = getConnection();
            Statement stmt = connection.createStatement();
            String sql;
            sql = "INSERT INTO patient(UserId, EmployeeId, EmployeeEmail, Salary) VALUES " +
                    "('" + UserId + "', '" + EmployeeId + "', '" + EmployeeEmail + "', '" + Salary + "');";
            System.out.println(sql);
            int result = stmt.executeUpdate(sql);
            System.out.println("Execute update returned: " + result);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("Exception", e.toString());
        }
        return "employeeresult";
    }

    @RequestMapping(value = "/createdentalprofessional", method = RequestMethod.POST)
    public String createDentalProfessional(@ModelAttribute DentalProfessional dentalprofessional, Model model) {
        model.addAttribute("dentalprofessional", dentalprofessional);
        int BranchId = dentalprofessional.getBranchId();
        int EmployeeId = dentalprofessional.getEmployeeId();
        String DpRole = dentalprofessional.getDpRole();
        try {
            Connection connection = getConnection();
            Statement stmt = connection.createStatement();
            String sql;
            sql = "INSERT INTO dentalprofessional(BranchId, EmployeeId, DpRole) VALUES " +
                    "('" + BranchId + "', '" + EmployeeId + "', '" + DpRole + "');";
            System.out.println(sql);
            int result = stmt.executeUpdate(sql);
            System.out.println("Execute update returned: " + result);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("Exception", e.toString());
        }
        return "dentalprofessionalresult";
    }

    // Initiate connection to Heroku Postgres database
    private static Connection getConnection() throws URISyntaxException, SQLException {
        URI dbUri = null;
        String DEFAULT_DATABASE_URL = "postgres://u:p" +
                "@ec2-xx.compute-1.amazonaws.com:5432/db";
        try {
            dbUri = new URI(System.getenv("DATABASE_URL"));
        } catch (Exception e) {
            e.printStackTrace();
            dbUri = new URI(DEFAULT_DATABASE_URL);
        }

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':'
                + dbUri.getPort() + dbUri.getPath()
                + "?sslmode=require";

        return DriverManager.getConnection(dbUrl, username, password);
    }

    public static void main(String[] args) {
        SpringApplication.run(HerokuConnectApplication.class, args);
    }
}

