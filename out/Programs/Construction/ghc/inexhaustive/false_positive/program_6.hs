module Program_14 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (B_A Bool b) ((Int,Int)) | C_C | C_D
data B_B c = C_E (B_C c) | C_F ((Bool,(Char,Char))) (((Char,Bool),(Char,Bool))) | C_G c | C_H (B_A c c) (B_B c)
data B_C d = C_I

v_a :: B_B Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ -> 0 
  C_F _ _ -> 1 
  C_G 12 -> 2 
  C_G _ -> 3 
  C_H _ (C_E (C_I)) -> 4 
  C_H _ (C_G 12) -> 5 
  C_H _ (C_G _) -> 6 
  C_H _ (C_H _ _) -> 7 
