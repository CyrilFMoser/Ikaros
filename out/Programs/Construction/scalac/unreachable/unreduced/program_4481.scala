package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int) extends T_A
case class CC_B(a: T_B[T_A, T_A]) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D[C](a: Byte, b: CC_A) extends T_B[(CC_B,T_B[T_A, (Int,Boolean)]), C]
case class CC_E[D](a: CC_A, b: (T_A,CC_B), c: T_B[D, D]) extends T_B[CC_D[D], D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_)