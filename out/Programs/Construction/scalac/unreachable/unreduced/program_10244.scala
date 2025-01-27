package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[(Byte,Char)]) extends T_A[Boolean]
case class CC_B(a: (Byte,(CC_A,CC_A)), b: Byte, c: (Boolean,CC_A)) extends T_A[Boolean]
case class CC_C(a: CC_B) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _), _) => 1 
  case CC_A(CC_A(CC_C(_), _), _) => 2 
  case CC_A(CC_B(_, _, _), _) => 3 
  case CC_A(CC_C(_), _) => 4 
  case CC_B((_,(_,_)), _, (_,CC_A(_, _))) => 5 
  case CC_C(CC_B(_, _, _)) => 6 
}
}