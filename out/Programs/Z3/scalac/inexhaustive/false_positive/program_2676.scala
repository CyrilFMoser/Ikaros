package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[Boolean, Int], b: (Byte,Byte), c: T_B[Byte]) extends T_A[T_A[Boolean, Char], T_B[Char]]
case class CC_B[D, E](a: (Boolean,CC_A), b: D) extends T_A[D, CC_A]
case class CC_C[F](a: F, b: (CC_A,Char)) extends T_B[F]
case class CC_D[G](a: G, b: G) extends T_B[G]

val v_a: T_A[Char, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
}
}
// This is not matched: (CC_B Char
//      Boolean
//      Wildcard
//      Char
//      (T_A Char (CC_A Boolean Boolean Boolean Boolean)))
// This is not matched: Pattern match is empty without constants