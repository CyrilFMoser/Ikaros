module Program_22 () where 

 main = print $ show v_b
data B_B a b = C_E | C_F B_A | C_G a a | C_H (B_B B_A B_A) B_C
data B_C = C_I ((B_A,B_C)) | C_J (B_B B_A Bool)
data B_A = C_A | C_B ((B_C,B_C)) | C_C (B_B Bool B_A) | C_D ((B_C,B_C)) (B_B B_A Bool)

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_I _ -> 0 
  C_J (C_E) -> 1 
  C_J (C_F _) -> 2 
  C_J (C_G _ (C_B _)) -> 3 
  C_J (C_G _ (C_C _)) -> 4 
  C_J (C_G _ (C_D _ _)) -> 5 
  C_J (C_H _ _) -> 6 
