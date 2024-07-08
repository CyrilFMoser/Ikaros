module Program_1 () where 

 main = print $ show v_b
data B_A a b = C_A a | C_B (B_A B_B B_B) | C_C (B_A a a) B_B
data B_B = C_D | C_E B_B | C_F (B_A B_B B_B) B_B | C_G

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D -> 0 
  C_E _ -> 1 
  C_F _ _ -> 2 
  C_G -> 3 
