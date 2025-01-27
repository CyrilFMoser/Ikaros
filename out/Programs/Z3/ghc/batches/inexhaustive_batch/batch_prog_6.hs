module Program_6 () where 

main = print $ show v_b
data B_B a b = C_D a (B_B ((Bool,Char)) a) (B_B B_A B_A) | C_E
data B_A = C_A (B_B B_A B_A) (B_B B_A B_A) Int | C_B B_A (B_B B_A B_A) | C_C B_A (B_B B_A B_A) B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ _ (C_A _ _ _) -> 0 
  C_C (C_A _ _ _) (C_D _ _ _) (C_B _ _) -> 1 

--  This is not matched: (C_C Wildcard
--      Wildcard
--      (C_C (C_C (C_C Wildcard Wildcard Wildcard B_A)
--                Wildcard
--                (C_C Wildcard Wildcard (C_A Wildcard Wildcard Wildcard B_A) B_A)
--                B_A)
--           Wildcard
--           (C_B (C_C Wildcard Wildcard Wildcard B_A)
--                (C_E B_A B_A (B_B B_A B_A))
--                B_A)
--           B_A)
--      B_A)