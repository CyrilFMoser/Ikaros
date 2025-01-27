package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_B[Char]]]
case class CC_B[C](a: C) extends T_B[C]
case class CC_C(a: T_B[CC_A]) extends T_B[CC_A]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}