module Program_24 () where 

 main = print $ show v_b
data B_C a b = C_I | C_J (B_D a) b | C_K B_B
data B_D c = C_L | C_M | C_N B_B | C_O ((B_A,B_A)) c
data B_B = C_D ((Bool,B_A)) (B_D ((Bool,Int))) | C_E | C_F Char | C_G (B_C Int B_B) (B_D B_A) | C_H
data B_A = C_A | C_B B_B | C_C

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ _ -> 0 
  C_E -> 1 
  C_G _ _ -> 2 
  C_H -> 3 
