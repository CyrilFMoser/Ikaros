module Program_30 () where 

 main = print $ show v_b
data B_D e f = C_M | C_N (B_C f e) | C_O e Char
data B_B b = C_E (B_A b) b | C_F ((Char,Char)) | C_G b (B_A b) | C_H (B_B b) b
data B_C c d = C_I | C_J (B_C c Bool) | C_K (B_C d d) | C_L c
data B_A a = C_A | C_B | C_C (B_B a) | C_D

v_a :: B_C Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_I -> 0 
  C_J (C_I) -> 1 
  C_J (C_J (C_I)) -> 2 
  C_J (C_J (C_J _)) -> 3 
  C_J (C_J (C_K _)) -> 4 
  C_J (C_K _) -> 5 
  C_J (C_L _) -> 6 
  C_K (C_I) -> 7 
  C_K (C_J _) -> 8 
  C_K (C_K (C_I)) -> 9 
  C_K (C_K (C_J _)) -> 10 
  C_K (C_K (C_K _)) -> 11 
  C_K (C_K (C_L _)) -> 12 
  C_K (C_L _) -> 13 
  C_L _ -> 14 
