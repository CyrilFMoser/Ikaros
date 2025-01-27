package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[T_A[C, C], C]
case class CC_B() extends T_B
case class CC_C(a: T_A[CC_A[CC_B], T_A[T_B, CC_B]]) extends T_B
case class CC_D(a: T_A[(CC_B,Byte), CC_C], b: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_D(_, _)