module Program_21 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B | C_C (B_A a a) | C_D (B_B a a) (B_B Bool a)
data B_B c d = C_E | C_F d | C_G (B_A d d)

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_C (C_D (C_G _) (C_E)) -> 1 
  C_C (C_C (C_D _ _)) -> 2 
  C_C (C_D (C_G _) (C_G _)) -> 3 
  C_C (C_D (C_E) _) -> 4 
  C_C (C_D _ (C_F _)) -> 5 
  C_C (C_D (C_F _) (C_E)) -> 6 
  C_C (C_D (C_F _) (C_G _)) -> 7 
  C_C (C_D (C_E) (C_G _)) -> 8 
  C_C (C_D (C_F _) (C_F _)) -> 9 
  C_D (C_G (C_C _)) (C_G _) -> 10 
  C_D (C_G (C_C _)) (C_G (C_D _ _)) -> 11 
  C_D (C_G (C_B)) _ -> 12 
  C_D _ (C_G (C_B)) -> 13 
  C_D (C_E) (C_G (C_B)) -> 14 
