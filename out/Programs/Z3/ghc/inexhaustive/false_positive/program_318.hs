module Program_8 () where 

 main = print $ show v_b
data B_A = C_A ((B_B,Char)) B_A | C_B B_B
data B_B = C_C | C_D B_A | C_E B_B Char | C_F B_A

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_D (C_A _ _)) _ -> 0 
  C_D (C_B (C_D _)) -> 1 
  C_D (C_A ((C_E _ _,_)) (C_B _)) -> 2 
  C_D (C_A ((C_E _ _,_)) _) -> 3 
