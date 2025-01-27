package Program_30 

package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]
case class CC_B[D]() extends T_A[D]
case class CC_C[E](a: T_A[E], b: CC_B[E], c: (Boolean,(Boolean,Char))) extends T_A[E]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _, _), _, _) => 0 
  case CC_C(CC_B(), CC_B(), _) => 1 
  case CC_C(CC_A(), _, (_,(_,_))) => 2 
}
}
// This is not matched: (CC_C Int (CC_A Int Boolean (T_A Int)) Wildcard Wildcard (T_A Int))
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)