package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_A[Byte, Byte], Byte], b: T_A[T_A[Byte, Boolean], T_A[Int, Byte]]) extends T_A[T_A[Byte, Byte], Byte]
case class CC_C(a: T_A[T_A[Byte, Byte], Byte], b: T_A[T_A[T_A[Char, CC_B], T_A[Char, CC_B]], T_A[Char, CC_B]]) extends T_A[T_A[T_A[CC_B, CC_A[CC_B]], T_A[CC_B, CC_A[CC_B]]], T_A[CC_B, CC_A[CC_B]]]

val v_a: T_A[T_A[T_A[CC_B, CC_A[CC_B]], T_A[CC_B, CC_A[CC_B]]], T_A[CC_B, CC_A[CC_B]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_A(), CC_A()) => 1 
  case CC_C(CC_B(_, _), CC_A()) => 2 
}
}