module Program_6 () where 

 main = print $ show v_b
data B_D = C_F
data B_B a b = C_D Int B_D
data B_A = C_A B_D (B_B ((Int,Char)) Bool) | C_B | C_C
data B_C = C_E Bool ((Bool,Bool))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ _ -> 0 
  C_B -> 1 
