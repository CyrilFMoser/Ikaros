module Program_15 () where 

 main = print $ show v_b
data B_A = C_A | C_B | C_C | C_D ((B_A,B_A)) B_A | C_E B_A

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B -> 1 
  C_C -> 2 
  C_D _ _ -> 3 
  C_E C_A -> 4 
  C_E C_B -> 5 
  C_E C_C -> 6 
  C_E (C_D _ _) -> 7 
  C_E (C_E C_A) -> 8 
  C_E (C_E C_B) -> 9 
  C_E (C_E (C_D _ _)) -> 10 
  C_E (C_E (C_E _)) -> 11 
