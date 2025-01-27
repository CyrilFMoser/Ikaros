package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean, b: T_A[T_B, C], c: T_A[C, C]) extends T_A[T_B, C]
case class CC_B(a: Int) extends T_A[T_B, T_A[T_B, Int]]
case class CC_C(a: T_A[T_B, T_A[CC_B, (Boolean,Byte)]]) extends T_B
case class CC_D() extends T_B

val v_a: T_A[T_B, T_A[T_B, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, CC_B(_), _), _) => 1 
  case CC_A(_, CC_B(_), _) => 2 
  case CC_B(_) => 3 
}
}