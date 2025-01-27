package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[(T_B,Byte)]]
case class CC_B(a: Byte, b: Boolean) extends T_B
case class CC_C(a: T_B, b: (T_A[T_B],Boolean)) extends T_B
case class CC_D(a: T_A[T_A[CC_A]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, (_,true)) => 1 
  case CC_C(_, (_,false)) => 2 
}
}
// This is not matched: CC_D(_)