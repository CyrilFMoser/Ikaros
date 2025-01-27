package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B(a: T_B[CC_A[Int], Boolean], b: CC_A[T_A[Boolean]], c: CC_A[CC_A[Boolean]]) extends T_A[T_A[T_B[Boolean, Char]]]
case class CC_C(a: Char, b: T_B[T_A[CC_B], T_A[CC_B]], c: CC_B) extends T_A[T_A[T_B[Boolean, Char]]]
case class CC_D[E](a: E, b: CC_A[E], c: (T_A[CC_B],Int)) extends T_B[CC_C, E]

val v_a: T_A[T_A[T_B[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_C(_, _, _)) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_, _, CC_B(_, _, _)) => 3 
}
}
// This is not matched: CC_A(CC_B(_, _, _))