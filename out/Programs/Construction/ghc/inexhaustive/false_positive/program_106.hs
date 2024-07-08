module Program_18 () where 

 main = print $ show v_b
data B_A = C_A | C_B B_A B_A | C_C

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B _ C_A -> 1 
  C_B _ (C_B (C_B _ _) _) -> 2 
  C_B _ (C_B C_C _) -> 3 
  C_B _ C_C -> 4 
  C_C -> 5 
