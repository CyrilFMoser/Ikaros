package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_A[Byte, Byte], Byte], b: T_A[Int, CC_A[Int]]) extends T_A[T_A[Byte, Byte], Byte]
case class CC_C[D]() extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_B(CC_A(), _), _) => 1 
  case CC_B(CC_B(CC_B(_, _), _), _) => 2 
  case CC_B(CC_B(CC_C(), _), _) => 3 
  case CC_B(CC_C(), _) => 4 
  case CC_C() => 5 
}
}
// This is not matched: CC_B(CC_A(), _)