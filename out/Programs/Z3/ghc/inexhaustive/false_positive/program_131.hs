module Program_11 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (B_A b b) (B_A a b)

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_B _ (C_A)) (C_B _ (C_B _ _)) -> 0 
  C_B (C_B _ (C_A)) (C_B (C_B _ _) (C_B _ _)) -> 1 
  C_B (C_B _ (C_B _ _)) (C_B (C_A) (C_A)) -> 2 
  C_B (C_B (C_A) (C_B _ _)) (C_B (C_A) (C_A)) -> 3 
  C_B (C_B (C_B _ _) (C_B _ _)) _ -> 4 
  C_B (C_B (C_B _ _) _) (C_B (C_A) (C_A)) -> 5 
