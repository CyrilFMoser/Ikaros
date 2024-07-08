module Program_27 () where 

main = print $ show v_b
data B_A a = C_A
data B_B = C_B Bool | C_C ((Int,B_B)) | C_D B_B | C_E Char Int

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D (C_C ((_,C_B _))) -> 0 
