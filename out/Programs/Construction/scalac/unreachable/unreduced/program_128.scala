package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A, c: T_B[T_A]) extends T_A
case class CC_B(a: ((CC_A,CC_A),T_B[CC_A])) extends T_A
case class CC_C(a: CC_A) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_), CC_A(_, _, _), _) => 0 
  case CC_A(CC_C(_), CC_B(_), _) => 1 
  case CC_B((_,_)) => 2 
}
}