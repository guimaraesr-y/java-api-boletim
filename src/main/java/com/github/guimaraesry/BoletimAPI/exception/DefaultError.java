package com.github.guimaraesry.BoletimAPI.exception;

import lombok.Data;
import lombok.AllArgsConstructor;

/**
 *
 * @author Ryan
 */

@AllArgsConstructor
@Data
public class DefaultError {
    
    int code;
    String message;
    
}
