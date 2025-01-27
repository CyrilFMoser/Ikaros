package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[T_B[T_B[Int]]]
case class CC_B() extends T_A[T_B[T_B[Int]]]
case class CC_C(a: Boolean, b: T_B[CC_A], c: CC_A) extends T_A[T_B[T_B[Int]]]
case class CC_D[C, D]() extends T_B[C]
case class CC_E[E](a: Byte) extends T_B[E]

val v_a: T_A[T_B[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(true, _, CC_A(_)) => 2 
  case CC_C(false, _, CC_A(_)) => 3 
}
}