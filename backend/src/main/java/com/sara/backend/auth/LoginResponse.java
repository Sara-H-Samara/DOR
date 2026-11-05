package com.sara.backend.auth;

import com.sara.backend.user.Role;

public record LoginResponse(String token, String fullName, Role role) {}