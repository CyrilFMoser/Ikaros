module Program_29 () where 

main = print $ show v_b
data B_A = C_A B_B Bool | C_B B_B B_B B_B | C_C B_B
data B_B = C_D B_B B_B B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B (C_D (C_D _ _ _) _ (C_A _ _)) _ _ -> 1 
  C_B (C_D (C_D _ _ _) _ (C_C _)) _ _ -> 2 
  C_C (C_D _ _ _) -> 3 

--  This is not matched: C_B _ _ (C_A)