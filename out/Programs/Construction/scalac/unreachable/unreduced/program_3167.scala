package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: Byte) extends T_A[Byte]
case class CC_B(a: Byte) extends T_A[Byte]
case class CC_C(a: T_A[(CC_B,CC_A)], b: T_A[T_A[(Int,Byte)]], c: Boolean) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_), _) => 1 
  case CC_A(CC_C(_, _, _), _) => 2 
  case CC_B(0) => 3 
  case CC_B(_) => 4 
  case CC_C(_, _, _) => 5 
}
}