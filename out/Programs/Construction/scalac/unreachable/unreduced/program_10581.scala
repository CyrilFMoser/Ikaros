package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[Boolean, ((Int,Char),T_B)], C]
case class CC_B[D](a: CC_A[T_A[D, D]]) extends T_A[T_A[Boolean, ((Int,Char),T_B)], D]
case class CC_C(a: Char) extends T_B
case class CC_D() extends T_B
case class CC_E[E](a: (Byte,T_A[Int, CC_D])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_E((_,_)) => 1 
}
}
// This is not matched: CC_D()