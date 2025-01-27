package Program_31 

package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E]() extends T_A[D, C]
case class CC_B[F](a: (Byte,Byte)) extends T_A[T_A[Char, Byte], F]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Char Int Boolean (T_A Int Char))
// This is not matched: (CC_D (Tuple (CC_B (CC_A T_A T_A) Wildcard (CC_A T_A T_A) T_A)
//             (CC_B (CC_A T_A T_A) Byte (CC_A (T_B T_A) T_A) T_A))
//      Wildcard
//      Wildcard
//      (T_B (T_B T_A)))