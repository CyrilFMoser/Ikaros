package Program_13 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D], b: (Int,(Int,Char))) extends T_A[T_A[Int, Boolean], C]

val v_a: T_A[T_A[Int, Boolean], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), (12,(_,_))) => 0 
  case CC_A(CC_A(_, _), _) => 1 
}
}
// This is not matched: (CC_A Int Boolean Wildcard Wildcard (T_A (T_A Int Boolean) Int))
// This is not matched: (CC_B (CC_C Boolean Boolean) Wildcard (T_A (CC_C Boolean Boolean)))