module Program_4 () where 

main = print $ show v_b
data B_A a = C_A (B_A a) a | C_B Bool Char a
data B_B = C_C (B_A B_B) (B_A (B_A B_B))

v_a :: B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 

--  This is not matched: C_B _ _ _