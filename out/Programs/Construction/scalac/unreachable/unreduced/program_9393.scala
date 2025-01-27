package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Int]], b: Byte) extends T_A[((Char,Boolean),T_B[Boolean, Int])]
case class CC_B(a: Byte) extends T_A[((Char,Boolean),T_B[Boolean, Int])]
case class CC_C() extends T_A[((Char,Boolean),T_B[Boolean, Int])]
case class CC_D[D, E](a: D, b: T_B[T_B[D, E], E], c: T_B[D, D]) extends T_B[E, D]

val v_a: T_A[((Char,Boolean),T_B[Boolean, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}