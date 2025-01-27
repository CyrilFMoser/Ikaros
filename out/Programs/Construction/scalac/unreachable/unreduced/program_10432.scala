package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_A[Int], T_A[Byte]]]
case class CC_B(a: T_B[T_A[Boolean], T_B[CC_A, Byte]]) extends T_A[T_B[T_A[Int], T_A[Byte]]]
case class CC_C[D](a: D) extends T_A[D]
case class CC_D[E](a: CC_A, b: CC_B) extends T_B[(T_A[CC_B],T_B[CC_B, CC_B]), T_B[T_A[CC_A], T_A[CC_A]]]

val v_a: T_A[T_B[T_A[Int], T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_)