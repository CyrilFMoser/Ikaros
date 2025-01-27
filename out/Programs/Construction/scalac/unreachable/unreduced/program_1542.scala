package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: (T_A[Boolean, Char],T_A[Int, Byte])) extends T_A[Boolean, D]
case class CC_B[E](a: T_A[Boolean, E], b: Char, c: Byte) extends T_A[Boolean, E]
case class CC_C[F](a: F) extends T_B[F]
case class CC_D(a: Char) extends T_B[((Char,Boolean),Char)]
case class CC_E(a: Byte, b: T_B[CC_D], c: CC_B[T_A[Boolean, (Boolean,Boolean)]]) extends T_B[((Char,Boolean),Char)]

val v_a: T_A[Boolean, CC_E] = null
val v_b: Int = v_a match{
  case CC_A(CC_E(_, _, _), (_,_)) => 0 
  case CC_B(_, 'x', 0) => 1 
  case CC_B(_, 'x', _) => 2 
  case CC_B(_, _, 0) => 3 
  case CC_B(_, _, _) => 4 
}
}