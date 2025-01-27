module Program_1 () where 

main = print $ show v_b
data B_A a = C_A (B_A a) | C_B ((B_B,B_B)) B_B B_B
data B_B = C_C (B_A Int) Bool B_B | C_D

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B _ (C_C _ _ _) _ -> 1 

--  This is not matched: C_B _ C_D _