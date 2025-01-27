package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: CC_A, b: T_A[CC_A], c: CC_A) extends T_A[T_B]
case class CC_C() extends T_B
case class CC_D[B](a: Char, b: B, c: B) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}