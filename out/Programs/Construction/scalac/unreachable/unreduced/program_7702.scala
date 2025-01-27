package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_A, b: (T_A,T_B[T_A, T_A]), c: T_A) extends T_A
case class CC_B(a: CC_A[CC_A[T_A]], b: CC_A[T_A]) extends T_A
case class CC_C(a: T_B[Byte, CC_B]) extends T_A
case class CC_D[D](a: T_B[D, CC_B]) extends T_B[D, CC_B]
case class CC_E[E](a: Byte, b: T_B[E, E]) extends T_B[E, CC_B]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_D(CC_D(_))) => 0 
  case CC_C(CC_D(CC_E(_, _))) => 1 
  case CC_C(CC_E(_, _)) => 2 
}
}