package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[(T_A,T_A)], c: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: CC_B) extends T_B[CC_B]
case class CC_D(a: Boolean, b: (T_A,(T_A,T_A)), c: CC_A) extends T_B[CC_B]
case class CC_E(a: Char, b: (CC_A,Byte)) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_A(_, _, _))) => 0 
  case CC_C(CC_B(CC_B(_))) => 1 
  case CC_D(_, _, _) => 2 
  case CC_E(_, _) => 3 
}
}