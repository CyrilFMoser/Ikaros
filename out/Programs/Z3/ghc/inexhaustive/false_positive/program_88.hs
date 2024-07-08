module Program_30 () where 

 main = print $ show v_b
data B_A a = C_A a Char | C_B a (B_A Bool)
data B_B b c = C_C (B_B b b) | C_D (((Int,Int),Bool)) b | C_E (B_A c) | C_F (((Int,Char),(Int,Char)))

v_a :: B_B Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ -> 0 
  C_E (C_B _ (C_A _ _)) -> 1 
  C_C (C_F _) -> 2 
