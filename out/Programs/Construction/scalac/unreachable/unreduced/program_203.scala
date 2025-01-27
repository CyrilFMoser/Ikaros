package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Boolean, c: C) extends T_A[C, T_A[T_A[Char, Char], T_A[(Boolean,Boolean), Int]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Char, Char], T_A[(Boolean,Boolean), Int]]]
case class CC_C[E](a: T_A[E, E]) extends T_A[E, T_A[T_A[Char, Char], T_A[(Boolean,Boolean), Int]]]

val v_a: T_A[Boolean, T_A[T_A[Char, Char], T_A[(Boolean,Boolean), Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_)