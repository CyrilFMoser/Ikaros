package Program_29 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E, F](a: T_A[F]) extends T_B[E, Byte]

val v_a: T_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}
// This is not matched: (CC_B Int Boolean Wildcard (T_B Int Byte))
// This is not matched: Pattern match is empty without constants