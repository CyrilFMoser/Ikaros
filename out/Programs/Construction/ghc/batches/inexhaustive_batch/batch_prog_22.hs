module Program_22 () where 

main = print $ show v_b
data B_A = C_A B_A | C_B B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B (C_A (C_A _)) -> 1 
  C_B (C_A (C_B _)) -> 2 
  C_B (C_B (C_B _)) -> 3 

--  This is not matched: C_B (C_B (C_A _))