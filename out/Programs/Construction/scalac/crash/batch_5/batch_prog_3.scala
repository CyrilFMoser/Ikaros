package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: B, c: Byte) extends T_A[B]
case class CC_B() extends T_A[T_A[Char]]
case class CC_C[C](a: (T_A[CC_B],Boolean), b: C) extends T_A[C]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
}
}