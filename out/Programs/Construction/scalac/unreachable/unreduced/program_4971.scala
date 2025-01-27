package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[(Boolean,Int)], Char], b: T_B[T_B[Byte]]) extends T_A[T_B[Boolean], T_A[Int, (Char,(Char,Int))]]
case class CC_B[D]() extends T_A[T_B[Boolean], T_A[Int, (Char,(Char,Int))]]
case class CC_C[E](a: E, b: Boolean) extends T_A[T_B[Boolean], T_A[Int, (Char,(Char,Int))]]
case class CC_D[F]() extends T_B[F]
case class CC_E[G](a: G, b: CC_A) extends T_B[G]
case class CC_F() extends T_B[CC_D[CC_B[CC_A]]]

val v_a: T_A[T_B[Boolean], T_A[Int, (Char,(Char,Int))]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _)