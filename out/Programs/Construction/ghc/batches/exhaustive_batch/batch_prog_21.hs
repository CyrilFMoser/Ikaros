module Program_21 () where 

 main = print $ show v_b
data B_C = C_F Int Int
data B_A a b = C_A (B_A b b) | C_B a (B_B b) | C_C B_C | C_D (B_B b) B_C
data B_B c = C_E Bool

v_a :: B_A Bool Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A _) -> 0 
  C_A (C_B _ (C_E _)) -> 1 
  C_A (C_C _) -> 2 
  C_A (C_D _ _) -> 3 
  C_B _ _ -> 4 
  C_C (C_F _ _) -> 5 
  C_D _ _ -> 6 
