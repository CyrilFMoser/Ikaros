package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, T_A]], b: T_A) extends T_A
case class CC_B(a: Char) extends T_A
case class CC_C[C](a: Char, b: Char) extends T_B[C, T_A]
case class CC_D[D](a: D, b: D, c: CC_B) extends T_B[CC_C[T_B[CC_A, T_A]], D]

val v_a: T_B[CC_C[T_B[CC_A, T_A]], T_A] = null
val v_b: Int = v_a match{
  case CC_C(_, 'x') => 0 
  case CC_C(_, _) => 1 
  case CC_D(_, CC_A(_, _), CC_B('x')) => 2 
  case CC_D(_, CC_A(_, _), CC_B(_)) => 3 
  case CC_D(_, CC_B(_), CC_B('x')) => 4 
  case CC_D(_, CC_B(_), CC_B(_)) => 5 
}
}