package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[E, F], b: T_A[F, F]) extends T_A[E, F]
case class CC_B() extends T_A[T_B[CC_A[Boolean, Boolean], T_A[(Boolean,Boolean), Byte]], CC_A[T_B[Int, Boolean], CC_A[Boolean, Int]]]
case class CC_C[G, H](a: T_B[T_B[G, H], H]) extends T_A[H, G]
case class CC_D[I](a: T_B[Boolean, T_A[Boolean, Boolean]]) extends T_B[I, T_A[I, I]]

val v_a: T_A[T_B[CC_A[Boolean, Boolean], T_A[(Boolean,Boolean), Byte]], CC_A[T_B[Int, Boolean], CC_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(CC_A(_, _), CC_C(_)) => 1 
  case CC_A(CC_B(), CC_A(_, _)) => 2 
  case CC_A(CC_B(), CC_C(_)) => 3 
  case CC_A(CC_C(_), CC_A(_, _)) => 4 
  case CC_A(CC_C(_), CC_C(_)) => 5 
  case CC_B() => 6 
  case CC_C(_) => 7 
}
}