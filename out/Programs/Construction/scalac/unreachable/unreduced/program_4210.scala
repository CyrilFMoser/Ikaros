package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, T_A[C, C]], c: T_B) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C(a: T_A[T_B, T_A[T_B, (Int,Char)]]) extends T_A[T_A[T_B, CC_A[T_B]], T_A[T_B, T_B]]
case class CC_D(a: CC_B[CC_B[T_B]]) extends T_B
case class CC_E(a: Byte, b: Boolean, c: CC_B[T_B]) extends T_B

val v_a: T_A[T_B, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_D(CC_B())) => 0 
  case CC_A(_, _, CC_E(_, _, _)) => 1 
  case CC_B() => 2 
}
}