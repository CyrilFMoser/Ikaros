module Program_16 () where 

main = print $ show v_b
data B_A = C_A B_A | C_B
data B_B = C_C B_A B_B B_A | C_D ((B_A,(B_A,Bool)))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_A (C_A _)) -> 0 
  C_A (C_A C_B) -> 1 
  C_B -> 2 

--  This is not matched: C_A C_B