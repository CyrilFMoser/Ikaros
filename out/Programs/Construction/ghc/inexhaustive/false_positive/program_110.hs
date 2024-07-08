module Program_21 () where 

 main = print $ show v_b
data B_C = C_G (B_A ((Int,Int)) B_C) (B_A B_C B_C) | C_H | C_I ((B_C,B_C)) | C_J
data B_A a b = C_A | C_B b B_C | C_C | C_D
data B_B c d = C_E (B_B d d) Char | C_F c ((Int,(Bool,Bool)))
data B_D e f = C_K (B_D e e) | C_L (B_D f f) Int | C_M

v_a :: B_C
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_G _ _ -> 0 
  C_H -> 1 
  C_I ((C_G _ _,C_G _ _)) -> 2 
  C_I ((C_G _ _,C_H)) -> 3 
  C_I ((C_G _ _,C_I _)) -> 4 
  C_I ((C_G _ _,C_J)) -> 5 
  C_I ((C_H,C_G _ _)) -> 6 
  C_I ((C_H,C_H)) -> 7 
  C_I ((C_H,C_I _)) -> 8 
  C_I ((C_H,C_J)) -> 9 
  C_I ((C_I _,C_G _ _)) -> 10 
  C_I ((C_I _,C_H)) -> 11 
  C_I ((C_I _,C_I _)) -> 12 
  C_I ((C_J,C_G _ _)) -> 13 
  C_I ((C_J,C_H)) -> 14 
  C_I ((C_J,C_I _)) -> 15 
  C_I ((C_J,C_J)) -> 16 
  C_J -> 17 
