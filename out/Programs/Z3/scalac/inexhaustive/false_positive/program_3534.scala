package Program_13 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_A[C], c: T_A[C]) extends T_A[C]
case class CC_B() extends T_A[Byte]
case class CC_C() extends T_A[Byte]
case class CC_D[D](a: T_B[D]) extends T_B[D]
case class CC_E[E, F](a: T_B[F]) extends T_B[E]
case class CC_F[G](a: Boolean, b: G) extends T_B[G]

val v_a: CC_E[Int, Char] = null
val v_b: Int = v_a match{
  case CC_E(CC_E(_)) => 0 
  case CC_E(CC_D(_)) => 1 
}
}
// This is not matched: (CC_E Int Char (CC_F Char Boolean Wildcard (T_B Char)) (T_B Int))
// This is not matched: Pattern match is empty without constants