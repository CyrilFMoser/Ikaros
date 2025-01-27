package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[Int, T_A[T_A[Boolean, Char], T_A[Byte, Int]]]
case class CC_B(a: T_A[Int, CC_A], b: Byte) extends T_A[Int, T_A[T_A[Boolean, Char], T_A[Byte, Int]]]
case class CC_C(a: Char, b: CC_A, c: T_A[CC_A, Boolean]) extends T_A[Int, T_A[T_A[Boolean, Char], T_A[Byte, Int]]]

val v_a: T_A[Int, T_A[T_A[Boolean, Char], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_, _, _)