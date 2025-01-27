module Program_27 () where 

main = print $ show v_b
data B_A = C_A | C_B | C_C B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B -> 1 
  C_C C_B -> 2 
  C_C (C_C C_A) -> 3 
  C_C (C_C C_B) -> 4 
  C_C (C_C (C_C _)) -> 5 

--  This is not matched: C_C C_A