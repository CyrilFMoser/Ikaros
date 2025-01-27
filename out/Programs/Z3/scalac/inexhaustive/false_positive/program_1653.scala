package Program_31 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E, F](a: Boolean) extends T_A[E, D]
case class CC_B[G](a: CC_A[G, G, G], b: Boolean, c: (Int,Char)) extends T_B[G]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Int Int Boolean Wildcard (T_A Int Int))
// This is not matched: (CC_A Int Wildcard (T_A Int))