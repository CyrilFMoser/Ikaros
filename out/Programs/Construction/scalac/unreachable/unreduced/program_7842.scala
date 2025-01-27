package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[Byte]) extends T_A[((T_B,T_B),T_A[(Byte,Byte)])]
case class CC_B(a: T_B) extends T_A[((T_B,T_B),T_A[(Byte,Byte)])]
case class CC_C(a: T_B) extends T_B
case class CC_D(a: Boolean, b: CC_A, c: CC_B) extends T_B
case class CC_E(a: CC_A, b: CC_B, c: CC_C) extends T_B

val v_a: T_A[((T_B,T_B),T_A[(Byte,Byte)])] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_C(_)), _) => 0 
  case CC_A(CC_C(CC_D(_, _, _)), _) => 1 
  case CC_A(CC_C(CC_E(_, _, _)), _) => 2 
  case CC_A(CC_D(_, CC_A(_, _), CC_B(_)), _) => 3 
  case CC_B(_) => 4 
}
}
// This is not matched: CC_A(CC_E(_, CC_B(_), _), _)