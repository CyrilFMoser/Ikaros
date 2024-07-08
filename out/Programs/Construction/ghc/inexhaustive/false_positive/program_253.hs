module Program_7 () where 

 main = print $ show v_b
data B_C c d = C_J | C_K c
data B_B a b = C_F | C_G | C_H | C_I
data B_A = C_A | C_B (B_C B_A B_A) | C_C | C_D | C_E (B_B ((Char,Int)) B_A) (B_B Bool Char)

v_a :: B_B B_A Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G -> 0 
  C_H -> 1 
  C_I -> 2 
