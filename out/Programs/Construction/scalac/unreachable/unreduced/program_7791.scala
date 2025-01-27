package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: Byte, b: T_B[T_B[CC_A, Boolean], Byte], c: T_A) extends T_A
case class CC_C(a: T_A, b: T_A) extends T_A
case class CC_D(a: T_B[CC_B, CC_A], b: T_A) extends T_B[CC_A, (CC_B,T_B[(Boolean,Byte), Int])]
case class CC_E(a: CC_B, b: CC_B) extends T_B[CC_A, (CC_B,T_B[(Boolean,Byte), Int])]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, CC_A(_)) => 2 
  case CC_C(_, CC_B(_, _, CC_A(_))) => 3 
  case CC_C(_, CC_B(_, _, CC_B(_, _, _))) => 4 
  case CC_C(_, CC_B(_, _, CC_C(_, _))) => 5 
  case CC_C(_, CC_C(CC_A(_), _)) => 6 
  case CC_C(_, CC_C(CC_C(_, _), _)) => 7 
}
}
// This is not matched: CC_C(_, CC_C(CC_B(_, _, _), _))