package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char, b: (T_B[T_A, T_A],T_B[T_A, T_A]), c: Int) extends T_A
case class CC_B(a: Byte) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D(a: T_B[Byte, CC_C], b: T_A, c: T_A) extends T_B[CC_C, CC_A]
case class CC_E(a: CC_B, b: T_A) extends T_B[CC_C, CC_A]

val v_a: T_B[CC_C, CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_, _, _), CC_A(_, (_,_), _)) => 0 
  case CC_D(_, CC_B(_), CC_A(_, (_,_), _)) => 1 
  case CC_D(_, CC_C(CC_A(_, _, _)), CC_A(_, (_,_), _)) => 2 
  case CC_D(_, CC_A(_, _, _), CC_B(_)) => 3 
  case CC_D(_, CC_B(_), CC_B(_)) => 4 
  case CC_D(_, CC_C(CC_A(_, _, _)), CC_B(_)) => 5 
  case CC_D(_, CC_A(_, _, _), CC_C(CC_A(_, _, _))) => 6 
  case CC_D(_, CC_B(_), CC_C(CC_A(_, _, _))) => 7 
  case CC_D(_, CC_C(CC_A(_, _, _)), CC_C(CC_A(_, _, _))) => 8 
  case CC_E(_, CC_A(_, (_,_), _)) => 9 
  case CC_E(_, CC_B(_)) => 10 
  case CC_E(_, CC_C(_)) => 11 
}
}