package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Page extends BasePage {

    protected static final String emailXpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[1]/input"; //xpath
    protected static final String passwordXpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[2]/div/input"; //xpath
    protected static final String registerBtnCss = "#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__login > form > div.login__buttons > button.style__ContainerButton-sc-1wsixal-0.ihdmxA.button__child"; //cssSelector

    protected static final String formEmailXpath = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[2]/input"; //xpath
    protected static final String formNameXPath = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[3]/input"; // xpath
    protected static final String formPasswordCss = "#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > div:nth-child(4) > div > input"; //cssselector
    protected static final String formConfirmPasswordXPath = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[5]/div/input"; //xpath
    protected static final String formBtnCss = "#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > button"; //cssselector
    protected static final String closeModalBtnId = "btnCloseModal";//id

    protected static final String accessSaqueXpath = "//*[@id=\"btn-SAQUE\"]"; //xpath
    protected static final String closeModalSaqueId = "btnCloseModal"; //id

    protected static final String accessExtratoXpath = "//*[@id=\"btn-EXTRATO\"]"; // xpath
    protected static final String extratoMessageXpath = "//*[@id=\"__next\"]/div/div[3]/div/div[1]/p[1]"; //xpath
    protected static final String goBackMainPageXpath = "//*[@id=\"__next\"]/div/div[2]/div[1]"; //xpath

    protected static final String accessPagamentosCss = "#btn-PAGAMENTOS"; //cssselector
    protected static final String closeModalPagCss = "#btnCloseModal"; //cssselector

    protected static final String accessBtnXpath = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[1]"; //xpath
    protected static final String transferBtnXpath = "//*[@id=\"btn-TRANSFERÊNCIA\"]/span/img"; //xpath
    protected static final String accountNumberXpath = "//*[@id=\"__next\"]/div/div[3]/form/div[1]/div[1]/input";// xpath
    protected static final String accountDigitoCss = "#__next > div > div.transfer__ContainerForm-sc-1yjpf2r-8.gasnNO > form > div.account__data > div:nth-child(2) > input"; //cssselector
    protected static final String valueCss = "#__next > div > div.transfer__ContainerForm-sc-1yjpf2r-8.gasnNO > form > div:nth-child(2) > input"; //css
    protected static final String descriptionCss = "#__next > div > div.transfer__ContainerForm-sc-1yjpf2r-8.gasnNO > form > div:nth-child(3) > input"; //css

    protected static final String transferNowBtnXpath = "//*[@id=\"__next\"]/div/div[3]/form/button"; //xpath

    protected static final String errorMessageXpath = "//*[@id=\"modalText\"]"; // xpath
    protected static final String closeModalTransCss = "#btnCloseModal"; // css
    protected static final String goBackBtnXpath = "//*[@id=\"btnBack\"]"; // xpath

    protected static final String closeCss = "#btnExit"; // cssselector


    public void register(String email, String password) {
        WebElement emailInput = getWebElement(By.xpath(emailXpath));
        emailInput.clear();
        emailInput.sendKeys(email);

        WebElement passwordInput = getWebElement(By.xpath(passwordXpath));
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void registerBtn() {
        WebElement registerBtn = getWebElement(By.cssSelector(registerBtnCss));
        registerBtn.click();
    }

    public void cadastro(String fEmail, String fName, String fPassword, String fConfirmPassword) {
        WebElement formEmail = getWebElement(By.xpath(formEmailXpath));
        formEmail.clear();
        formEmail.sendKeys(fEmail);

        WebElement formName = getWebElement(By.xpath(formNameXPath));
        formName.clear();
        formName.sendKeys(fName);

        WebElement formPassword = getWebElement(By.cssSelector(formPasswordCss));
        formPassword.clear();
        formPassword.sendKeys(fPassword);

        WebElement formConfirmPassword = getWebElement(By.xpath(formConfirmPasswordXPath));
        formConfirmPassword.clear();
        formConfirmPassword.sendKeys(fConfirmPassword);
    }

    public void cadastrarBtn() {
        WebElement formBtn = getWebElement(By.cssSelector(formBtnCss));
        formBtn.click();
    }

    public void closeModal() {
        WebElement closeModalBtn = getWebElement(By.id(closeModalBtnId));
        closeModalBtn.click();
    }

    public void loginPage(String email, String password) {
        WebElement emailInput = getWebElement(By.xpath(emailXpath));
        emailInput.clear();
        emailInput.sendKeys(email);

        WebElement passwordInput = getWebElement(By.xpath(passwordXpath));
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void loginBtn() {
        WebElement accessBtn = getWebElement(By.xpath(accessBtnXpath));
        accessBtn.click();
    }

    public void accessSaque() {
        WebElement accessSaqueBtn = getWebElement(By.xpath(accessSaqueXpath));
        accessSaqueBtn.click();
    }

    public void closeModalSaque() {
        WebElement closeModalBtn = getWebElement(By.id(closeModalSaqueId));
        closeModalBtn.click();
    }

    public void accessExtrato() {
        WebElement accessExtratoBtn = getWebElement(By.xpath(accessExtratoXpath));
        accessExtratoBtn.click();
    }

    public String getExtratoText() {
        WebElement extratoText = getWebElement(By.xpath(extratoMessageXpath));
        return extratoText.getText();
    }

    public void goBackMainPage() {
        WebElement goBackBtn = getWebElement(By.xpath(goBackMainPageXpath));
        goBackBtn.click();
    }

    public void accessPagamentos() {
        WebElement accessPagamento = getWebElement(By.cssSelector(accessPagamentosCss));
        accessPagamento.click();
    }

    public void closeModalPagamento() {
        WebElement closeModalBtn = getWebElement(By.cssSelector(closeModalPagCss));
        closeModalBtn.click();
    }

    public void accessTransfer() {
        WebElement accessBtn = getWebElement(By.xpath(transferBtnXpath));
        accessBtn.click();
    }

    public void makeTransfer(String account, String digito, String amount, String description) {
        WebElement accountNumber = getWebElement(By.xpath(accountNumberXpath));
        accountNumber.clear();
        accountNumber.sendKeys(account);

        WebElement accountDigito = getWebElement(By.cssSelector(accountDigitoCss));
        accountDigito.clear();
        accountDigito.sendKeys(digito);

        WebElement transferValue = getWebElement(By.cssSelector(valueCss));
        transferValue.clear();
        transferValue.sendKeys(amount);

        WebElement transferDescription = getWebElement(By.cssSelector(descriptionCss));
        transferDescription.clear();
        transferDescription.sendKeys(description);
    }

    public void transferNow() {
        WebElement transferBtn = getWebElement(By.xpath(transferNowBtnXpath));
        transferBtn.click();
    }

    public String errorMessage() {
        WebElement errorText = getWebElement(By.xpath(errorMessageXpath));
        return errorText.getText();
    }

    public void closeModalBtnTransfer() {
        WebElement modalBtnTransf = getWebElement(By.cssSelector(closeModalTransCss));
        modalBtnTransf.click();
    }

    public void goBack() {
        WebElement goBackBtn = getWebElement(By.xpath(goBackBtnXpath));
        goBackBtn.click();
    }

    public void logout() {
        WebElement logoutBtn = getWebElement(By.cssSelector(closeCss));
        logoutBtn.click();
    }

}

