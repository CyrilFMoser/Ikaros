package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: Int, b: T_A[T_B, D]) extends T_A[T_B, C]
case class CC_B(a: T_A[T_A[T_B, Boolean], T_B]) extends T_B
case class CC_C(a: T_A[T_A[Int, (Boolean,Int)], Byte], b: T_B) extends T_B
case class CC_D(a: T_A[T_B, T_A[T_B, T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _) => 1 
  case CC_D(CC_A(12, _)) => 2 
  case CC_D(CC_A(_, _)) => 3 
}
}