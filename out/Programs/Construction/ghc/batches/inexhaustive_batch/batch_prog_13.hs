module Program_13 () where 

main = print $ show v_b
data B_A a = C_A (B_A a) (B_A a) (B_A a) | C_B (B_A a)

v_a :: B_A Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ _ -> 0 
  C_B (C_A _ _ _) -> 1 

--  This is not matched: C_B (C_B _)