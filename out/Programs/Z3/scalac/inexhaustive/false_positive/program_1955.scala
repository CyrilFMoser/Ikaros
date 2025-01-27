package Program_29 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, T_B[E, (Int,Boolean)]]
case class CC_B[G](a: (Boolean,Boolean)) extends T_A[G, T_B[G, (Int,Boolean)]]
case class CC_C[H](a: T_B[H, (Char,Byte)], b: CC_A[H, H], c: CC_A[H, H]) extends T_B[Byte, H]
case class CC_D[J, I](a: CC_A[J, J]) extends T_B[J, I]

val v_a: T_A[Boolean, T_B[Boolean, (Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: (CC_A Boolean Boolean (T_A Boolean (T_B Boolean (Tuple Int Boolean))))
// This is not matched: (CC_B Int (T_A Int Byte))