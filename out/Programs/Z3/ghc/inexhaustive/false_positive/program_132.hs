module Program_12 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (B_A b b) (B_A a b)

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_B (C_B _ _) (C_A)) (C_B (C_B _ _) (C_A)) -> 0 
  C_B (C_B _ (C_A)) (C_B (C_B _ _) _) -> 1 
  C_B (C_B _ (C_B _ _)) (C_B (C_A) _) -> 2 
  C_B (C_B _ (C_B _ _)) (C_A) -> 3 
  C_B (C_B (C_A) _) _ -> 4 
  C_B (C_B _ (C_A)) _ -> 5 
  C_B (C_B (C_B _ _) _) (C_B (C_B _ _) (C_A)) -> 6 
  C_B (C_B _ (C_A)) (C_B (C_A) _) -> 7 
