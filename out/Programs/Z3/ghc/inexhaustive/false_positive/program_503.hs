module Program_24 () where 

main = print $ show v_b
data B_A a = C_A ((B_B,B_B))
data B_B = C_B Char (B_A B_B) | C_C B_B | C_D ((B_B,(Char,Char))) B_B | C_E B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D ((C_D ((_,_)) _,(_,_))) (C_D ((C_D _ _,(_,_))) (C_E _)) -> 0 
