package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_B) extends T_A[T_B]
case class CC_B(a: CC_A) extends T_A[T_B]
case class CC_C(a: T_A[T_A[CC_A]], b: Char) extends T_B
case class CC_D(a: T_A[T_B], b: Char, c: T_B) extends T_B
case class CC_E(a: (CC_C,T_B)) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_C(_, _)) => 0 
  case CC_A(CC_A(_, _), CC_E((_,_))) => 1 
  case CC_A(CC_B(CC_A(_, _)), CC_C(_, _)) => 2 
  case CC_A(CC_B(CC_A(_, _)), CC_D(_, _, _)) => 3 
  case CC_A(CC_B(CC_A(_, _)), CC_E((_,_))) => 4 
  case CC_B(CC_A(_, _)) => 5 
}
}
// This is not matched: CC_A(CC_A(_, _), CC_D(_, _, _))