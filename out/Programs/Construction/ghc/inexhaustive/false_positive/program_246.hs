module Program_29 () where 

 main = print $ show v_b
data B_B a = C_F
data B_D b = C_L b | C_M | C_N | C_O (((Int,Char),Char))
data B_C = C_G (B_B ((Char,Char))) (B_D B_C) | C_H Int | C_I (B_D Char) (B_B ((Bool,Int))) | C_J (B_D B_C) (B_D B_A) | C_K (((Bool,Char),B_C))
data B_A = C_A Int (B_D ((Bool,Int))) | C_B B_C B_C | C_C ((B_C,Int)) | C_D | C_E (B_D B_A) Int

v_a :: B_D Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_L _ -> 0 
  C_N -> 1 
  C_O (((_,_),_)) -> 2 
