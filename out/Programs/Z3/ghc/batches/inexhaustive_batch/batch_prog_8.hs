module Program_8 () where 

main = print $ show v_b
data B_A = C_A B_A Char B_A | C_B ((B_A,B_A)) B_A B_A | C_C B_A B_A Int

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_B _ _ _) _ _ -> 0 
  C_A (C_A _ _ _) 'x' _ -> 1 
  C_A _ 'x' (C_A _ _ _) -> 2 
  C_A (C_C _ _ _) _ (C_B _ _ _) -> 3 
  C_A (C_B _ _ _) _ (C_A _ _ _) -> 4 
  C_A (C_C _ _ _) _ (C_A _ _ _) -> 5 
  C_B ((C_C _ _ _,C_A _ _ _)) _ (C_C _ _ _) -> 6 
  C_B ((C_A _ _ _,C_B _ _ _)) (C_A _ _ _) (C_B _ _ _) -> 7 
  C_B _ _ (C_C _ _ _) -> 8 
  C_B ((C_A _ _ _,C_C _ _ _)) (C_C _ _ _) (C_B _ _ _) -> 9 
  C_B ((C_C _ _ _,C_B _ _ _)) (C_B _ _ _) (C_C _ _ _) -> 10 
  C_B ((C_B _ _ _,C_B _ _ _)) (C_C _ _ _) _ -> 11 

--  This is not matched: (C_C Wildcard Wildcard Int B_A)