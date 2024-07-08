module Program_22 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B b (B_A ((Int,Bool)) ((Int,Bool))) | C_C b | C_D (B_A ((Int,Char)) a) (B_A b b)
data B_B c = C_E

v_a :: B_A Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_D (C_A) (C_B _ _)) (C_D (C_A) (C_C _)) -> 0 
  C_D (C_D (C_B _ _) (C_D _ _)) (C_D (C_C _) (C_A)) -> 1 
  C_D (C_D (C_C _) (C_C _)) (C_D (C_D _ _) (C_B _ _)) -> 2 
  C_D (C_D _ (C_B _ _)) (C_D (C_A) (C_D _ _)) -> 3 
  C_D (C_D (C_A) (C_D _ _)) (C_D (C_C _) (C_B _ _)) -> 4 
  C_D (C_D (C_B _ _) (C_D _ _)) (C_B _ (C_A)) -> 5 
  C_D (C_D (C_D _ _) (C_D _ _)) (C_D (C_C _) (C_A)) -> 6 
  C_D (C_D _ (C_C _)) (C_D (C_B _ _) (C_A)) -> 7 
  C_D (C_D (C_B _ _) _) (C_D (C_C _) (C_A)) -> 8 
  C_D (C_D _ (C_A)) _ -> 9 
  C_D (C_D _ _) (C_D (C_B _ _) (C_C _)) -> 10 
  C_D (C_B _ (C_D _ _)) (C_A) -> 11 
