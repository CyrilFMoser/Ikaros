package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: (Boolean,Int), b: T_A[Byte], c: T_A[Byte]) extends T_A[Byte]
case class CC_C[D]() extends T_B[D]
case class CC_D[E, F](a: CC_C[E], b: T_B[(Boolean,Char)], c: CC_C[E]) extends T_B[E]
case class CC_E[G](a: (CC_B,Char), b: CC_C[G]) extends T_B[G]

val v_a: T_B[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_E((CC_B(_, _, _),_), _) => 1 
  case CC_D(_, _, CC_C()) => 2 
  case CC_D(CC_C(), CC_D(_, _, _), CC_C()) => 3 
  case CC_D(CC_C(), CC_C(), CC_C()) => 4 
  case CC_D(_, _, _) => 5 
  case CC_D(_, CC_C(), CC_C()) => 6 
}
}
// This is not matched: (CC_D (T_A Byte) Boolean Wildcard Wildcard Wildcard (T_B (T_A Byte)))
// This is not matched: (CC_E (T_A Byte) Wildcard Wildcard (T_B (T_A Byte)))