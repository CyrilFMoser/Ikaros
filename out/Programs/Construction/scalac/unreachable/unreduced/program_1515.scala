package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B(a: T_A[Boolean]) extends T_A[Boolean]
case class CC_C(a: CC_A[CC_B], b: T_B[T_A[CC_B], CC_A[CC_B]], c: Boolean) extends T_A[Boolean]
case class CC_D[E](a: T_B[E, E], b: (Char,CC_C)) extends T_B[(T_B[CC_C, CC_B],CC_C), E]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_B(CC_C(_, _, _)) => 2 
  case CC_C(_, _, _) => 3 
}
}
// This is not matched: CC_B(CC_B(_))