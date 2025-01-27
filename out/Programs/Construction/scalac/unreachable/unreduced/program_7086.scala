package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, (Byte,T_A[Boolean, Int])]
case class CC_B[D](a: D, b: CC_A[D]) extends T_A[D, (Byte,T_A[Boolean, Int])]

val v_a: T_A[Int, (Byte,T_A[Boolean, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(12, _) => 1 
  case CC_B(_, _) => 2 
}
}