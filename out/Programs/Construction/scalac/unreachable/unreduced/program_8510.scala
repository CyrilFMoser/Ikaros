package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Byte) extends T_A
case class CC_B(a: T_B[CC_A, T_B[(Byte,Char), Int]], b: T_B[CC_A, CC_A], c: T_A) extends T_A
case class CC_C[C](a: C, b: C) extends T_B[C, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), 0), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), 0), _) => 1 
  case CC_A(CC_A(CC_A(_, _), _), _) => 2 
  case CC_A(CC_B(_, _, CC_A(_, _)), _) => 3 
  case CC_A(CC_B(_, _, CC_B(_, _, _)), _) => 4 
  case CC_B(_, _, _) => 5 
}
}
// This is not matched: CC_A(CC_A(CC_B(_, _, _), _), _)