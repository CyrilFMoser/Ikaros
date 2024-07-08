module Program_17 () where 

 main = print $ show v_b
data B_B c d = C_D B_D | C_E B_D
data B_A a b = C_A | C_B B_C (B_A a a) | C_C B_C (B_A a b)
data B_C = C_F | C_G
data B_D = C_H B_D | C_I | C_J Bool Char | C_K (B_A B_D B_D)

v_a :: B_A B_C Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
  C_C C_F _ -> 1 
  C_C C_G _ -> 2 
