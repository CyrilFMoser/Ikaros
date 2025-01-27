package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C], b: C) extends T_A[T_B, C]
case class CC_B[D](a: T_A[T_B, D], b: T_A[T_B, T_A[T_B, T_A[T_B, T_B]]]) extends T_A[T_B, D]
case class CC_C() extends T_B
case class CC_D(a: T_A[CC_B[CC_C], T_B], b: T_A[T_B, CC_B[T_B]]) extends T_B
case class CC_E(a: T_A[CC_D, Byte]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_A(_, _)) => 1 
  case CC_D(_, CC_B(_, _)) => 2 
  case CC_E(_) => 3 
}
}