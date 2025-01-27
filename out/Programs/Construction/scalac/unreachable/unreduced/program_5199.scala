package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Char, Int]]) extends T_A[T_B[T_A[Int], T_A[Int]]]
case class CC_B() extends T_A[T_B[T_A[Int], T_A[Int]]]
case class CC_C[E, D](a: Char) extends T_B[D, E]

val v_a: T_A[T_B[T_A[Int], T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}