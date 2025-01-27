package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F, G]() extends T_A[E, F]
case class CC_B[H, I]() extends T_A[T_A[H, H], H]
case class CC_C[K, J, L](a: (Int,(Boolean,Int)), b: K) extends T_B[J, K]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Int Int Boolean (T_A Int Int))
// This is not matched: (CC_B Int Wildcard (T_A Int))