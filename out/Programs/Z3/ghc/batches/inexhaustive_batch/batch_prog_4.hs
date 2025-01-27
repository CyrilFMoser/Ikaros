module Program_4 () where 

main = print $ show v_b
data B_B a b = C_D a (B_B ((Bool,Char)) a) (B_B B_A B_A) | C_E
data B_A = C_A (B_B B_A B_A) (B_B B_A B_A) Int | C_B B_A (B_B B_A B_A) | C_C B_A (B_B B_A B_A) B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_B _ _) (C_D _ _ _) (C_A _ _ _) -> 0 
  C_C (C_A _ _ _) (C_E) (C_B _ _) -> 1 
  C_C (C_B _ _) _ (C_C _ _ _) -> 2 
  C_C (C_A _ _ _) (C_E) (C_A _ _ _) -> 3 
  C_C (C_B _ _) _ (C_B _ _) -> 4 
  C_C _ _ (C_B _ _) -> 5 
  C_C (C_B _ _) (C_E) (C_B _ _) -> 6 
  C_C (C_A _ _ _) _ _ -> 7 
  C_C _ _ (C_C _ _ _) -> 8 
  C_C (C_B _ _) (C_D _ _ _) (C_B _ _) -> 9 
  C_C (C_B _ _) _ _ -> 10 
  C_C (C_C _ _ _) _ (C_A _ _ _) -> 11 
  C_C (C_B _ _) _ (C_A _ _ _) -> 12 
  C_C (C_A _ _ _) (C_D _ _ _) (C_C _ _ _) -> 13 
  C_C _ (C_E) (C_A _ _ _) -> 14 

--  This is not matched: (C_B (C_B Wildcard (C_E B_A B_A (B_B B_A B_A)) B_A)
--      (C_E B_A B_A (B_B B_A B_A))
--      B_A)