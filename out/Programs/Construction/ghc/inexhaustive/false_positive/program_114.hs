module Program_25 () where 

 main = print $ show v_b
data B_C = C_F
data B_B a b = C_C | C_D | C_E
data B_A = C_A B_A | C_B Char (B_B Char B_A)

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
