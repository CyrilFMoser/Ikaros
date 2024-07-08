module Program_30 () where 

 main = print $ show v_b
data B_C = C_G | C_H ((B_A,B_A)) B_A | C_I B_D B_D | C_J B_A
data B_D = C_K (B_B B_D) Int | C_L Char
data B_B a = C_B B_C | C_C | C_D | C_E a | C_F B_C B_C
data B_A = C_A

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G -> 0 
  C_H ((C_A,C_A)) _ -> 1 
  C_I (C_K (C_B _) _) _ -> 2 
  C_I (C_K (C_C) _) _ -> 3 
  C_I (C_K (C_E _) _) _ -> 4 
  C_I (C_K (C_F _ _) _) _ -> 5 
  C_I (C_L _) _ -> 6 
  C_J C_A -> 7 
