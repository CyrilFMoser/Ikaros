package Program_30 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[T_A[Int]]
case class CC_B[C](a: (Byte,Boolean)) extends T_A[C]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_B((0,_)) => 1 
  case CC_A(_) => 2 
}
}
// This is not matched: (CC_A Boolean (CC_B Boolean Wildcard (T_A Boolean)) (T_A (T_A Int)))
// This is not matched: (CC_E Int Wildcard (T_B Int))