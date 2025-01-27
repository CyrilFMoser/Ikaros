package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: Byte) extends T_A[T_B[Char], D]
case class CC_B[F](a: (Char,(Byte,Char))) extends T_A[T_B[Char], F]
case class CC_C() extends T_B[Byte]
case class CC_D[G](a: T_B[Byte], b: T_B[G], c: CC_B[CC_C]) extends T_B[G]

val v_a: T_A[T_B[Char], Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
  case CC_A(_) => 1 
  case CC_B((_,(_,_))) => 2 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard (T_A (T_B Char) Byte))
// This is not matched: (CC_C Wildcard Wildcard T_A)