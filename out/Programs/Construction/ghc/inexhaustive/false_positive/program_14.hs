module Program_21 () where 

 main = print $ show v_b
data B_D c d = C_K (B_B c)
data B_C = C_G (B_B Bool) | C_H | C_I (B_D Char B_C) | C_J Int B_C
data B_B b = C_C (B_A b) | C_D (B_D b b) b | C_E b Bool | C_F B_C
data B_A a = C_A (B_D a a) | C_B (B_A ((Int,Bool))) a

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
