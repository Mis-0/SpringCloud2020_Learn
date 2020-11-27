package com.asir.commons.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author asir
 * @date 2020/11/22 - 21:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_payment")
public class Payment implements Serializable {
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private int id;
    private double totalMoney;
}
