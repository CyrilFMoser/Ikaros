package Program_15 

package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C]() extends T_A[Int]
case class CC_C(a: CC_B[Char]) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: (CC_B Boolean (T_A Int))
// This is not matched: (CC_A (Tuple (CC_E (CC_B Wildcard (CC_A Wildcard T_A) T_A) Wildcard T_B)
//             (CC_D Wildcard Wildcard T_B))
//      T_A)