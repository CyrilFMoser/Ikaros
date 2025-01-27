package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_B[Int, Boolean]]]
case class CC_B[D](a: CC_A) extends T_A[T_A[T_B[Int, Boolean]]]
case class CC_C[E](a: (T_A[CC_A],Boolean)) extends T_A[T_A[T_B[Int, Boolean]]]
case class CC_D[G, F](a: G, b: CC_A) extends T_B[G, F]

val v_a: T_A[T_A[T_B[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_C((_,_)) => 2 
}
}