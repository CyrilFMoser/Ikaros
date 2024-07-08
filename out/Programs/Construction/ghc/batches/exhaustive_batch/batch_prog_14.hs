module Program_14 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (B_A a b) (B_A b b)

v_a :: B_A Int Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B (C_A) (C_A) -> 1 
  C_B (C_B (C_A) (C_A)) (C_A) -> 2 
  C_B (C_B (C_A) (C_B _ _)) (C_A) -> 3 
  C_B (C_B (C_B _ _) (C_A)) (C_A) -> 4 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_A) -> 5 
  C_B (C_A) (C_B _ _) -> 6 
  C_B (C_B (C_A) (C_A)) (C_B _ _) -> 7 
  C_B (C_B (C_A) (C_B _ _)) (C_B _ _) -> 8 
  C_B (C_B (C_B _ _) (C_A)) (C_B _ _) -> 9 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B _ _) -> 10 
