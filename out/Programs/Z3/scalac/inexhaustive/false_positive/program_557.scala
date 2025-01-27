package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_A[D], b: T_A[D]) extends T_A[T_A[Byte]]
case class CC_C[E, F](a: CC_B[E]) extends T_B[E]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_B(CC_B(_, _), CC_A()) => 2 
  case CC_B(_, CC_B(_, _)) => 3 
  case CC_B(CC_A(), CC_B(_, _)) => 4 
  case CC_B(CC_A(), CC_A()) => 5 
}
}
// This is not matched: (CC_B Boolean Wildcard (CC_A Boolean (T_A Boolean)) (T_A (T_A Byte)))
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)