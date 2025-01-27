package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[Int, C], c: T_A[Int, C]) extends T_A[Int, C]
case class CC_B(a: CC_A[Boolean]) extends T_B
case class CC_C(a: T_B, b: Char) extends T_B
case class CC_D(a: T_B, b: T_A[T_A[Int, Byte], CC_B], c: T_A[((Char,Int),T_B), CC_C]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _, _))