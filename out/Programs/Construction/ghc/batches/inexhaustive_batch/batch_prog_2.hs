module Program_2 () where 

main = print $ show v_b
data B_A a = C_A Bool | C_B (B_A a) a | C_C (B_A (B_A B_B)) (B_A a) ((B_A B_B,Char))
data B_B = C_D ((B_A B_B,B_A B_B)) | C_E Bool (B_A Char) B_B | C_F Char

v_a :: B_B
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D _ -> 0 
  C_F _ -> 1 

--  This is not matched: C_E _ _ _