module Program_5 () where 

main = print $ show v_b
data B_B = C_D B_A | C_E Char | C_F Bool | C_G B_B B_A
data B_A = C_A B_B ((B_A,B_A)) | C_B ((B_B,(Bool,Char))) | C_C ((Bool,B_B))

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ -> 0 
  C_D (C_A (C_E _) ((C_A _ _,C_B _))) -> 1 
  C_G (C_F _) (C_A _ _) -> 2 
