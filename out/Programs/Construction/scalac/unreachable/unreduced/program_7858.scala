package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_B, T_B]) extends T_A[T_B, T_B]
case class CC_B(a: Byte, b: CC_A, c: T_A[T_A[CC_A, Int], T_A[T_B, T_B]]) extends T_A[T_B, T_B]
case class CC_C(a: Int, b: T_B, c: CC_A) extends T_B
case class CC_D[C]() extends T_B
case class CC_E(a: (Char,T_A[T_B, Byte])) extends T_B

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B(_, CC_A(_), _)) => 2 
  case CC_B(_, _, _) => 3 
}
}