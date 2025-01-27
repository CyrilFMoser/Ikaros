package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: E) extends T_A[E]
case class CC_C() extends T_A[T_A[T_A[Byte]]]
case class CC_D() extends T_B[T_A[CC_B[Boolean]], Int]
case class CC_E(a: T_A[(CC_D,CC_C)], b: T_A[T_A[CC_C]], c: Int) extends T_B[T_A[CC_B[Boolean]], Int]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_B(CC_B(_)) => 2 
  case CC_C() => 3 
}
}