module Program_24 () where 

 main = print $ show v_b
data B_C = C_H ((B_C,B_C)) (B_B B_A B_C) | C_I (((Int,Bool),B_A)) | C_J B_A | C_K (B_B B_C Int) B_A
data B_D c = C_L B_A c | C_M (B_D c) | C_N Char ((B_A,B_A)) | C_O
data B_B a b = C_D b | C_E B_A | C_F | C_G Int
data B_A = C_A | C_B B_C | C_C B_C

v_a :: B_B B_C Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E C_A -> 0 
  C_E (C_B (C_H _ _)) -> 1 
  C_E (C_B (C_I _)) -> 2 
  C_E (C_B (C_J _)) -> 3 
  C_E (C_B (C_K _ _)) -> 4 
  C_E (C_C (C_H _ _)) -> 5 
  C_E (C_C (C_I _)) -> 6 
  C_E (C_C (C_J _)) -> 7 
  C_E (C_C (C_K _ _)) -> 8 
  C_F -> 9 
  C_G _ -> 10 
