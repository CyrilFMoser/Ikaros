module Program_9 () where 

main = print $ show v_b
data B_A = C_A B_A Char B_A | C_B ((B_A,B_A)) B_A B_A | C_C B_A B_A Int

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B ((C_B _ _ _,C_B _ _ _)) (C_C _ _ _) (C_B _ _ _) -> 0 
  C_B ((C_C _ _ _,C_B _ _ _)) (C_A _ _ _) (C_B _ _ _) -> 1 
  C_B ((C_A _ _ _,C_A _ _ _)) (C_B _ _ _) _ -> 2 

--  This is not matched: (C_B (Tuple (C_B Wildcard Wildcard Wildcard B_A)
--             (C_C (C_C Wildcard Wildcard Wildcard B_A)
--                  (C_B Wildcard Wildcard Wildcard B_A)
--                  Int
--                  B_A))
--      Wildcard
--      Wildcard
--      B_A)