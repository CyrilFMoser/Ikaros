package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[Boolean, T_A[Char, Boolean]], b: T_A[T_A[Int, Byte], T_B[Char, Byte]]) extends T_A[Boolean, T_B[Int, (Byte,(Int,Char))]]
case class CC_B(a: (T_A[CC_A, CC_A],Char), b: CC_A) extends T_A[Boolean, T_B[Int, (Byte,(Int,Char))]]
case class CC_C(a: T_B[CC_A, (CC_B,CC_B)], b: CC_B) extends T_A[Boolean, T_B[Int, (Byte,(Int,Char))]]

val v_a: T_A[Boolean, T_B[Int, (Byte,(Int,Char))]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}