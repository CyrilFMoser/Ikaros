module Program_3 () where 

 main = print $ show v_b
data B_D c = C_J (B_B c c) | C_K | C_L (B_B c c) | C_M (B_B c c) (B_B c c) | C_N
data B_C = C_E B_C | C_F | C_G B_C B_A | C_H (B_B Int B_C) (((Int,Bool),B_C)) | C_I (B_B B_C Int) (B_D B_C)
data B_A = C_A | C_B (B_B ((Bool,Bool)) B_A) (B_D B_A)
data B_B a b = C_C | C_D ((Bool,B_A))

v_a :: B_D Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_J _ -> 0 
  C_K -> 1 
  C_L (C_C) -> 2 
  C_L (C_D ((_,_))) -> 3 
  C_M _ (C_C) -> 4 
  C_N -> 5 
