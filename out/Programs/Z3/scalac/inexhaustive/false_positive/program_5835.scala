package Program_15 

package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E]() extends T_A[C, D]
case class CC_B[F, G](a: T_A[G, F], b: T_A[F, F], c: T_A[F, F]) extends T_A[F, G]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_B(_, _, _), CC_A(), CC_B(_, _, _)) => 1 
  case CC_B(CC_A(), CC_B(_, _, _), CC_B(_, _, _)) => 2 
  case CC_B(CC_A(), CC_B(_, _, _), _) => 3 
  case CC_B(_, CC_B(_, _, _), _) => 4 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), CC_A()) => 5 
  case CC_B(CC_A(), CC_A(), CC_B(_, _, _)) => 6 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), CC_B(_, _, _)) => 7 
  case CC_B(CC_B(_, _, _), CC_A(), _) => 8 
  case CC_B(CC_A(), _, _) => 9 
  case CC_B(_, CC_A(), CC_A()) => 10 
  case CC_B(CC_A(), CC_A(), CC_A()) => 11 
  case CC_B(_, CC_B(_, _, _), CC_A()) => 12 
  case CC_B(_, CC_B(_, _, _), CC_B(_, _, _)) => 13 
  case CC_B(CC_A(), _, CC_B(_, _, _)) => 14 
  case CC_B(_, _, CC_A()) => 15 
}
}
// This is not matched: (CC_A Int Byte Boolean (T_A Byte Int))
// This is not matched: Pattern match is empty without constants