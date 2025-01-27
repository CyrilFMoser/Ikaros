package Program_31 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[Char, Byte]]
case class CC_B[D](a: D, b: CC_A) extends T_A[T_B[Char, Byte]]
case class CC_C(a: CC_A, b: (CC_A,CC_A)) extends T_A[T_B[Char, Byte]]
case class CC_D[F, E](a: E, b: (CC_C,CC_C)) extends T_B[E, F]

val v_a: T_A[T_B[Char, Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: (CC_B Boolean Wildcard Wildcard (T_A (T_B Char Byte)))
// This is not matched: (CC_A (CC_B Wildcard Wildcard (Tuple Wildcard Wildcard) T_A) Wildcard T_A)