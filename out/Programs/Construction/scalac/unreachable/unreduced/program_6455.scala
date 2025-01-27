package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_B[T_A[Byte, Int], T_A[Char, Int]], T_B[T_A[Byte, Byte], Boolean]]
case class CC_B(a: T_B[T_A[CC_A, Int], Char], b: T_A[CC_A, CC_A]) extends T_A[T_B[T_A[Byte, Int], T_A[Char, Int]], T_B[T_A[Byte, Byte], Boolean]]
case class CC_C(a: T_B[(CC_B,CC_B), CC_A]) extends T_A[T_B[T_A[Byte, Int], T_A[Char, Int]], T_B[T_A[Byte, Byte], Boolean]]

val v_a: T_A[T_B[T_A[Byte, Int], T_A[Char, Int]], T_B[T_A[Byte, Byte], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_)