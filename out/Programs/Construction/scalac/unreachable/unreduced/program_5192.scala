package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Byte]], b: T_A[T_A[Int]]) extends T_A[T_B[T_B[Boolean]]]
case class CC_B(a: T_B[T_B[(Byte,Int)]]) extends T_A[T_B[T_B[Boolean]]]
case class CC_C[C]() extends T_B[C]
case class CC_D[D]() extends T_B[D]
case class CC_E[E](a: E, b: T_B[E], c: CC_A) extends T_B[E]

val v_a: T_A[T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}