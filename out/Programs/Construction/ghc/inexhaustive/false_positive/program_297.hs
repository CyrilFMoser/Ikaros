module Program_17 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B
data B_C = C_E ((B_C,B_C)) Bool | C_F B_C (B_A B_B B_B) | C_G | C_H (B_A ((Int,Bool)) Bool) B_C | C_I ((B_B,B_C)) Char
data B_B = C_C B_B | C_D (B_A B_C B_C)

v_a :: B_A Int B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
