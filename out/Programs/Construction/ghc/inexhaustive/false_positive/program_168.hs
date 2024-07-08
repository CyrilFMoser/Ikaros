module Program_16 () where 

 main = print $ show v_b
data B_C = C_F (((Int,Char),B_C)) (B_A Char) | C_G Bool B_C
data B_B b c = C_B (B_A b) Int | C_C | C_D (B_A b) | C_E
data B_D = C_H (B_B ((Int,Char)) Int) | C_I | C_J | C_K | C_L
data B_A a = C_A Int ((B_D,B_D))

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ _ -> 0 
