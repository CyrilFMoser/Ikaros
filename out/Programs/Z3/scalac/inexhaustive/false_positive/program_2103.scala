package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (Int,Int)) extends T_A[T_A[Boolean]]
case class CC_B(a: CC_A[Char]) extends T_A[T_A[Boolean]]
case class CC_C[D](a: CC_B, b: T_A[D], c: CC_A[D]) extends T_B[D]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_A((_,12)) => 1 
  case CC_A(_) => 2 
  case CC_A((12,_)) => 3 
  case CC_B(_) => 4 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A Boolean)))
// This is not matched: (CC_B Boolean Boolean Wildcard (T_A Boolean Boolean))