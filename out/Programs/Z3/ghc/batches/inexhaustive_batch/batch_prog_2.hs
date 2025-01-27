module Program_2 () where 

main = print $ show v_b
data B_B a b = C_D a (B_B ((Bool,Char)) a) (B_B B_A B_A) | C_E
data B_A = C_A (B_B B_A B_A) (B_B B_A B_A) Int | C_B B_A (B_B B_A B_A) | C_C B_A (B_B B_A B_A) B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ (C_D _ _ _) _ -> 0 
  C_A (C_E) (C_E) _ -> 1 
  C_A (C_D _ _ _) (C_E) 12 -> 2 
  C_A (C_E) _ 12 -> 3 
  C_A _ (C_E) 12 -> 4 
  C_A _ (C_D _ _ _) 12 -> 5 
  C_A (C_E) (C_E) 12 -> 6 
  C_A (C_D _ _ _) (C_D _ _ _) 12 -> 7 
  C_A (C_D _ _ _) (C_E) _ -> 8 
  C_A _ _ _ -> 9 
  C_B (C_B _ _) (C_E) -> 10 
  C_C (C_B _ _) (C_E) (C_A _ _ _) -> 11 
  C_C (C_C _ _ _) (C_D _ _ _) (C_C _ _ _) -> 12 
  C_C (C_C _ _ _) _ (C_B _ _) -> 13 
  C_C (C_C _ _ _) (C_D _ _ _) _ -> 14 
  C_C _ (C_D _ _ _) (C_B _ _) -> 15 
  C_C (C_C _ _ _) (C_D _ _ _) (C_B _ _) -> 16 
  C_C _ (C_E) (C_C _ _ _) -> 17 
  C_C (C_B _ _) (C_E) _ -> 18 
  C_C _ (C_E) _ -> 19 
  C_C (C_B _ _) (C_D _ _ _) (C_C _ _ _) -> 20 
  C_C (C_B _ _) (C_E) (C_C _ _ _) -> 21 
  C_C (C_C _ _ _) (C_E) (C_C _ _ _) -> 22 
  C_C _ (C_D _ _ _) (C_C _ _ _) -> 23 
  C_C (C_C _ _ _) _ _ -> 24 
  C_C (C_A _ _ _) (C_E) _ -> 25 
  C_C (C_B _ _) (C_D _ _ _) _ -> 26 
  C_C (C_A _ _ _) (C_D _ _ _) (C_A _ _ _) -> 27 
  C_C (C_C _ _ _) (C_E) (C_A _ _ _) -> 28 
  C_C (C_A _ _ _) (C_E) (C_C _ _ _) -> 29 
  C_C (C_C _ _ _) (C_E) (C_B _ _) -> 30 
  C_C (C_A _ _ _) _ (C_C _ _ _) -> 31 
  C_C _ _ _ -> 32 

--  This is not matched: (C_B (C_C (C_A (C_E B_A B_A (B_B B_A B_A)) (C_E B_A B_A (B_B B_A B_A)) Int B_A)
--           (C_E B_A B_A (B_B B_A B_A))
--           Wildcard
--           B_A)
--      Wildcard
--      B_A)