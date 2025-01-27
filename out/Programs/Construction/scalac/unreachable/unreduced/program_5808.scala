package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Byte, Boolean], Char], T_A[T_A[Int, Byte], Char]]
case class CC_B(a: Boolean, b: Boolean, c: T_A[Boolean, T_A[CC_A, CC_A]]) extends T_A[T_A[T_A[Byte, Boolean], Char], T_A[T_A[Int, Byte], Char]]
case class CC_C(a: CC_B, b: Boolean) extends T_A[T_A[T_A[Byte, Boolean], Char], T_A[T_A[Int, Byte], Char]]

val v_a: T_A[T_A[T_A[Byte, Boolean], Char], T_A[T_A[Int, Byte], Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_B(_, _, _), _) => 1 
}
}
// This is not matched: CC_B(_, _, _)