module Program_9 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (B_A b b) (B_A a b)

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B (C_B _ _) (C_B _ _) -> 0 
  C_B (C_B _ (C_B _ _)) (C_B (C_B _ _) (C_B _ _)) -> 1 
  C_B (C_B _ (C_A)) (C_B (C_A) (C_A)) -> 2 
  C_B (C_B _ _) (C_B (C_B _ _) (C_B _ _)) -> 3 
  C_B (C_B (C_B _ _) (C_A)) (C_B (C_A) (C_B _ _)) -> 4 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B (C_B _ _) (C_A)) -> 5 
  C_B _ (C_A) -> 6 
  C_B (C_B (C_B _ _) _) (C_B (C_A) (C_B _ _)) -> 7 
  C_B (C_B (C_A) (C_B _ _)) (C_A) -> 8 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B (C_B _ _) _) -> 9 
  C_B (C_B (C_A) (C_A)) (C_B (C_A) (C_A)) -> 10 
  C_B (C_B _ (C_A)) (C_B (C_B _ _) (C_A)) -> 11 
  C_B _ (C_B _ _) -> 12 
  C_B (C_B (C_B _ _) _) (C_B _ (C_B _ _)) -> 13 
  C_B (C_B _ _) (C_B (C_B _ _) (C_A)) -> 14 
  C_B (C_A) (C_B _ _) -> 15 
  C_B (C_B _ (C_B _ _)) (C_B (C_B _ _) (C_A)) -> 16 
  C_B (C_A) (C_B _ (C_B _ _)) -> 17 
  C_B (C_B _ (C_B _ _)) (C_B _ (C_B _ _)) -> 18 
  C_B (C_B (C_A) _) (C_B (C_B _ _) _) -> 19 
  C_B (C_B (C_A) (C_A)) (C_B _ (C_B _ _)) -> 20 
  C_B (C_B (C_A) (C_A)) (C_B (C_A) (C_B _ _)) -> 21 
  C_B (C_B _ _) (C_A) -> 22 
  C_B (C_B (C_B _ _) (C_A)) (C_A) -> 23 
  C_B (C_B _ _) (C_B _ (C_B _ _)) -> 24 
  C_B (C_B (C_A) (C_A)) (C_B (C_B _ _) _) -> 25 
  C_B (C_B _ _) (C_B (C_B _ _) _) -> 26 
  C_B (C_B (C_A) (C_A)) (C_B (C_B _ _) (C_A)) -> 27 
  C_B _ (C_B (C_A) (C_B _ _)) -> 28 
  C_B (C_B (C_B _ _) (C_A)) (C_B (C_B _ _) (C_B _ _)) -> 29 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B _ (C_B _ _)) -> 30 
  C_B (C_B (C_A) _) (C_B _ _) -> 31 
  C_B (C_B _ (C_B _ _)) (C_B _ _) -> 32 
  C_B (C_B (C_A) (C_B _ _)) (C_B (C_A) _) -> 33 
  C_B (C_B (C_A) _) (C_B _ (C_B _ _)) -> 34 
  C_B (C_B _ (C_B _ _)) (C_B _ (C_A)) -> 35 
  C_B (C_B (C_B _ _) (C_A)) (C_B _ (C_B _ _)) -> 36 
  C_B (C_B _ _) (C_B (C_A) (C_A)) -> 37 
  C_B (C_B (C_A) (C_A)) (C_B (C_A) _) -> 38 
  C_B (C_B (C_B _ _) _) (C_B _ (C_A)) -> 39 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B (C_A) (C_B _ _)) -> 40 
  C_B _ (C_B (C_A) _) -> 41 
  C_B (C_B (C_A) (C_B _ _)) (C_B _ (C_B _ _)) -> 42 
  C_B (C_B (C_B _ _) _) (C_A) -> 43 
  C_B (C_B _ _) _ -> 44 
  C_B _ (C_B _ (C_B _ _)) -> 45 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B (C_B _ _) (C_B _ _)) -> 46 
  C_B (C_B (C_B _ _) (C_A)) (C_B (C_B _ _) _) -> 47 
  C_B (C_B (C_A) (C_A)) (C_B _ (C_A)) -> 48 
  C_B (C_B (C_A) _) (C_A) -> 49 
  C_B (C_B (C_A) (C_B _ _)) _ -> 50 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B _ _) -> 51 
  C_B (C_B _ (C_B _ _)) (C_B (C_B _ _) _) -> 52 
  C_B (C_B _ (C_A)) (C_B (C_A) (C_B _ _)) -> 53 
