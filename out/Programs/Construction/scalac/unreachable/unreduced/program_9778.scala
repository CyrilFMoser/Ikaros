package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[C, ((Byte,T_B),(T_B,Byte))]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, ((Byte,T_B),(T_B,Byte))]
case class CC_C(a: CC_A[Byte], b: Int, c: T_B) extends T_B

val v_a: T_A[Boolean, ((Byte,T_B),(T_B,Byte))] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_A(_), _, CC_C(_, _, _))) => 0 
  case CC_B(_) => 1 
}
}