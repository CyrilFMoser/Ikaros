package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_A[D, D], b: T_B[D], c: (T_A[Byte, (Boolean,Int)],T_A[Int, Int])) extends T_A[E, D]
case class CC_B[G, F](a: F, b: G, c: G) extends T_A[F, G]
case class CC_C[H](a: CC_A[T_A[H, H], H]) extends T_A[T_A[H, H], H]
case class CC_D(a: T_A[CC_A[(Int,Char), Int], T_A[Int, Byte]], b: T_A[T_A[Boolean, Byte], Boolean], c: CC_A[Int, T_A[Boolean, Char]]) extends T_B[T_A[T_A[T_B[Int], T_B[Int]], T_B[Int]]]
case class CC_E() extends T_B[T_A[T_A[T_B[Int], T_B[Int]], T_B[Int]]]
case class CC_F(a: CC_C[CC_E], b: CC_A[CC_B[CC_E, CC_D], CC_E], c: Boolean) extends T_B[T_A[T_A[T_B[Int], T_B[Int]], T_B[Int]]]

val v_a: T_A[T_A[CC_F, CC_F], CC_F] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, (_,_)) => 0 
  case CC_A(CC_B(_, _, _), _, (_,_)) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_) => 3 
}
}