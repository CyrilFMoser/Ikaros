package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B[D](a: T_A[T_B, D], b: T_A[D, CC_A[D]], c: Boolean) extends T_A[T_B, D]
case class CC_C(a: T_A[T_B, T_A[T_B, Byte]], b: T_A[CC_B[T_B], Char]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), _) => 0 
  case CC_C(CC_B(_, _, _), _) => 1 
  case CC_D() => 2 
}
}