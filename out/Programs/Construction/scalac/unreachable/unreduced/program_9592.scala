package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A]) extends T_A
case class CC_B(a: T_A, b: (T_B[CC_A],(Int,Int))) extends T_A
case class CC_C(a: T_A) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_C(_)) => 0 
  case CC_A(CC_B(CC_A(_, _), _), CC_C(_)) => 1 
  case CC_A(CC_B(CC_B(_, _), _), CC_C(_)) => 2 
  case CC_B(_, (_,(_,_))) => 3 
}
}