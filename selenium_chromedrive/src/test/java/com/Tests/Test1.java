package com.Tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.Pages.Page;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class Test1 {
    private static Page page;

    @BeforeEach
    public void setUp() {
        page = new Page();
        page.openApp();
    }

    @Test
    @Tag("Regression")
    public void registerTest() throws InterruptedException {
        page.register("euismod@outlook.org", "123456");
        page.registerBtn();
        Thread.sleep(1000);

        page.cadastro("euismod@outlook.org", "Euismod", "123456", "123456");
        page.cadastrarBtn();
        Thread.sleep(1000);
        page.closeModal();
        Thread.sleep(1000);

        page.loginPage("euismod@outlook.org", "123456");
        page.loginBtn();
        Thread.sleep(1000);

        page.accessSaque();
        Thread.sleep(1500);
        page.closeModalSaque();

        page.accessExtrato();
        Thread.sleep(1500);
        String extratoMessage = page.getExtratoText();
        assertTrue(extratoMessage.contains("Saldo disponível"));
        System.out.println("Mensagem na tela: " + extratoMessage);
        page.goBackMainPage();

        page.accessPagamentos();
        Thread.sleep(1500);
        page.closeModalPagamento();

        page.accessTransfer();
        Thread.sleep(1500);
        page.makeTransfer("12345","6", "500", "Teste de transferência");
        page.transferNow();
        Thread.sleep(1000);

        String transfErrorMessage = page.errorMessage();
        assertTrue(transfErrorMessage.contains("Conta inválida ou inexistente"));
        System.out.println("Mensagem de erro: " + transfErrorMessage);
        page.closeModalBtnTransfer();
        Thread.sleep(1000);
        page.goBack();

        page.logout();
    }


    @AfterEach
    public void tearDown() {
        page.quitDriver();
    }

}
