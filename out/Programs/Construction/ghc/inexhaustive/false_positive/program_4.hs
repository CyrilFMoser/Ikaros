module Program_44 () where 

main = print $ show v_b
data B_A a = C_A ((Bool,B_A B_B)) (B_A (B_A (B_A B_B))) | C_B
data B_B = C_C | C_D | C_E (B_A Bool) B_B B_B

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 

--  This is not matched: C_B _ _ (C_A)