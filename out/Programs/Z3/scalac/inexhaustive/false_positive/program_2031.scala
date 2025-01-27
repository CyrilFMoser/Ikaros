package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char, b: (Int,Char)) extends T_A[T_A[Int]]
case class CC_B[C]() extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, (_,_)) => 1 
  case CC_A(_, (12,_)) => 2 
  case CC_A('x', (_,_)) => 3 
}
}
// This is not matched: (CC_B Boolean (T_A (T_A Int)))
// This is not matched: (CC_D Char Wildcard (T_B Char))