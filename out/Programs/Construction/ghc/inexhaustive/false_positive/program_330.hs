module Program_18 () where 

 main = print $ show v_b
data B_A = C_A (B_B B_D) ((B_D,B_A)) | C_B | C_C | C_D Char | C_E B_A
data B_C b = C_J b (B_B B_D)
data B_D = C_K
data B_B a = C_F | C_G ((Bool,B_D)) B_D | C_H B_A | C_I a

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B -> 1 
  C_C -> 2 
  C_D _ -> 3 
  C_E (C_A (C_G _ _) ((_,_))) -> 4 
  C_E (C_A (C_H _) ((_,_))) -> 5 
  C_E (C_A (C_I _) ((_,_))) -> 6 
  C_E C_B -> 7 
  C_E C_C -> 8 
  C_E (C_D _) -> 9 
  C_E (C_E _) -> 10 
