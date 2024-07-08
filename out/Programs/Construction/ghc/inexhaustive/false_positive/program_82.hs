module Program_25 () where 

 main = print $ show v_b
data B_B c d = C_B Int (B_C c)
data B_D = C_F (B_C B_D) ((B_D,(Char,Char))) | C_G | C_H | C_I | C_J
data B_A a b = C_A (B_B a b) (B_B a a)
data B_C e = C_C | C_D | C_E ((B_D,Char))

v_a :: B_D
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G -> 0 
  C_H -> 1 
  C_I -> 2 
  C_J -> 3 
