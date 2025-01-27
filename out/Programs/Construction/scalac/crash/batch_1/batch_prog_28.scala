package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[Boolean, C]
case class CC_B(a: Int, b: T_A[CC_A[Char], CC_A[Int]], c: Boolean) extends T_A[Boolean, CC_A[Boolean]]

val v_a: T_A[Boolean, CC_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
}
}
// This is not matched: CC_A(_, _)