module Program_13 () where 

 main = print $ show v_b
data B_B = C_C (B_A B_C) B_C | C_D (B_A B_C) | C_E B_B Char | C_F | C_G
data B_C = C_H Bool | C_I (B_A B_C) B_C
data B_A a = C_A a a | C_B Int

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
