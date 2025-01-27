package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Boolean]], b: T_A[T_A[(Int,Boolean)]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: Int) extends T_A[T_A[T_A[Int]]]
case class CC_C[C, D]() extends T_B[C]
case class CC_D[E](a: (T_A[(Char,Boolean)],CC_B), b: CC_A, c: Char) extends T_B[E]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(12) => 1 
  case CC_B(_) => 2 
}
}