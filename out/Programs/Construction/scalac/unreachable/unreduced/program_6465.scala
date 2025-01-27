package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Char, b: T_B, c: T_B) extends T_A[T_B, T_A[T_A[T_B, T_B], Char]]
case class CC_B(a: (T_A[T_B, T_B],T_B), b: CC_A, c: CC_A) extends T_A[T_B, T_A[T_A[T_B, T_B], Char]]
case class CC_C(a: (Byte,T_A[T_B, Int]), b: T_A[CC_B, T_B], c: T_B) extends T_A[T_B, T_A[T_A[T_B, T_B], Char]]
case class CC_D(a: T_B) extends T_B
case class CC_E(a: Byte, b: T_A[CC_B, CC_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_)) => 0 
  case CC_D(CC_E(_, _)) => 1 
  case CC_E(_, _) => 2 
}
}