module Program_31 () where 

 main = print $ show v_b
data B_B a b = C_C (B_C b) (B_C a) | C_D | C_E (B_C b) (B_B a a)
data B_C c = C_F ((B_A,Int)) | C_G (B_C c) B_A | C_H c | C_I ((B_A,B_A)) | C_J Char B_A
data B_A = C_A ((B_A,B_A)) (B_B B_A B_A) | C_B Int

v_a :: B_C Bool
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_F _ -> 0 
  C_H _ -> 1 
  C_I ((C_A _ _,C_A _ _)) -> 2 
  C_I ((C_A _ _,C_B _)) -> 3 
  C_I ((C_B _,C_A _ _)) -> 4 
  C_I ((C_B _,C_B _)) -> 5 
  C_J _ _ -> 6 
