package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_B[T_A]], c: Boolean) extends T_A
case class CC_B(a: T_B[CC_A], b: Boolean, c: T_B[CC_A]) extends T_B[CC_A]
case class CC_C(a: T_B[CC_B], b: T_B[(CC_B,CC_A)], c: ((CC_B,CC_B),Int)) extends T_B[CC_A]
case class CC_D(a: CC_C, b: T_B[(T_A,CC_C)], c: CC_A) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, _, _)) => 0 
  case CC_B(_, _, CC_C(_, _, _)) => 1 
  case CC_B(_, _, CC_D(CC_C(_, _, _), _, _)) => 2 
  case CC_C(_, _, _) => 3 
  case CC_D(CC_C(_, _, (_,_)), _, CC_A(CC_A(_, _, _), _, _)) => 4 
}
}