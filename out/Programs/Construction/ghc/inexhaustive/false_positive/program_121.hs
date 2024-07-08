module Program_31 () where 

 main = print $ show v_b
data B_B = C_F B_B B_A
data B_A = C_A Int | C_B | C_C ((B_B,B_B)) | C_D Bool B_B | C_E B_B

v_a :: B_A
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_A _ -> 0 
  C_B -> 1 
  C_C ((C_F _ _,C_F _ _)) -> 2 
  C_D _ (C_F _ (C_A _)) -> 3 
  C_D _ (C_F _ C_B) -> 4 
  C_D _ (C_F _ (C_C _)) -> 5 
  C_D _ (C_F _ (C_E _)) -> 6 
  C_E (C_F (C_F _ _) (C_A _)) -> 7 
  C_E (C_F (C_F _ _) C_B) -> 8 
  C_E (C_F (C_F _ _) (C_C _)) -> 9 
  C_E (C_F (C_F _ _) (C_D _ _)) -> 10 
  C_E (C_F (C_F _ _) (C_E _)) -> 11 
