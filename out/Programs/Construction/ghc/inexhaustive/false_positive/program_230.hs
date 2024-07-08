module Program_14 () where 

 main = print $ show v_b
data B_D b = C_H ((B_A,B_A)) | C_I B_C | C_J (B_B b) | C_K ((B_A,B_A)) | C_L Bool
data B_A = C_A Char | C_B B_C B_A
data B_B a = C_C B_A | C_D B_A
data B_C = C_E (B_D B_C) | C_F ((Int,B_A)) | C_G B_C ((B_C,B_A))

v_a :: B_D Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_H _ -> 0 
  C_I (C_F ((_,_))) -> 1 
  C_I (C_G _ _) -> 2 
  C_J (C_C _) -> 3 
  C_J (C_D _) -> 4 
  C_K _ -> 5 
  C_L _ -> 6 
