module Program_1 () where 

 main = print $ show v_b
data B_C = C_G
data B_D = C_H | C_I ((B_D,(Char,Bool))) | C_J | C_K Int B_D | C_L (B_B B_A)
data B_B a = C_D ((B_A,(Char,Char))) | C_E | C_F
data B_A = C_A | C_B B_C | C_C (B_B B_D)

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G -> 0 
