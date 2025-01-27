package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[T_A, (Int,Int)],Boolean), b: T_A) extends T_A
case class CC_B(a: T_B[CC_A, T_B[T_A, T_A]]) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D() extends T_B[CC_A, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A((_,_), CC_A(_, _))) => 2 
  case CC_C(CC_A((_,_), CC_B(_))) => 3 
  case CC_C(CC_A((_,_), CC_C(_))) => 4 
  case CC_C(CC_B(_)) => 5 
  case CC_C(CC_C(CC_A(_, _))) => 6 
  case CC_C(CC_C(CC_B(_))) => 7 
  case CC_C(CC_C(CC_C(_))) => 8 
}
}