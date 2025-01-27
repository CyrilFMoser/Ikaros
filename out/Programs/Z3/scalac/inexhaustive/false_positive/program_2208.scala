package Program_31 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[E, E]]
case class CC_B[G, F, H](a: T_B[G, G], b: CC_A[F], c: T_B[H, G]) extends T_B[F, G]
case class CC_C[J, I]() extends T_B[J, I]
case class CC_D[K](a: Boolean) extends T_B[(Byte,Boolean), K]

val v_a: T_B[(Byte,Boolean), Byte] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_) => 1 
  case CC_B(_, CC_A(), CC_C()) => 2 
  case CC_B(CC_C(), CC_A(), CC_D(_)) => 3 
  case CC_B(CC_B(_, _, _), _, _) => 4 
  case CC_B(CC_B(_, _, _), CC_A(), CC_B(_, _, _)) => 5 
  case CC_B(_, _, CC_B(_, _, _)) => 6 
  case CC_B(CC_C(), CC_A(), CC_B(_, _, _)) => 7 
  case CC_B(_, _, CC_C()) => 8 
  case CC_B(_, _, _) => 9 
  case CC_B(_, _, CC_D(_)) => 10 
  case CC_B(CC_C(), _, CC_B(_, _, _)) => 11 
  case CC_B(_, CC_A(), _) => 12 
  case CC_B(CC_B(_, _, _), CC_A(), CC_C()) => 13 
}
}
// This is not matched: (CC_B Byte
//      (Tuple Byte Boolean)
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B (Tuple Byte Boolean) Byte))
// This is not matched: Pattern match is empty without constants