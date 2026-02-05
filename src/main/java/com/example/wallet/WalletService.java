package com.example.wallet.service;

import com.example.wallet.model.Wallet;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class WalletService {

    private final Map<String, Wallet> wallets = new ConcurrentHashMap<>();

    public Wallet createWallet(String id) {
        Wallet wallet = new Wallet(id);
        wallets.put(id, wallet);
        return wallet;
    }

    public Wallet getWallet(String id) {
        return wallets.get(id);
    }
}
