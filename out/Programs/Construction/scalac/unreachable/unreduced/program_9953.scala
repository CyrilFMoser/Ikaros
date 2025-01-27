package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_B[T_B[CC_A]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C[C](a: T_B[C]) extends T_B[C]
case class CC_D[D](a: T_A[D], b: CC_C[D]) extends T_B[D]
case class CC_E[E](a: T_B[E]) extends T_B[E]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_C(CC_C(_))) => 1 
  case CC_B(CC_C(CC_D(_, _))) => 2 
  case CC_B(CC_C(CC_E(_))) => 3 
  case CC_B(CC_D(_, CC_C(_))) => 4 
  case CC_B(CC_E(CC_C(_))) => 5 
  case CC_B(CC_E(CC_D(_, _))) => 6 
  case CC_B(CC_E(CC_E(_))) => 7 
}
}