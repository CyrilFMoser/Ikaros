package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Boolean, c: C) extends T_A[C, Boolean]
case class CC_B(a: Char, b: Int, c: CC_A[CC_A[Boolean]]) extends T_A[CC_A[T_A[Char, Boolean]], Boolean]
case class CC_C[D](a: CC_B, b: T_A[D, Boolean]) extends T_A[D, Boolean]

val v_a: CC_C[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _), CC_A(_, _, _)) => 0 
  case CC_C(CC_B(_, _, _), CC_C(CC_B(_, _, _), _)) => 1 
}
}