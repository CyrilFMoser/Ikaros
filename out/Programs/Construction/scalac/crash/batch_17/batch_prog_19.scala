package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C(a: Int) extends T_A[T_A[Int]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: CC_A()