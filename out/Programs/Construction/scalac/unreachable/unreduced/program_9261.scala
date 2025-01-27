package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[(T_A[T_B, T_B],T_A[T_B, T_B]), C]
case class CC_B(a: CC_A[(T_B,(Int,Byte))]) extends T_B
case class CC_C(a: CC_A[Boolean], b: CC_B, c: T_B) extends T_B
case class CC_D[D](a: D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_C(_, CC_B(CC_A(_)), _) => 1 
  case CC_D(_) => 2 
}
}