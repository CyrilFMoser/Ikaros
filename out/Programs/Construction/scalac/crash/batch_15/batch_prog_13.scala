package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Char], b: Byte) extends T_A
case class CC_B[C](a: Char) extends T_B[T_A, C]
case class CC_C[D, E](a: CC_B[D], b: CC_A, c: (T_B[T_A, T_A],((Boolean,Boolean),(Char,Char)))) extends T_B[D, E]
case class CC_D[F]() extends T_B[T_A, F]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_), _) => 0 
  case CC_A(CC_D(), _) => 1 
}
}
// This is not matched: CC_A(CC_C(_, _, _), _)