module Program_22 () where 

main = print $ show v_b
data B_A a = C_A ((B_B,B_B))
data B_B = C_B Char (B_A B_B) | C_C B_B | C_D ((B_B,(Char,Char))) B_B | C_E B_B

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C (C_B _ _) -> 0 
  C_C (C_D ((C_C _,(_,_))) _) -> 1 
  C_D ((C_C (C_E _),(_,_))) (C_D ((C_D _ _,(_,_))) (C_B _ _)) -> 2 
  C_D ((C_E (C_E _),(_,_))) (C_D ((C_D _ _,(_,_))) (C_C _)) -> 3 
  C_D ((C_D _ (C_D _ _),(_,_))) (C_C (C_D _ _)) -> 4 
