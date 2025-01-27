module Program_35 () where 

main = print $ show v_b
data B_A a = C_A a (B_A a) | C_B (B_A a) (B_A a) Char | C_C a (B_A (B_A Char))

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B (C_A 'x' _) _ 'x' -> 1 
  C_B (C_A 'x' _) _ _ -> 2 
  C_B (C_A _ _) _ 'x' -> 3 
  C_B (C_A _ _) _ _ -> 4 
  C_B (C_B _ _ _) _ 'x' -> 5 
  C_B (C_B _ _ _) _ _ -> 6 
  C_B (C_C _ (C_A _ _)) _ 'x' -> 7 
  C_B (C_C _ (C_A _ _)) _ _ -> 8 
  C_B (C_C _ (C_B _ _ _)) _ 'x' -> 9 
  C_B (C_C _ (C_B _ _ _)) _ _ -> 10 
  C_B (C_C _ (C_C _ _)) _ 'x' -> 11 
  C_B (C_C _ (C_C _ _)) _ _ -> 12 
  C_C _ (C_A (C_A _ _) (C_A _ _)) -> 13 
  C_C _ (C_A (C_B _ _ _) (C_A _ _)) -> 14 
  C_C _ (C_A (C_C _ _) (C_A _ _)) -> 15 
  C_C _ (C_A (C_A _ _) (C_B _ _ _)) -> 16 
  C_C _ (C_A (C_B _ _ _) (C_B _ _ _)) -> 17 
  C_C _ (C_A (C_C _ _) (C_B _ _ _)) -> 18 
  C_C _ (C_A (C_A _ _) (C_C _ _)) -> 19 
  C_C _ (C_A (C_B _ _ _) (C_C _ _)) -> 20 
  C_C _ (C_A (C_C _ _) (C_C _ _)) -> 21 
  C_C _ (C_B _ _ _) -> 22 
  C_C _ (C_C (C_A _ _) _) -> 23 
  C_C _ (C_C (C_B _ _ _) _) -> 24 

--  This is not matched: C_B _ _ (C_A)