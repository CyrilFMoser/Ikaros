package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_A[T_A[Char, Int], T_A[Boolean, Boolean]], D]
case class CC_B(a: Byte, b: Int) extends T_A[T_A[T_A[Char, Int], T_A[Boolean, Boolean]], CC_A[Byte]]
case class CC_C(a: T_B[CC_A[CC_B]], b: CC_A[T_B[CC_B]], c: T_A[CC_A[Char], CC_B]) extends T_B[CC_A[CC_B]]
case class CC_D() extends T_B[CC_A[CC_B]]

val v_a: T_B[CC_A[CC_B]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D() => 1 
}
}