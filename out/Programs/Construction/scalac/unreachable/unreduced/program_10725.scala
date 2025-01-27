package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_B[E, E]) extends T_A[E, T_B[T_B[Byte, Int], T_A[Boolean, Boolean]]]
case class CC_B[F](a: F) extends T_A[F, T_B[T_B[Byte, Int], T_A[Boolean, Boolean]]]
case class CC_C[G](a: T_B[G, G], b: G, c: G) extends T_A[G, T_B[T_B[Byte, Int], T_A[Boolean, Boolean]]]
case class CC_D[H](a: H) extends T_B[CC_C[H], H]
case class CC_E() extends T_B[(CC_A[Int],Int), CC_B[T_B[Int, (Boolean,Boolean)]]]
case class CC_F(a: Byte, b: CC_C[CC_D[Boolean]], c: CC_A[T_A[CC_E, (Int,Char)]]) extends T_B[(CC_A[Int],Int), CC_B[T_B[Int, (Boolean,Boolean)]]]

val v_a: T_A[Boolean, T_B[T_B[Byte, Int], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}