package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_A[Byte],(Byte,Byte))) extends T_A[Boolean]
case class CC_B(a: Int, b: T_B[CC_A, CC_A]) extends T_A[Boolean]
case class CC_C(a: (CC_B,T_A[CC_B]), b: CC_B) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(12, _) => 1 
  case CC_B(_, _) => 2 
  case CC_C((_,_), _) => 3 
}
}