module Program_22 () where 

 main = print $ show v_b
data B_C = C_F ((B_C,B_C)) (B_B Char) | C_G B_A Int | C_H (B_B ((Int,Int))) ((B_A,B_C)) | C_I | C_J B_C
data B_B a = C_C B_A | C_D B_A (B_B a) | C_E Char
data B_A = C_A (B_B B_C) ((B_A,B_A)) | C_B Int (B_B B_A)
data B_D b c = C_K c ((B_C,B_C)) | C_L B_C | C_M B_C B_C | C_N b (B_B c) | C_O

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G (C_A _ _) _ -> 0 
  C_G (C_B _ (C_C _)) _ -> 1 
  C_G (C_B _ (C_D _ _)) _ -> 2 
  C_G (C_B _ (C_E _)) _ -> 3 
  C_H _ _ -> 4 
  C_I -> 5 
  C_J _ -> 6 
