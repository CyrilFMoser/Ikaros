package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[(Char,Byte)],T_B[(Int,Boolean)])) extends T_A
case class CC_B(a: T_B[Int], b: T_A, c: CC_A) extends T_A
case class CC_C(a: T_A, b: Boolean) extends T_A
case class CC_D() extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A((_,_)), CC_A(_)) => 1 
  case CC_B(_, CC_B(_, _, _), CC_A(_)) => 2 
  case CC_B(_, CC_C(_, _), CC_A(_)) => 3 
  case CC_C(CC_A(_), _) => 4 
  case CC_C(CC_B(_, CC_A(_), _), _) => 5 
  case CC_C(CC_B(_, CC_B(_, _, _), _), _) => 6 
  case CC_C(CC_C(_, _), _) => 7 
}
}
// This is not matched: CC_C(CC_B(_, CC_C(_, _), _), _)