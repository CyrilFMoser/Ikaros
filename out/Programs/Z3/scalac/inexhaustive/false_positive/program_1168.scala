package Program_31 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E, F]() extends T_A[E]
case class CC_C[G](a: G, b: T_A[G], c: CC_A[G]) extends T_A[G]
case class CC_D[H]() extends T_B[H, Int]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, CC_B(), CC_A()) => 2 
  case CC_C(_, CC_B(), _) => 3 
  case CC_C(_, _, _) => 4 
  case CC_C(0, CC_A(), _) => 5 
  case CC_C(_, _, CC_A()) => 6 
  case CC_C(_, CC_A(), _) => 7 
  case CC_C(0, _, _) => 8 
  case CC_C(_, CC_C(_, _, _), _) => 9 
  case CC_C(0, CC_B(), CC_A()) => 10 
  case CC_C(0, CC_A(), CC_A()) => 11 
  case CC_C(_, CC_C(_, _, _), CC_A()) => 12 
}
}
// This is not matched: (CC_B Byte (T_B Boolean Boolean) (T_A Byte))
// This is not matched: (CC_B Byte (T_B Boolean Boolean) (T_A Byte))