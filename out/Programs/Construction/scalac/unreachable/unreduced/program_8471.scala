package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[T_B[CC_A, CC_A], Byte], b: CC_A, c: CC_A) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D[C](a: (T_B[(Int,Boolean), CC_B],T_B[CC_B, CC_B])) extends T_B[CC_C, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_))) => 2 
  case CC_A(CC_B(_, _, _)) => 3 
  case CC_A(CC_C(_)) => 4 
  case CC_C(_) => 5 
}
}
// This is not matched: CC_B(_, CC_A(_), CC_A(_))