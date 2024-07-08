module Program_1 () where 

 main = print $ show v_b
data B_B b c = C_C (B_B b b) | C_D (((Int,Int),Bool)) b | C_E (B_A c) | C_F (((Int,Char),(Int,Char)))
data B_A a = C_A a Char | C_B a (B_A Bool)

v_a :: B_B Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E (C_B _ _) -> 0 
  C_C (C_E (C_A _ _)) -> 1 
