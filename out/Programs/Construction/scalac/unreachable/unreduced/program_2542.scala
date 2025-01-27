package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Boolean, Int], T_A[Char, Boolean]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Boolean, Int], T_A[Char, Boolean]]]
case class CC_C[E](a: CC_A[E], b: CC_A[E], c: T_A[E, E]) extends T_A[E, T_A[T_A[Boolean, Int], T_A[Char, Boolean]]]

val v_a: T_A[Int, T_A[T_A[Boolean, Int], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}