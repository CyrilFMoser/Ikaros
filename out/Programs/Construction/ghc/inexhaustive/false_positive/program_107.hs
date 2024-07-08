module Program_19 () where 

 main = print $ show v_b
data B_B = C_E ((B_B,(Int,Int))) B_B | C_F Int | C_G ((B_A,(Bool,Char))) | C_H | C_I (B_C ((Bool,Char))) B_B
data B_A = C_A | C_B B_A | C_C B_A B_B | C_D Int
data B_C a = C_J (B_C B_B)

v_a :: B_C B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_J _ -> 0 
