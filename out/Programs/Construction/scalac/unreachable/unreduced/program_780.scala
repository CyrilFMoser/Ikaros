package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_B[T_B[T_A, Char], Char], c: Int) extends T_A
case class CC_B(a: T_A, b: (Char,Char)) extends T_A
case class CC_C[C](a: T_B[CC_A, C]) extends T_B[CC_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
}
}