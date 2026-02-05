package com.example.wallet.controller;

import com.example.wallet.model.Wallet;
import com.example.wallet.service.WalletService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    private final WalletService service;

    public WalletController(WalletService service) {
        this.service = service;
    }

    @PostMapping("/{id}")
    public Wallet create(@PathVariable String id) {
        return service.createWallet(id);
    }

    @PostMapping("/{id}/add")
    public String add(@PathVariable String id, @RequestParam long amount) {
        Wallet wallet = service.getWallet(id);
        wallet.add(amount);
        return "Balance: " + wallet.getBalance();
    }

    @PostMapping("/{id}/deduct")
    public String deduct(@PathVariable String id, @RequestParam long amount) {
        Wallet wallet = service.getWallet(id);
        return wallet.deduct(amount)
                ? "Balance: " + wallet.getBalance()
                : "Insufficient funds";
    }

    @GetMapping("/{id}")
    public long balance(@PathVariable String id) {
        return service.getWallet(id).getBalance();
    }
}
