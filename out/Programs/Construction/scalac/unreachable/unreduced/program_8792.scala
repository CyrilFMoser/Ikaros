package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[E], b: T_B[E]) extends T_A[D, E]
case class CC_B[F](a: T_A[T_B[Char], Char], b: F) extends T_A[T_B[F], F]
case class CC_C[G](a: Byte) extends T_A[T_B[G], G]
case class CC_D(a: Int, b: Boolean) extends T_B[CC_A[CC_A[Byte, Char], CC_A[Byte, (Int,Byte)]]]

val v_a: T_A[T_B[T_B[CC_A[CC_A[Byte, Char], CC_A[Byte, (Int,Byte)]]]], T_B[CC_A[CC_A[Byte, Char], CC_A[Byte, (Int,Byte)]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _) => 1 
  case CC_B(CC_B(CC_B(_, _), _), _) => 2 
  case CC_B(CC_B(CC_C(_), _), _) => 3 
  case CC_B(CC_C(_), _) => 4 
  case CC_C(_) => 5 
}
}
// This is not matched: CC_B(CC_B(CC_A(_, _), _), _)