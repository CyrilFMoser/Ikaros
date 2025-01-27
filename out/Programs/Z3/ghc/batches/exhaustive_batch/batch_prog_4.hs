module Program_4 () where 

main = print $ show v_b
data B_A a b = C_A (B_A Int a) (B_A a a) (B_A a b)

v_a :: C_A (B_A Int Int) (B_A Int Int) (B_A Int Bool)
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A _ _ _) (C_A _ _ _) _ -> 0 
  C_A _ (C_A _ _ _) _ -> 1 
  C_A (C_A _ _ _) (C_A _ _ _) (C_A _ _ _) -> 2 
  C_A _ _ _ -> 3 
  C_A _ _ (C_A _ _ _) -> 4 
