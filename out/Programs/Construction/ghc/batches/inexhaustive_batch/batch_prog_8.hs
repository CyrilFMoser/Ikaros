module Program_8 () where 

main = print $ show v_b
data B_A a b = C_A (B_A b b) | C_B (B_A b b) (B_A b b) Int

v_a :: C_B (B_A Int Int) (B_A Int Int) Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ (C_B _ _ _) _ -> 0 

--  This is not matched: C_B _ (C_A _) _