package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(T_A,T_A)], b: (T_B[(Int,Byte)],(T_A,T_A))) extends T_A
case class CC_B(a: CC_A) extends T_B[T_A]
case class CC_C(a: T_A, b: (CC_B,(CC_B,Int))) extends T_B[T_A]
case class CC_D(a: Char) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, (_,_))) => 0 
  case CC_C(CC_A(_, (_,_)), _) => 1 
  case CC_D('x') => 2 
}
}
// This is not matched: CC_D(_)