package Program_15 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Char]
case class CC_B[D, E](a: Byte, b: T_A[D, E]) extends T_A[D, Char]
case class CC_C[F]() extends T_A[T_A[F, Char], F]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(0, _) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_B(_, _) => 3 
  case CC_B(0, CC_A()) => 4 
}
}
// This is not matched: (CC_B Int Boolean Byte Wildcard (T_A Int Char))
// This is not matched: (CC_B Int Boolean Byte Wildcard (T_A Int Char))