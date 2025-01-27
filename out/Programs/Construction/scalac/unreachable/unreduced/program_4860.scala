package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[T_B[E, E], E], b: T_B[E, E]) extends T_A[T_B[((Boolean,Boolean),Boolean), T_B[Byte, (Byte,Int)]], E]
case class CC_B[F](a: T_A[T_B[F, F], F], b: (T_B[Byte, Int],Int)) extends T_A[T_B[((Boolean,Boolean),Boolean), T_B[Byte, (Byte,Int)]], F]
case class CC_C[G](a: CC_A[G], b: CC_A[G], c: (CC_B[Boolean],T_A[Boolean, Byte])) extends T_A[T_B[((Boolean,Boolean),Boolean), T_B[Byte, (Byte,Int)]], G]
case class CC_D() extends T_B[Int, T_B[T_A[Byte, Boolean], CC_A[Boolean]]]
case class CC_E(a: CC_A[CC_D]) extends T_B[Int, T_B[T_A[Byte, Boolean], CC_A[Boolean]]]
case class CC_F(a: T_A[CC_B[CC_D], CC_D], b: T_B[T_A[CC_E, CC_E], CC_A[(Char,Int)]]) extends T_B[Int, T_B[T_A[Byte, Boolean], CC_A[Boolean]]]

val v_a: T_B[Int, T_B[T_A[Byte, Boolean], CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_) => 1 
  case CC_F(_, _) => 2 
}
}