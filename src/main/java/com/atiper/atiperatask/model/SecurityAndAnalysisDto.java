package com.atiper.atiperatask.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SecurityAndAnalysisDto {
    private AdvanceSecurityDto advanceSecurity;
    private SecretScanningDto secretScanning;
    private SecretScanningPushProtectionDto secretScanningPushProtection;

}
