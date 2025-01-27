module Program_40 () where 

main = print $ show v_b
data B_B = C_C (B_A B_B) | C_D (B_A (B_A B_B)) ((B_A B_B,B_A B_B))
data B_A a = C_A B_B | C_B Int (B_A a)

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_C (C_A _)) -> 0 
  C_A (C_C (C_B _ _)) -> 1 
  C_A (C_D (C_A _) ((_,_))) -> 2 
  C_B _ (C_A (C_C _)) -> 3 
  C_B _ (C_A (C_D _ _)) -> 4 
  C_B _ (C_B _ (C_A _)) -> 5 
  C_B _ (C_B _ (C_B _ _)) -> 6 

--  This is not matched: C_B _ _ (C_A)