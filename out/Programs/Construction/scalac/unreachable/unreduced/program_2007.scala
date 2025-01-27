package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: Boolean, c: T_B) extends T_A[Boolean, C]
case class CC_B[D](a: T_B, b: T_B, c: T_A[D, D]) extends T_A[Boolean, D]
case class CC_C(a: T_A[Boolean, (T_B,T_B)], b: T_A[CC_A[Boolean], Byte], c: T_B) extends T_A[Boolean, T_B]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}