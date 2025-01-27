package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char) extends T_A[T_A[T_A[Char]]]
case class CC_B[B]() extends T_A[B]
case class CC_C(a: CC_B[CC_A], b: CC_A) extends T_A[T_A[T_A[Char]]]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}