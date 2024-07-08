module Program_21 () where 

 main = print $ show v_b
data B_A = C_A (B_C B_A B_A) ((B_A,Char))
data B_C c d = C_E | C_F | C_G | C_H | C_I c B_A
data B_B a b = C_B b | C_C a Int | C_D a a
data B_D e = C_J B_A (B_B e e) | C_K | C_L (B_D e) | C_M (B_B e e)

v_a :: B_C Char B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E -> 0 
  C_F -> 1 
  C_G -> 2 
  C_H -> 3 
