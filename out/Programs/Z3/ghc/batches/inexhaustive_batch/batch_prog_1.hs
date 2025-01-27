module Program_1 () where 

main = print $ show v_b
data B_A a = C_A (B_A a) a | C_B Int a

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 

--  This is not matched: (C_B Char Wildcard Wildcard (B_A Char))