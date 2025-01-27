package Program_31 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: ((Char,Int),Char), b: T_A[Int], c: T_B[Char]) extends T_A[Char]
case class CC_B[C](a: Int, b: Int) extends T_A[Char]
case class CC_C[D, E](a: (CC_A,Int), b: CC_A) extends T_A[D]
case class CC_D[F, G](a: G) extends T_B[F]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_C((CC_A(_, _, _),_), _) => 0 
  case CC_C((CC_A(_, _, _),12), _) => 1 
}
}
// This is not matched: (CC_C Byte (T_A Boolean) (Tuple Wildcard Int) Wildcard (T_A Byte))
// This is not matched: (CC_B Wildcard Wildcard T_A)