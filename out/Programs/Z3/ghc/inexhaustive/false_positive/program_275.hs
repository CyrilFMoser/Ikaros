module Program_26 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B | C_C (B_A a a) | C_D (B_B a a) (B_B Bool a)
data B_B c d = C_E | C_F d | C_G (B_A d d)

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_G (C_D _ _)) (C_G (C_C _)) -> 0 
  C_D (C_G (C_C _)) (C_G (C_C _)) -> 1 
  C_D (C_G (C_B)) (C_G (C_D _ _)) -> 2 
  C_D (C_E) (C_F _) -> 3 
  C_D (C_G _) (C_F _) -> 4 
  C_D (C_G (C_D _ _)) (C_G (C_A)) -> 5 
