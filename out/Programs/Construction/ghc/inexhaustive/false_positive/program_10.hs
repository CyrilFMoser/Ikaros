module Program_38 () where 

main = print $ show v_b
data B_B = C_D (B_A B_B (B_A Char B_B)) | C_E (((B_B,B_B),B_B)) | C_F B_B (B_A (B_A B_B B_B) Bool)
data B_A a b = C_A (B_A b b) B_B (B_A a b) | C_B | C_C B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ -> 0 
  C_E (((_,_),C_D _)) -> 1 
  C_E (((_,_),C_E _)) -> 2 
  C_E (((_,_),C_F _ _)) -> 3 
  C_F _ (C_A _ (C_D _) _) -> 4 
  C_F _ (C_A _ (C_E _) _) -> 5 
  C_F _ (C_B) -> 6 
  C_F _ (C_C (C_D _)) -> 7 
  C_F _ (C_C (C_E _)) -> 8 
  C_F _ (C_C (C_F _ _)) -> 9 

--  This is not matched: C_B _ _ (C_A)