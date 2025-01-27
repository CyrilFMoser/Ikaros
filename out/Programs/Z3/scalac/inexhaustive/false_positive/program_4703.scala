package Program_15 

package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, (Boolean,Int)]
case class CC_B[F, G](a: CC_A[G]) extends T_A[F, (Boolean,Int)]
case class CC_C[I, H]() extends T_B[I, H]

val v_a: T_A[Boolean, (Boolean,Int)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_B(CC_A()) => 2 
}
}
// This is not matched: (CC_B Boolean Boolean Wildcard (T_A Boolean (Tuple Boolean Int)))
// This is not matched: (CC_B Boolean Boolean Wildcard (T_A Boolean (Tuple Boolean Int)))