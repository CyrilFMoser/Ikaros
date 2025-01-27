package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Byte) extends T_A[T_B[T_B[Int, Boolean], Byte], T_B[T_A[Byte, Boolean], T_A[Boolean, (Boolean,Int)]]]
case class CC_B(a: CC_A, b: T_A[CC_A, CC_A], c: Byte) extends T_A[T_B[T_B[Int, Boolean], Byte], T_B[T_A[Byte, Boolean], T_A[Boolean, (Boolean,Int)]]]
case class CC_C(a: T_A[Char, Byte]) extends T_A[T_B[T_B[Int, Boolean], Byte], T_B[T_A[Byte, Boolean], T_A[Boolean, (Boolean,Int)]]]
case class CC_D[E](a: T_B[E, E], b: CC_A) extends T_B[E, T_A[Int, T_B[Char, Char]]]
case class CC_E[F](a: CC_D[F], b: CC_B) extends T_B[F, T_A[Int, T_B[Char, Char]]]

val v_a: T_A[T_B[T_B[Int, Boolean], Byte], T_B[T_A[Byte, Boolean], T_A[Boolean, (Boolean,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
  case CC_A(_) => 1 
  case CC_B(CC_A(_), _, _) => 2 
  case CC_C(_) => 3 
}
}