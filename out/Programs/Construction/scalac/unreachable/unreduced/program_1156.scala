package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Byte, b: T_A[T_B, T_B], c: Boolean) extends T_A[T_A[Int, ((Byte,Byte),(Int,Int))], T_B]
case class CC_B(a: CC_A, b: T_A[Byte, CC_A]) extends T_B
case class CC_C(a: (Char,Boolean)) extends T_B
case class CC_D(a: T_A[CC_A, T_B], b: (CC_C,(CC_B,CC_A))) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _) => 0 
  case CC_C((_,_)) => 1 
  case CC_D(_, (_,_)) => 2 
}
}