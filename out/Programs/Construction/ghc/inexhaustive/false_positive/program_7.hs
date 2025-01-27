module Program_41 () where 

main = print $ show v_b
data B_B = C_D (B_A ((B_B,B_B))) B_B (B_A B_B) | C_E B_B
data B_A a = C_A (B_A a) (B_A a) | C_B B_B (B_A a) (B_A a) | C_C B_B Int

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_B (C_D _ _ _) _ _) _ _ -> 0 
  C_D (C_B (C_E _) _ _) _ _ -> 1 
  C_D (C_C (C_D _ _ _) 12) _ _ -> 2 
  C_D (C_C (C_E _) 12) _ _ -> 3 
  C_D (C_C (C_D _ _ _) _) _ _ -> 4 
  C_D (C_C (C_E _) _) _ _ -> 5 
  C_E (C_D _ _ (C_A _ _)) -> 6 
  C_E (C_D _ _ (C_B _ _ _)) -> 7 
  C_E (C_D _ _ (C_C _ _)) -> 8 
  C_E (C_E (C_D _ _ _)) -> 9 
  C_E (C_E (C_E _)) -> 10 

--  This is not matched: C_B _ _ (C_A)