module Program_23 () where 

main = print $ show v_b
data B_A = C_A B_B | C_B ((Int,Int)) | C_C ((B_B,Int))
data B_B = C_D B_B

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A (C_D (C_D _)) -> 0 
