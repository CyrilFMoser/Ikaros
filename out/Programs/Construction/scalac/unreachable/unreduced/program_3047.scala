package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[Char], D]
case class CC_B[E](a: T_B[E], b: T_A[E, E]) extends T_A[T_B[Char], E]
case class CC_C(a: T_B[CC_A[Char]]) extends T_A[T_B[Char], T_A[T_B[Char], CC_A[Int]]]
case class CC_D(a: CC_A[CC_C], b: T_B[T_B[CC_C]]) extends T_B[T_A[T_B[Char], T_B[CC_C]]]

val v_a: T_A[T_B[Char], T_A[T_B[Char], CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}