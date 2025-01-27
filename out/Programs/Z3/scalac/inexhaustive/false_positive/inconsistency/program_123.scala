package Program_31 

object Test {
sealed trait T_A[B]
sealed trait T_B[C, D]
case class CC_A[E](a: (Char,(Byte,Byte)), b: T_A[Char]) extends T_A[T_B[E, E]]
case class CC_B[G, F](a: CC_A[F]) extends T_B[G, F]
case class CC_C() extends T_B[CC_B[Boolean, Char], T_B[Byte, Byte]]

val v_a: T_B[Char, CC_C] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(('x',_), _)) => 0 
}
}
// This is not matched: Pattern match is empty without constants