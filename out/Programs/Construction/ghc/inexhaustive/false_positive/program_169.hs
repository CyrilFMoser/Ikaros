module Program_17 () where 

 main = print $ show v_b
data B_C d e = C_K (B_B e) | C_L | C_M | C_N
data B_B c = C_F | C_G | C_H Char | C_I | C_J
data B_A a b = C_A a | C_B (B_B B_D) (B_C a a) | C_C (B_B b) | C_D | C_E Int
data B_D = C_O

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B _ _ -> 1 
  C_D -> 2 
  C_E _ -> 3 
