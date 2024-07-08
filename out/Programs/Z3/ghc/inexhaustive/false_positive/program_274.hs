module Program_25 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B | C_C (B_A a a) | C_D (B_B a a) (B_B Bool a)
data B_B c d = C_E | C_F d | C_G (B_A d d)

v_a :: B_A Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_G (C_D _ _)) (C_G (C_D _ _)) -> 0 
  C_D (C_G (C_B)) (C_G (C_A)) -> 1 
  C_D _ (C_G (C_D _ _)) -> 2 
