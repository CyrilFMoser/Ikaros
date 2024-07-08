module Program_25 () where 

 main = print $ show v_b
data B_B b = C_E b | C_F | C_G (B_A b)
data B_A a = C_A (B_A a) Int | C_B a | C_C (B_A a) | C_D (B_B a) a

v_a :: B_B Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G (C_A (C_C _) _) -> 0 
  C_G (C_B _) -> 1 
  C_G (C_C (C_B _)) -> 2 
  C_G (C_D (C_E _) _) -> 3 
  C_G (C_A (C_B _) _) -> 4 
  C_G (C_A (C_A _ _) _) -> 5 
  C_G (C_C _) -> 6 
  C_G (C_C (C_A _ _)) -> 7 
  C_G (C_D _ _) -> 8 
  C_G (C_C (C_C _)) -> 9 
