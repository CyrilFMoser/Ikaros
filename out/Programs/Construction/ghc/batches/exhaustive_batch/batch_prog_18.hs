module Program_18 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_A B_A
data B_B a b = C_C | C_D | C_E B_A | C_F Char

v_a :: B_B Bool Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C -> 0 
  C_D -> 1 
  C_E _ -> 2 
  C_F _ -> 3 
