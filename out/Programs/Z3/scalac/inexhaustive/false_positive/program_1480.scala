package Program_31 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: (T_A,T_A), b: B, c: B) extends T_A
case class CC_B() extends T_B[T_B[T_A]]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, _) => 0 
}
}
// This is not matched: (CC_A Boolean
//      (Tuple (CC_A Boolean Wildcard Boolean Boolean T_A) Wildcard)
//      Wildcard
//      Wildcard
//      T_A)
// This is not matched: (CC_B Int (CC_B Int Wildcard Wildcard (T_A Int)) (CC_A Int (T_A Int)) (T_A Int))