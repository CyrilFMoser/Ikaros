package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_A[Byte, T_A[Char, T_B]], (T_A[T_B, T_B],T_A[T_B, T_B])]
case class CC_B(a: (CC_A,Boolean), b: Byte, c: T_A[CC_A, T_A[CC_A, CC_A]]) extends T_A[T_A[Byte, T_A[Char, T_B]], (T_A[T_B, T_B],T_A[T_B, T_B])]
case class CC_C(a: T_A[T_B, T_B]) extends T_A[T_A[Byte, T_A[Char, T_B]], (T_A[T_B, T_B],T_A[T_B, T_B])]
case class CC_D(a: T_B, b: CC_A) extends T_B

val v_a: T_A[T_A[Byte, T_A[Char, T_B]], (T_A[T_B, T_B],T_A[T_B, T_B])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}