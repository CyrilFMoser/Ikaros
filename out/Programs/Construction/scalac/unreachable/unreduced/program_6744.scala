package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Byte, Byte], T_A[Char, Char]], T_A[T_A[Int, Int], T_A[Byte, Int]]]
case class CC_B(a: T_A[CC_A, Byte], b: T_A[CC_A, CC_A]) extends T_A[T_A[T_A[Byte, Byte], T_A[Char, Char]], T_A[T_A[Int, Int], T_A[Byte, Int]]]
case class CC_C(a: T_A[Boolean, T_A[CC_B, CC_B]], b: CC_B) extends T_A[T_A[T_A[Byte, Byte], T_A[Char, Char]], T_A[T_A[Int, Int], T_A[Byte, Int]]]

val v_a: T_A[T_A[T_A[Byte, Byte], T_A[Char, Char]], T_A[T_A[Int, Int], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, CC_B(_, _)) => 1 
}
}
// This is not matched: CC_B(_, _)