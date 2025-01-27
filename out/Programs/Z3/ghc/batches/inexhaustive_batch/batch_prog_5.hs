module Program_5 () where 

main = print $ show v_b
data B_A = C_A (B_B B_A B_A) (B_B B_A B_A) Int | C_B B_A (B_B B_A B_A) | C_C B_A (B_B B_A B_A) B_A
data B_B a b = C_D a (B_B ((Bool,Char)) a) (B_B B_A B_A) | C_E

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_C _ _ _) _ (C_C _ _ _) -> 0 

--  This is not matched: (C_B Wildcard (C_E B_A B_A (B_B B_A B_A)) B_A)