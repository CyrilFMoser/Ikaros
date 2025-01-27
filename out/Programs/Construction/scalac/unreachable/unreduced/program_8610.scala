package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,Byte), b: Boolean) extends T_A[C, (T_A[T_B, T_B],T_A[T_B, T_B])]
case class CC_B(a: T_A[CC_A[Boolean], T_A[T_B, T_B]], b: T_B) extends T_B
case class CC_C(a: CC_A[CC_B]) extends T_B
case class CC_D(a: T_A[Int, CC_B], b: T_A[T_B, T_A[CC_C, (Byte,Char)]], c: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, CC_B(_, _))) => 0 
  case CC_B(_, CC_B(_, CC_C(_))) => 1 
  case CC_B(_, CC_B(_, CC_D(_, _, _))) => 2 
  case CC_B(_, CC_C(CC_A(_, _))) => 3 
  case CC_B(_, CC_D(_, _, _)) => 4 
  case CC_C(_) => 5 
  case CC_D(_, _, _) => 6 
}
}