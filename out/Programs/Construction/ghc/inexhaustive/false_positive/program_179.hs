module Program_26 () where 

 main = print $ show v_b
data B_A a = C_A ((Int,B_B)) B_B
data B_B = C_B | C_C Bool | C_D
data B_C = C_E B_B | C_F Bool (B_D B_C ((Bool,Char)))
data B_D b c = C_G

v_a :: B_D Char Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G -> 0 
