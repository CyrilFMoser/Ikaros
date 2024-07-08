module Program_28 () where 

 main = print $ show v_b
data B_D e = C_I
data B_C c d = C_G ((B_A,(Char,Int))) | C_H (B_B c c) ((B_A,B_A))
data B_B a b = C_B | C_C ((B_A,Int)) Char | C_D (B_C b a) (B_C b ((Bool,Int))) | C_E | C_F
data B_A = C_A Int (B_C Bool B_A)

v_a :: B_B B_A B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C _ _ -> 0 
  C_D _ _ -> 1 
  C_E -> 2 
  C_F -> 3 
