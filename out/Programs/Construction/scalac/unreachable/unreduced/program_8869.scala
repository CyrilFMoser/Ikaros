package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[Boolean, T_A[Char]]]
case class CC_B(a: T_B[CC_A, T_A[CC_A]]) extends T_A[T_B[Boolean, T_A[Char]]]
case class CC_C() extends T_A[T_B[Boolean, T_A[Char]]]
case class CC_D[D](a: Int) extends T_B[CC_B, D]

val v_a: T_A[T_B[Boolean, T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}