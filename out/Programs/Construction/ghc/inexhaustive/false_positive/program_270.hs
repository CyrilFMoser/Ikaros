module Program_21 () where 

 main = print $ show v_b
data B_B = C_D B_D B_B | C_E | C_F B_D
data B_A a = C_A Char | C_B | C_C a (B_C a a)
data B_C b c = C_G Bool Bool | C_H B_B Bool | C_I | C_J b Int | C_K c
data B_D = C_L B_B

v_a :: B_C B_B B_D
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G _ _ -> 0 
  C_H _ _ -> 1 
  C_J (C_D _ _) 12 -> 2 
  C_J (C_D _ _) _ -> 3 
  C_J C_E 12 -> 4 
  C_J C_E _ -> 5 
  C_J (C_F _) 12 -> 6 
  C_J (C_F _) _ -> 7 
  C_K _ -> 8 
