module Program_22 () where 

main = print $ show v_b
data B_B = C_B Bool | C_C ((Int,B_B)) | C_D B_B | C_E Char Int
data B_A a = C_A

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_C ((_,C_B _)) -> 0 
  C_C ((_,C_D (C_E _ _))) -> 1 
