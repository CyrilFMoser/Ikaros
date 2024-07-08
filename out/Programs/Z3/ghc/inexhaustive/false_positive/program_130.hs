module Program_10 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (B_A b b) (B_A a b)

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_A) (C_B (C_A) (C_B _ _)) -> 0 
  C_B _ (C_B _ (C_A)) -> 1 
  C_B _ (C_B (C_B _ _) (C_B _ _)) -> 2 
  C_B (C_B (C_B _ _) (C_A)) (C_B (C_A) _) -> 3 
  C_B (C_B (C_A) (C_B _ _)) (C_B _ _) -> 4 
  C_B (C_B (C_A) _) (C_B (C_A) (C_B _ _)) -> 5 
  C_B (C_B (C_B _ _) (C_A)) (C_B _ _) -> 6 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B _ (C_A)) -> 7 
  C_B (C_B _ (C_B _ _)) (C_B (C_A) (C_B _ _)) -> 8 
  C_B (C_B (C_B _ _) (C_A)) _ -> 9 
  C_B (C_B _ _) (C_B (C_A) _) -> 10 
  C_B (C_A) (C_A) -> 11 
  C_B (C_B (C_A) _) (C_B (C_B _ _) (C_A)) -> 12 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B (C_A) _) -> 13 
  C_B (C_B _ _) (C_B _ (C_A)) -> 14 
  C_B (C_B _ _) (C_B (C_A) (C_B _ _)) -> 15 
  C_B (C_B (C_A) _) (C_B _ (C_A)) -> 16 
  C_B (C_B (C_B _ _) (C_A)) (C_B (C_A) (C_A)) -> 17 
  C_B _ (C_B (C_B _ _) _) -> 18 
  C_B (C_B (C_B _ _) _) _ -> 19 
  C_B (C_B _ (C_A)) (C_B _ (C_A)) -> 20 
  C_B (C_A) (C_B (C_B _ _) _) -> 21 
  C_B (C_B (C_A) (C_A)) _ -> 22 
  C_B (C_B (C_B _ _) _) (C_B _ _) -> 23 
  C_B (C_B (C_A) (C_A)) (C_B (C_B _ _) (C_B _ _)) -> 24 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B (C_A) (C_A)) -> 25 
  C_B (C_A) (C_B (C_A) _) -> 26 
