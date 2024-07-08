module Program_23 () where 

 main = print $ show v_b
data B_B c = C_E
data B_A a b = C_A | C_B b (B_A ((Int,Bool)) ((Int,Bool))) | C_C b | C_D (B_A ((Int,Char)) a) (B_A b b)

v_a :: B_A Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ _ -> 0 
  C_D (C_D (C_D _ _) (C_A)) (C_D (C_A) (C_B _ _)) -> 1 
