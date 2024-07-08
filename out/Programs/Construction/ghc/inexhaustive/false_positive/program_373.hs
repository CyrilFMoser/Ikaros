module Program_28 () where 

 main = print $ show v_b
data B_A a b = C_A | C_B (B_A ((Int,Char)) ((Int,Char))) a | C_C Int (B_A a B_B)
data B_B = C_D | C_E B_C ((Char,B_C))
data B_C = C_F

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
