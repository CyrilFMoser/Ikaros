package Program_31 

package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[T_A[(Int,Int)]]
case class CC_B() extends T_A[T_A[(Int,Int)]]

val v_a: T_A[T_A[(Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A (Tuple Int Int))))
// This is not matched: (CC_C T_A (CC_B Boolean Wildcard (CC_A Wildcard T_A) T_A) T_A)