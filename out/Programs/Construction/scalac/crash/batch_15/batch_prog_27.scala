package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: E) extends T_A[E, D]
case class CC_B(a: T_A[CC_A[Byte, Char], Boolean], b: Char, c: T_A[CC_A[(Int,Byte), (Char,Byte)], T_A[Int, Byte]]) extends T_A[(T_A[Char, Char],Byte), Char]
case class CC_C() extends T_A[(T_A[Char, Char],Byte), Char]
case class CC_D[F](a: T_A[F, F], b: F, c: CC_A[F, F]) extends T_B[F]
case class CC_E[G](a: T_B[G], b: G) extends T_B[G]
case class CC_F() extends T_B[T_B[T_B[Boolean]]]

val v_a: T_B[T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_D(_, _, _), _) => 0 
  case CC_E(_, CC_D(_, _, _)) => 1 
  case CC_E(_, CC_E(CC_D(_, _, _), _)) => 2 
  case CC_E(_, CC_E(CC_E(_, _), _)) => 3 
  case CC_F() => 4 
}
}
// This is not matched: CC_D(_, CC_E(_, _), _)