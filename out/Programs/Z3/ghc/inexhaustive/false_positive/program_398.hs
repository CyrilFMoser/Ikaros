module Program_21 () where 

 main = print $ show v_b
data B_B = C_B | C_C B_A B_B | C_D B_A B_A | C_E
data B_A = C_A B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ (C_C (C_A _) _) -> 0 
  C_C (C_A C_E) (C_D _ _) -> 1 
