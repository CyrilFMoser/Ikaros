package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[T_A, T_A], T_B[T_A, T_A]], c: T_B[T_B[T_A, T_A], T_B[T_A, (Boolean,Byte)]]) extends T_A
case class CC_B[C](a: (Char,Boolean), b: T_B[CC_A, C], c: Boolean) extends T_B[CC_A, C]
case class CC_C[D](a: T_B[D, Byte], b: T_B[CC_A, D], c: CC_B[D]) extends T_B[CC_A, D]
case class CC_D[E](a: Char) extends T_B[CC_A, E]

val v_a: T_B[CC_A, T_A] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _, _), _) => 0 
  case CC_B(_, CC_C(_, _, _), _) => 1 
  case CC_B(_, CC_D(_), _) => 2 
  case CC_C(_, _, _) => 3 
  case CC_D(_) => 4 
}
}