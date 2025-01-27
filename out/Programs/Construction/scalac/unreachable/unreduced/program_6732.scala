package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Boolean,Boolean), Byte]) extends T_A[Byte, T_A[T_A[Int, Int], T_A[Byte, Boolean]]]
case class CC_B() extends T_A[Byte, T_A[T_A[Int, Int], T_A[Byte, Boolean]]]
case class CC_C(a: Char, b: CC_B) extends T_A[Byte, T_A[T_A[Int, Int], T_A[Byte, Boolean]]]

val v_a: T_A[Byte, T_A[T_A[Int, Int], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, CC_B()) => 1 
}
}
// This is not matched: CC_B()