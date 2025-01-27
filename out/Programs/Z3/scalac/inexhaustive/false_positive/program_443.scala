package Program_31 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Byte, b: T_B) extends T_A[T_A[Char, T_B], C]
case class CC_B[D, E](a: T_B, b: (Int,T_B), c: D) extends T_A[D, E]
case class CC_C[F]() extends T_B

val v_a: CC_B[Boolean, T_B] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(), _, _) => 0 
  case CC_B(_, (_,CC_C()), _) => 1 
  case CC_B(CC_C(), (12,CC_C()), _) => 2 
}
}
// This is not matched: (CC_B Boolean
//      T_B
//      (CC_C T_B T_B)
//      (Tuple Int (CC_C T_B T_B))
//      Wildcard
//      (T_A Boolean T_B))
// This is not matched: (CC_A Int Boolean Wildcard (T_A Int Boolean))