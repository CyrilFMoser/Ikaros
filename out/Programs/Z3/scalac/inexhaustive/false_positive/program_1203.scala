package Program_31 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D, E](a: (T_B,Byte)) extends T_A[D, C]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Byte Int T_B Wildcard (T_A Int Byte))
// This is not matched: (CC_D Boolean T_B)