package Program_31 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B]() extends T_A
case class CC_B(a: Byte, b: T_A, c: T_B[Char]) extends T_A
case class CC_C[C](a: T_B[C], b: T_B[C]) extends T_B[C]
case class CC_D[D](a: T_A, b: CC_A[D], c: CC_B) extends T_B[D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_C(_, _)) => 1 
  case CC_B(0, _, CC_C(_, _)) => 2 
  case CC_B(_, _, _) => 3 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_D (T_B (T_A Char Int)))