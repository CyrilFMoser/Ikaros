package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Byte,T_B[T_A, T_A]), b: T_B[T_B[Int, T_A], T_B[T_A, Boolean]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D() extends T_B[Byte, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(CC_A((_,_), _)) => 1 
  case CC_C(CC_B()) => 2 
  case CC_C(CC_C(CC_A(_, _))) => 3 
  case CC_C(CC_C(CC_B())) => 4 
  case CC_C(CC_C(CC_C(_))) => 5 
}
}
// This is not matched: CC_B()