module Program_11 () where 

 main = print $ show v_b
data B_A a = C_A (B_C a a)
data B_B b c = C_B b (B_A b) | C_C | C_D
data B_D = C_H (B_B B_D ((Char,Bool))) (B_B ((Char,Bool)) B_D) | C_I | C_J (B_B B_D B_D) | C_K
data B_C d e = C_E Char | C_F d d | C_G (B_C d e)

v_a :: B_B Bool Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
  C_D -> 1 
