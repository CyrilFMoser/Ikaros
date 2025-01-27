package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Int, Char], T_A[(Int,Byte)]], b: Int) extends T_A[T_A[T_B[Int, Char]]]
case class CC_B[D](a: D, b: D, c: D) extends T_A[D]
case class CC_C[E, F](a: (CC_A,CC_B[CC_A])) extends T_B[E, Boolean]
case class CC_D[G, H](a: CC_A, b: T_B[G, Boolean]) extends T_B[G, H]
case class CC_E[I]() extends T_B[I, T_A[((Boolean,Char),CC_A)]]

val v_a: T_A[T_A[T_B[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(CC_A(_, _), CC_C(_)), _) => 0 
  case CC_A(CC_D(CC_A(_, _), CC_D(_, _)), _) => 1 
  case CC_B(CC_B(CC_D(_, _), CC_D(_, _), CC_D(_, _)), _, CC_B(_, _, CC_D(_, _))) => 2 
}
}