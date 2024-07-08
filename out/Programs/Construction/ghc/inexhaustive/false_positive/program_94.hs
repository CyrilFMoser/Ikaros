module Program_8 () where 

 main = print $ show v_b
data B_A a = C_A B_C a | C_B B_C Bool
data B_B b c = C_C | C_D
data B_C = C_E | C_F (B_B ((Int,Char)) B_C) (B_B ((Char,Bool)) B_C)

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E -> 0 
