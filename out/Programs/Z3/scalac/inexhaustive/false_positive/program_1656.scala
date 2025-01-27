package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: (Boolean,Byte)) extends T_A[D]
case class CC_B[F, G](a: CC_A[G, G], b: CC_A[G, F]) extends T_B[T_B[Boolean, Int], F]
case class CC_C[H, I]() extends T_B[I, H]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((_,0)) => 0 
  case CC_A((_,_)) => 1 
}
}
// This is not matched: (CC_A Int Boolean Wildcard (T_A Int))
// This is not matched: (CC_C Byte Boolean Wildcard Wildcard Wildcard (T_A Boolean Byte))