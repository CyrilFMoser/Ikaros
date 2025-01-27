package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B(a: CC_A, b: T_B[T_B[CC_A, T_A], T_B[T_A, CC_A]]) extends T_A
case class CC_C(a: T_A, b: (CC_B,CC_B)) extends T_A
case class CC_D[C](a: CC_A, b: CC_A) extends T_B[T_B[CC_B, Int], C]
case class CC_E() extends T_B[T_B[CC_B, Int], T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_, _), _, _) => 1 
  case CC_A(CC_C(_, _), _, _) => 2 
  case CC_B(CC_A(_, _, _), _) => 3 
  case CC_C(_, (_,_)) => 4 
}
}