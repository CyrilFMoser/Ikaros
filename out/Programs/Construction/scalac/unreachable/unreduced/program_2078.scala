package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_A[Int], T_A[Boolean]]]
case class CC_B[D, E](a: T_A[E], b: Int, c: D) extends T_A[D]
case class CC_C() extends T_A[T_B[T_A[Int], T_A[Boolean]]]
case class CC_D[F](a: F, b: CC_C) extends T_B[F, CC_A]

val v_a: T_A[T_B[T_A[Int], T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C()