module Program_24 () where 

 main = print $ show v_b
data B_B = C_D | C_E (B_C ((Char,Int))) B_B | C_F B_A B_A | C_G (B_C Bool)
data B_D b c = C_M (((Int,Char),(Int,Bool))) ((Bool,B_A))
data B_C a = C_H a a | C_I | C_J | C_K a | C_L
data B_A = C_A | C_B (B_C B_B) B_B | C_C B_B

v_a :: B_D B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_M _ _ -> 0 
