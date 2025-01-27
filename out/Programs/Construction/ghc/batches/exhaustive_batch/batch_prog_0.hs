module Program_0 () where 

main = print $ show v_b
data B_B a b = C_D a B_A
data B_A = C_A | C_B ((B_B B_A ((Char,Char)),B_A)) | C_C

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A -> 0 
  C_B ((C_D _ _,C_A)) -> 1 
  C_B ((C_D _ _,C_B _)) -> 2 
  C_B ((C_D _ _,C_C)) -> 3 
  C_C -> 4 
