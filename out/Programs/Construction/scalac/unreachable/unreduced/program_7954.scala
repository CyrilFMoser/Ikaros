package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_B]
case class CC_B(a: T_A[CC_A[T_B], T_B], b: CC_A[(Int,T_B)], c: Boolean) extends T_B
case class CC_C(a: T_A[Boolean, T_B]) extends T_B
case class CC_D(a: ((CC_C,CC_C),CC_B), b: T_A[CC_C, CC_C], c: CC_A[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _, true) => 0 
  case CC_B(CC_A(), _, false) => 1 
  case CC_C(CC_A()) => 2 
  case CC_D(_, _, _) => 3 
}
}