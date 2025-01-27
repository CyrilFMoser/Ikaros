package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_A, b: B, c: T_A) extends T_A
case class CC_B(a: CC_A[Byte]) extends T_B[(T_B[T_A],T_A)]
case class CC_C(a: T_B[T_B[(Boolean,Byte)]], b: CC_B) extends T_B[(T_B[T_A],T_A)]

val v_a: T_B[(T_B[T_A],T_A)] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_C(_, _) => 1 
}
}