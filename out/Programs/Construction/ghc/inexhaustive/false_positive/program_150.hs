module Program_29 () where 

 main = print $ show v_b
data B_A a b = C_A b | C_B a (B_B b b) | C_C | C_D | C_E
data B_B c d = C_F | C_G c

v_a :: B_A Char Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B _ (C_G _) -> 1 
  C_C -> 2 
  C_D -> 3 
  C_E -> 4 
