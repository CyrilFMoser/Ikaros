module Program_6 () where 

 main = print $ show v_b
data B_B = C_C | C_D B_A | C_E B_B Char | C_F B_A
data B_A = C_A ((B_B,Char)) B_A | C_B B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F (C_A _ (C_A _ _)) -> 0 
  C_D (C_A ((C_C,_)) _) -> 1 
  C_D (C_A ((C_C,_)) (C_B _)) -> 2 
  C_D (C_A ((C_D _,_)) (C_B _)) -> 3 
  C_D (C_B C_C) -> 4 
  C_D (C_A ((C_F _,_)) (C_B _)) -> 5 
  C_D (C_A ((C_D _,_)) (C_A _ _)) -> 6 
  C_D _ -> 7 
  C_D (C_A ((C_E _ _,_)) (C_A _ _)) -> 8 
