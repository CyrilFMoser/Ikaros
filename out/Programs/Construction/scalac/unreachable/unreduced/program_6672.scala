package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_B[T_B[T_A]], c: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: Boolean, b: Int, c: (CC_B,T_B[T_A])) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B(_))) => 1 
  case CC_A(_, _, CC_A(_, _, CC_C())) => 2 
  case CC_A(_, _, CC_B(_)) => 3 
  case CC_A(_, _, CC_C()) => 4 
  case CC_B(CC_A(_, _, CC_A(_, _, _))) => 5 
  case CC_B(CC_A(_, _, CC_B(_))) => 6 
  case CC_B(CC_A(_, _, CC_C())) => 7 
  case CC_C() => 8 
}
}