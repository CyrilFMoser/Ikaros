module Program_23 () where 

main = print $ show v_b
data B_A = C_A Bool | C_B Char

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B 'x' -> 0 
  C_B _ -> 1 

--  This is not matched: C_A _