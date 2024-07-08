module Program_24 () where 

 main = print $ show v_b
data B_B c d = C_E | C_F d | C_G (B_A d d)
data B_A a b = C_A | C_B | C_C (B_A a a) | C_D (B_B a a) (B_B Bool a)

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_C _) -> 0 
  C_D _ (C_G _) -> 1 
  C_D (C_G _) (C_G (C_D _ _)) -> 2 
  C_D (C_F _) _ -> 3 
  C_D (C_G _) (C_E) -> 4 
  C_D (C_G (C_B)) (C_E) -> 5 
  C_D (C_G (C_D _ _)) (C_G (C_B)) -> 6 
  C_D _ (C_E) -> 7 
  C_D (C_F _) (C_G (C_A)) -> 8 
  C_D (C_G (C_C _)) (C_G (C_B)) -> 9 
  C_D (C_G _) (C_G (C_A)) -> 10 
  C_D (C_G (C_B)) (C_G _) -> 11 
