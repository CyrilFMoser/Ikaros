module Program_26 () where 

 main = print $ show v_b
data B_B b = C_E b | C_F | C_G (B_A b)
data B_A a = C_A (B_A a) Int | C_B a | C_C (B_A a) | C_D (B_B a) a

v_a :: B_B Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G (C_A (C_D _ _) _) -> 0 
