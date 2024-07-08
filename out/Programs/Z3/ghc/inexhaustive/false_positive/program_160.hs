module Program_0 () where 

 main = print $ show v_b
data B_B = C_E ((B_B,B_B)) ((B_B,Bool)) | C_F B_B Bool
data B_A a b = C_A | C_B (((Bool,Int),B_B)) | C_C B_B (((Int,Int),B_B)) | C_D (B_A a B_B)

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E ((C_E ((_,_)) _,C_F (C_E _ _) _)) ((C_F (C_F _ _) _,_)) -> 0 
