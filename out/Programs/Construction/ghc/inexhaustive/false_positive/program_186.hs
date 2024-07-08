module Program_4 () where 

 main = print $ show v_b
data B_C = C_H B_B
data B_A = C_A B_C B_B | C_B (((Char,Bool),Char)) Int | C_C B_D Bool | C_D Char Bool
data B_B = C_E | C_F | C_G
data B_D = C_I | C_J B_D B_C | C_K B_C

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
  C_G -> 1 
