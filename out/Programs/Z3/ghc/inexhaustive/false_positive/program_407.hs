module Program_3 () where 

 main = print $ show v_b
data B_A a = C_A Int B_B | C_B B_B B_B | C_C a | C_D (B_A a) a
data B_B = C_E (B_A B_B) ((B_B,(Int,Bool))) | C_F

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_D (C_D _ _) _) _ -> 0 
