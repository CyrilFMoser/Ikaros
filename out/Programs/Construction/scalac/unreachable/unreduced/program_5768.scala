package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, T_B[T_B[Byte]]]
case class CC_B(a: CC_A[Char]) extends T_B[T_A[Byte, (Char,Boolean)]]
case class CC_C(a: CC_A[Boolean]) extends T_B[T_A[Byte, (Char,Boolean)]]

val v_a: T_B[T_A[Byte, (Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_C(_) => 1 
}
}