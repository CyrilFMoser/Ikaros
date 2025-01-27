package Program_15 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E]() extends T_A[D, C]
case class CC_B[F]() extends T_A[T_A[Boolean, Boolean], F]
case class CC_C() extends T_A[T_A[Boolean, Boolean], CC_A[Byte, Int, Byte]]

val v_a: T_A[Char, CC_C] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Char
//      (CC_C (T_A Boolean Boolean))
//      Boolean
//      (T_A Char (CC_C (T_A Boolean Boolean))))
// This is not matched: (CC_C Int Wildcard Wildcard (CC_A Int (T_A Int)) (T_A Int))