module Program_26 () where 

main = print $ show v_b
data B_A a b = C_A (B_A a a) b Char | C_B (B_A (B_A (B_A a a) (B_A a a)) a) (B_A a b)

v_a :: B_A Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ _ -> 0 
  C_B (C_A (C_A _ _ _) _ 'x') (C_A _ _ _) -> 1 
  C_B (C_A (C_A _ _ _) _ 'x') (C_B _ (C_A _ _ _)) -> 2 
  C_B (C_A (C_A _ _ _) _ 'x') (C_B _ (C_B _ _)) -> 3 
  C_B (C_A (C_A _ _ _) _ _) (C_A _ _ _) -> 4 
  C_B (C_A (C_A _ _ _) _ _) (C_B _ (C_A _ _ _)) -> 5 
  C_B (C_A (C_A _ _ _) _ _) (C_B _ (C_B _ _)) -> 6 
  C_B (C_A (C_B _ _) _ 'x') (C_A _ _ _) -> 7 
  C_B (C_A (C_B _ _) _ 'x') (C_B _ (C_A _ _ _)) -> 8 
  C_B (C_A (C_B _ _) _ 'x') (C_B _ (C_B _ _)) -> 9 
  C_B (C_A (C_B _ _) _ _) (C_A _ _ _) -> 10 
  C_B (C_A (C_B _ _) _ _) (C_B _ (C_A _ _ _)) -> 11 
  C_B (C_A (C_B _ _) _ _) (C_B _ (C_B _ _)) -> 12 
  C_B (C_B (C_A _ _ _) (C_A _ _ _)) (C_A _ _ _) -> 13 
  C_B (C_B (C_A _ _ _) (C_A _ _ _)) (C_B _ (C_A _ _ _)) -> 14 
  C_B (C_B (C_A _ _ _) (C_A _ _ _)) (C_B _ (C_B _ _)) -> 15 
  C_B (C_B (C_B _ _) (C_A _ _ _)) (C_A _ _ _) -> 16 
  C_B (C_B (C_B _ _) (C_A _ _ _)) (C_B _ (C_A _ _ _)) -> 17 
  C_B (C_B (C_B _ _) (C_A _ _ _)) (C_B _ (C_B _ _)) -> 18 
  C_B (C_B (C_A _ _ _) (C_B _ _)) (C_A _ _ _) -> 19 
  C_B (C_B (C_A _ _ _) (C_B _ _)) (C_B _ (C_A _ _ _)) -> 20 
  C_B (C_B (C_A _ _ _) (C_B _ _)) (C_B _ (C_B _ _)) -> 21 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B _ (C_A _ _ _)) -> 22 
  C_B (C_B (C_B _ _) (C_B _ _)) (C_B _ (C_B _ _)) -> 23 

--  This is not matched: C_B (C_B (C_B _ _) (C_B _ _)) (C_A _ _ _)