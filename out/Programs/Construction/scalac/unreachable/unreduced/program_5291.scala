package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, T_A]], b: T_A, c: T_A) extends T_A
case class CC_B(a: T_A, b: Boolean) extends T_A
case class CC_C[C](a: (T_A,Char), b: Byte, c: CC_B) extends T_B[C, Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), _) => 1 
  case CC_B(CC_A(_, CC_B(_, _), CC_A(_, _, _)), _) => 2 
  case CC_B(CC_A(_, CC_B(_, _), CC_B(_, _)), _) => 3 
  case CC_B(CC_B(CC_A(_, _, _), _), _) => 4 
  case CC_B(CC_B(CC_B(_, _), _), _) => 5 
}
}
// This is not matched: CC_B(CC_A(_, CC_A(_, _, _), CC_B(_, _)), _)