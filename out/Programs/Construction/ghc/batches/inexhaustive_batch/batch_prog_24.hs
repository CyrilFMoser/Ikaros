module Program_24 () where 

main = print $ show v_b
data B_A a b = C_A | C_B (B_A b b) Char | C_C (B_A a b)

v_a :: B_A Bool Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B (C_A) _ -> 1 
  C_B (C_B _ _) _ -> 2 
  C_B (C_C (C_A)) _ -> 3 
  C_B (C_C (C_B _ _)) _ -> 4 
  C_B (C_C (C_C _)) _ -> 5 
  C_C (C_B _ _) -> 6 
  C_C (C_C (C_A)) -> 7 
  C_C (C_C (C_B _ _)) -> 8 
  C_C (C_C (C_C _)) -> 9 

--  This is not matched: C_C (C_A)