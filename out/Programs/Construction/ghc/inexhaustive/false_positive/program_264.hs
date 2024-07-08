module Program_16 () where 

 main = print $ show v_b
data B_A = C_A ((B_A,Int)) | C_B B_A ((B_A,(Int,Int))) | C_C B_A | C_D B_A (((Bool,Bool),B_A)) | C_E

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_C (C_A _) -> 1 
  C_C (C_B _ ((_,_))) -> 2 
  C_C (C_C (C_A _)) -> 3 
  C_C (C_C (C_B _ _)) -> 4 
  C_C (C_C (C_C _)) -> 5 
  C_C (C_C (C_D _ _)) -> 6 
  C_C (C_C C_E) -> 7 
  C_C (C_D _ ((_,_))) -> 8 
  C_C C_E -> 9 
  C_D _ _ -> 10 
  C_E -> 11 
