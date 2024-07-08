module Program_12 () where 

main = print $ show v_b
data B_A a = C_A Char | C_B | C_C a ((Int,Char)) | C_D ((Char,Bool))

v_a :: B_A Char
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_B -> 0 
  C_D _ -> 1 
