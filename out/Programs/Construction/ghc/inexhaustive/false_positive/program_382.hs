module Program_8 () where 

 main = print $ show v_b
data B_A a b = C_A B_B b | C_B Char | C_C | C_D
data B_B = C_E ((B_B,(Char,Int))) | C_F | C_G | C_H B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ -> 0 
  C_F -> 1 
  C_G -> 2 
