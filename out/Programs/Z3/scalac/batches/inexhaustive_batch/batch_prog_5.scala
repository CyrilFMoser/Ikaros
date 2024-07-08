package Program_5 

 object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_B(_), CC_A(_, _))) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_B(CC_A(_, CC_B(_))) => 2 
  case CC_B(CC_A(_, CC_A(_, _))) => 3 
  case CC_B(CC_A(CC_A(_, _), CC_B(_))) => 4 
  case CC_B(_) => 5 
  case CC_A(CC_A(CC_B(_), CC_A(_, _)), CC_A(_, CC_B(_))) => 6 
  case CC_A(CC_A(CC_A(_, _), CC_B(_)), CC_A(CC_B(_), CC_B(_))) => 7 
  case CC_A(CC_A(_, _), CC_A(_, CC_A(_, _))) => 8 
  case CC_A(CC_A(CC_B(_), CC_A(_, _)), CC_A(_, CC_A(_, _))) => 9 
}
}