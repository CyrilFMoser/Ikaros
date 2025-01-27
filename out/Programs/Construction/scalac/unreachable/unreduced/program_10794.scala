package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte, b: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: Int, b: CC_A) extends T_A[T_B]
case class CC_C(a: (T_B,(T_B,T_B))) extends T_B
case class CC_D(a: (CC_A,T_A[CC_C]), b: CC_C) extends T_B
case class CC_E(a: CC_B, b: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C((CC_C(_),(_,_))) => 0 
  case CC_C((CC_D(_, _),(_,_))) => 1 
  case CC_C((CC_E(_, _),(_,_))) => 2 
  case CC_D((CC_A(_, _),_), CC_C((_,_))) => 3 
  case CC_E(CC_B(_, CC_A(_, _)), _) => 4 
}
}