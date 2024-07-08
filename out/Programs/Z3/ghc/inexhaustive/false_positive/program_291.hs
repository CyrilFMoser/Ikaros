module Program_11 () where 

 main = print $ show v_b
data B_B = C_C | C_D B_A | C_E B_B Char | C_F B_A
data B_A = C_A ((B_B,Char)) B_A | C_B B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_F (C_B _)) _ -> 0 
  C_E (C_E (C_F _) _) _ -> 1 
  C_E (C_D _) _ -> 2 
