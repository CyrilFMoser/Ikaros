module Program_14 () where 

 main = print $ show v_b
data B_A a = C_A B_C a | C_B
data B_C = C_F B_C ((B_C,B_C)) | C_G | C_H
data B_B b c = C_C (B_B b c) | C_D ((B_C,Bool)) | C_E (B_A b) Bool

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ _ -> 0 
  C_H -> 1 
