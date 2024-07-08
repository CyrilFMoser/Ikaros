module Program_19 () where 

main = print $ show v_b
data B_B = C_D B_B
data B_A = C_A B_B | C_B ((Int,Int)) | C_C ((B_B,Int))

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C ((C_D (C_D _),_)) -> 0 
