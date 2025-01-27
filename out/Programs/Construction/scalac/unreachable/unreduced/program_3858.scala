package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: (Int,T_B[Int]), c: T_B[Boolean]) extends T_A[D, T_A[T_B[Byte], Boolean]]
case class CC_B[E, F]() extends T_A[E, T_A[T_B[Byte], Boolean]]
case class CC_C[G](a: CC_B[G, G], b: G, c: T_A[G, G]) extends T_A[G, T_A[T_B[Byte], Boolean]]
case class CC_D() extends T_B[T_B[Int]]
case class CC_E(a: T_A[T_A[CC_D, (Boolean,Int)], Int], b: T_A[T_A[CC_D, CC_D], T_A[CC_D, CC_D]], c: Boolean) extends T_B[T_B[Int]]
case class CC_F(a: T_B[T_A[Byte, CC_D]]) extends T_B[T_B[Int]]

val v_a: T_B[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, _, _) => 1 
}
}
// This is not matched: CC_F(_)