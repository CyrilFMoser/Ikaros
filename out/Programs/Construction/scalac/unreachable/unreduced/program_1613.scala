package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char, b: Int) extends T_A[T_A[T_B]]
case class CC_B(a: CC_A, b: T_B, c: Boolean) extends T_A[T_A[T_B]]
case class CC_C(a: CC_A) extends T_B
case class CC_D(a: CC_B, b: Char, c: T_A[T_A[CC_C]]) extends T_B
case class CC_E(a: T_B, b: (CC_D,Char)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _)) => 0 
  case CC_D(CC_B(_, _, _), _, _) => 1 
  case CC_E(_, (_,_)) => 2 
}
}