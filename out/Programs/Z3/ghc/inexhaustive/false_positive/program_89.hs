module Program_31 () where 

 main = print $ show v_b
data B_B b c = C_C (B_B b b) | C_D (((Int,Int),Bool)) b | C_E (B_A c) | C_F (((Int,Char),(Int,Char)))
data B_A a = C_A a Char | C_B a (B_A Bool)

v_a :: B_B Char Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ _ -> 0 
  C_F (((_,_),(_,_))) -> 1 
  C_E (C_B _ (C_B _ _)) -> 2 
  C_C (C_C (C_F _)) -> 3 
  C_C (C_C (C_D _ _)) -> 4 
  C_C (C_C _) -> 5 
  C_C (C_C (C_C _)) -> 6 
