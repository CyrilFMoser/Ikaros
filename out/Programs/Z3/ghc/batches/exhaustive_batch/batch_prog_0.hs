module Program_0 () where 

main = print $ show v_b
data B_B = C_C | C_D | C_E B_B ((B_B,Bool)) (B_A B_B)
data B_A a = C_A | C_B ((B_B,B_B))

v_a :: C_B ((B_B,B_B))
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B _ -> 0 
  C_B ((C_C,C_D)) -> 1 
