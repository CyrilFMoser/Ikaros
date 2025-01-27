package Program_14 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B]() extends T_A
case class CC_B(a: CC_A[T_A], b: CC_A[T_A], c: CC_A[(Char,Int)]) extends T_A
case class CC_C[C]() extends T_B[C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A(), _) => 1 
  case CC_B(_, CC_A(), CC_A()) => 2 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_B Byte Boolean Wildcard (T_A Byte (Tuple Boolean Boolean)))