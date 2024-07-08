module Program_26 () where 

 main = print $ show v_b
data B_A a b = C_A b | C_B (B_B b) (B_B a) | C_C Int | C_D
data B_C d e = C_F (((Char,Bool),(Char,Char))) ((Int,Bool))
data B_B c = C_E c (B_C c c)

v_a :: B_C Int Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ _ -> 0 
