module Program_1 () where 

 main = print $ show v_b
data B_C = C_K | C_L ((B_A,B_C)) B_B | C_M B_A | C_N | C_O
data B_D a b = C_P a | C_Q | C_R ((B_A,B_A)) B_C | C_S B_A a | C_T
data B_A = C_A B_B ((B_A,(Bool,Char))) | C_B | C_C ((Char,Int)) | C_D B_C B_B | C_E
data B_B = C_F | C_G | C_H | C_I | C_J

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F -> 0 
  C_H -> 1 
  C_I -> 2 
  C_J -> 3 
