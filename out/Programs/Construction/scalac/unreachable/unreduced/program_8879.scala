package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Int]]) extends T_A[T_B[T_A[Char]]]
case class CC_B() extends T_A[T_B[T_A[Char]]]
case class CC_C[C, D](a: D, b: CC_B) extends T_B[C]
case class CC_D[E](a: T_B[E], b: Byte, c: CC_C[E, E]) extends T_B[E]

val v_a: T_A[T_B[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _)) => 0 
  case CC_A(CC_D(CC_C(_, _), _, CC_C(_, _))) => 1 
  case CC_A(CC_D(CC_D(_, _, _), _, CC_C(_, _))) => 2 
  case CC_B() => 3 
}
}