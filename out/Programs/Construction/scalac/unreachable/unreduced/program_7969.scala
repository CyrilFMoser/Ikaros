package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Byte], T_A[Int, Char]]) extends T_A[T_A[(Boolean,Boolean), Int], T_A[T_A[Byte, Char], T_A[Byte, Boolean]]]
case class CC_B(a: Byte, b: CC_A) extends T_A[T_A[(Boolean,Boolean), Int], T_A[T_A[Byte, Char], T_A[Byte, Boolean]]]
case class CC_C() extends T_A[T_A[(Boolean,Boolean), Int], T_A[T_A[Byte, Char], T_A[Byte, Boolean]]]

val v_a: T_A[T_A[(Boolean,Boolean), Int], T_A[T_A[Byte, Char], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
  case CC_C() => 2 
}
}