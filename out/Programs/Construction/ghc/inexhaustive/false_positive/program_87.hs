module Program_3 () where 

 main = print $ show v_b
data B_A a b = C_A ((Char,B_C)) | C_B a (B_B a a)
data B_C = C_F (B_B B_C ((Int,Int))) (B_B B_C B_C) | C_G (B_B Bool B_C) | C_H ((B_C,B_C)) | C_I
data B_B c d = C_C B_C c | C_D d | C_E B_C

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ _ -> 0 
  C_G (C_C _ _) -> 1 
  C_G (C_D (C_F _ _)) -> 2 
  C_G (C_D (C_G _)) -> 3 
  C_G (C_D (C_H _)) -> 4 
  C_G (C_D C_I) -> 5 
  C_G (C_E (C_F _ _)) -> 6 
  C_G (C_E (C_H _)) -> 7 
  C_G (C_E C_I) -> 8 
  C_H _ -> 9 
  C_I -> 10 
