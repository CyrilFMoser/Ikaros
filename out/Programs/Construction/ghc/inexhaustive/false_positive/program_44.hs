module Program_2 () where 

 main = print $ show v_b
data B_A a = C_A Bool a | C_B | C_C | C_D B_B (B_C a a) | C_E ((B_B,B_B)) a
data B_B = C_F | C_G (B_A B_B) | C_H (((Bool,Bool),B_B)) (B_A B_B) | C_I
data B_C b c = C_J

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B -> 1 
  C_C -> 2 
  C_D C_F (C_J) -> 3 
  C_D (C_G (C_A _ _)) (C_J) -> 4 
  C_D (C_G (C_C)) (C_J) -> 5 
  C_D (C_G (C_D _ _)) (C_J) -> 6 
  C_D (C_G (C_E _ _)) (C_J) -> 7 
  C_D (C_H _ _) (C_J) -> 8 
  C_D C_I (C_J) -> 9 
  C_E _ _ -> 10 
