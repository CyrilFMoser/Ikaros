package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[T_A[T_B]]
case class CC_B(a: T_B, b: (T_B,CC_A[(Byte,Byte)]), c: T_A[T_A[T_B]]) extends T_B
case class CC_C(a: T_A[T_A[T_B]]) extends T_B
case class CC_D(a: T_A[CC_B], b: CC_A[CC_C], c: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), _, CC_A()) => 0 
  case CC_B(CC_C(_), _, CC_A()) => 1 
  case CC_B(CC_D(_, _, _), _, CC_A()) => 2 
  case CC_C(_) => 3 
  case CC_D(_, CC_A(), _) => 4 
}
}