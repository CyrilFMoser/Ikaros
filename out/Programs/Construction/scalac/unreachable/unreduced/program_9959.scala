package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_A[T_A[Byte, Byte], T_B[Byte, Int]], T_B[T_A[Char, Int], T_B[Char, Char]]]
case class CC_B(a: T_B[Char, Char]) extends T_A[T_A[T_A[Byte, Byte], T_B[Byte, Int]], T_B[T_A[Char, Int], T_B[Char, Char]]]
case class CC_C() extends T_B[CC_B, (CC_A,T_A[CC_A, CC_B])]

val v_a: T_A[T_A[T_A[Byte, Byte], T_B[Byte, Int]], T_B[T_A[Char, Int], T_B[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}