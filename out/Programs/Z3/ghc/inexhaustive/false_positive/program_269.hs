module Program_20 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B | C_C (B_A a a) | C_D (B_B a a) (B_B Bool a)
data B_B c d = C_E | C_F d | C_G (B_A d d)

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_C (C_C (C_A)) -> 1 
  C_C (C_D _ (C_E)) -> 2 
  C_C (C_D (C_E) (C_F _)) -> 3 
  C_C (C_D (C_G _) (C_F _)) -> 4 
  C_C (C_C (C_B)) -> 5 
  C_C (C_D _ _) -> 6 
  C_C (C_D _ (C_G _)) -> 7 
  C_C (C_A) -> 8 
  C_C _ -> 9 
  C_C (C_D (C_F _) _) -> 10 
  C_C (C_D (C_G _) _) -> 11 
  C_D (C_G _) _ -> 12 
  C_D _ (C_F _) -> 13 
  C_D (C_G (C_C _)) (C_F _) -> 14 
  C_D (C_G (C_A)) _ -> 15 
  C_D (C_G (C_D _ _)) (C_E) -> 16 
  C_D _ (C_G (C_A)) -> 17 
  C_D (C_G _) (C_G (C_B)) -> 18 
  C_D (C_G (C_A)) (C_G (C_C _)) -> 19 
  C_D (C_F _) (C_G (C_C _)) -> 20 
