package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Byte], b: T_A[Char]) extends T_A[Byte]
case class CC_B(a: Boolean) extends T_A[Byte]
case class CC_C(a: CC_B, b: (T_B,Char)) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_), _), _) => 1 
  case CC_A(CC_A(CC_C(_, _), _), _) => 2 
  case CC_A(CC_B(_), _) => 3 
  case CC_A(CC_C(CC_B(_), (_,_)), _) => 4 
  case CC_B(_) => 5 
  case CC_C(CC_B(true), _) => 6 
  case CC_C(CC_B(false), _) => 7 
}
}