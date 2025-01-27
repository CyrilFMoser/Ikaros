package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: Boolean, b: T_B[T_A]) extends T_A
case class CC_C(a: (T_A,Char)) extends T_A
case class CC_D() extends T_B[(Boolean,CC_B)]
case class CC_E(a: Byte, b: CC_B) extends T_B[(Boolean,CC_B)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_A(CC_C(_))) => 2 
  case CC_A(CC_B(_, _)) => 3 
  case CC_A(CC_C((_,_))) => 4 
  case CC_B(_, _) => 5 
  case CC_C((CC_A(_),_)) => 6 
  case CC_C((CC_B(_, _),_)) => 7 
}
}
// This is not matched: CC_C((CC_C(_),_))