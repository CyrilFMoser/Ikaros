module Program_24 () where 

 main = print $ show v_b
data B_B b c = C_C Bool b | C_D ((Char,Bool)) (B_D c b)
data B_C d = C_E (B_D d d) | C_F d | C_G d
data B_D e f = C_H | C_I e (B_C e) | C_J | C_K Int f
data B_A a = C_A (B_C a) Char | C_B (B_B a a) (B_B a Int)

v_a :: B_C Int
v_a = undefined
v_b :: Int
v_b = case v_a of 
  C_E _ -> 0 
  C_F _ -> 1 
