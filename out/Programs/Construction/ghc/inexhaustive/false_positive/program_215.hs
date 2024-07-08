module Program_3 () where 

 main = print $ show v_b
data B_A a = C_A
data B_B = C_B | C_C B_B
data B_C b c = C_D b Char | C_E Bool (B_A c) | C_F | C_G ((B_B,B_B)) | C_H (B_C c c) (B_A Int)

v_a :: B_C B_B Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_D C_B _ -> 0 
  C_D (C_C _) _ -> 1 
  C_E _ (C_A) -> 2 
  C_F -> 3 
  C_G ((C_B,C_B)) -> 4 
  C_G ((C_B,C_C _)) -> 5 
  C_G ((C_C _,C_B)) -> 6 
  C_G ((C_C _,C_C _)) -> 7 
