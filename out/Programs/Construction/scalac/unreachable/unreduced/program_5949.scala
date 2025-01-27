package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Byte, T_B[(Int,Byte), T_A]], b: T_A, c: T_B[Boolean, T_A]) extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A
case class CC_C(a: (CC_A,CC_B)) extends T_B[(T_A,T_A), T_A]
case class CC_D(a: Boolean, b: T_B[(T_A,T_A), T_A], c: CC_C) extends T_B[(T_A,T_A), T_A]
case class CC_E(a: Boolean) extends T_B[(T_A,T_A), T_A]

val v_a: T_B[(T_A,T_A), T_A] = null
val v_b: Int = v_a match{
  case CC_C((CC_A(_, _, _),CC_B(_, _))) => 0 
  case CC_D(_, CC_C((_,_)), CC_C((_,_))) => 1 
  case CC_D(_, CC_D(true, _, CC_C(_)), CC_C((_,_))) => 2 
  case CC_D(_, CC_D(false, _, CC_C(_)), CC_C((_,_))) => 3 
  case CC_D(_, CC_E(_), CC_C((_,_))) => 4 
  case CC_E(true) => 5 
  case CC_E(false) => 6 
}
}