package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_A[Byte, Char]]) extends T_A[T_A[T_B[Boolean], T_B[Byte]], ((Char,Byte),Char)]
case class CC_B[E, D](a: T_A[E, E]) extends T_A[E, D]
case class CC_C(a: T_B[CC_A], b: Boolean) extends T_A[T_A[T_B[Boolean], T_B[Byte]], ((Char,Byte),Char)]
case class CC_D(a: CC_C, b: CC_B[T_B[CC_A], T_A[CC_C, CC_A]], c: CC_A) extends T_B[CC_A]
case class CC_E() extends T_B[CC_A]
case class CC_F[F](a: Boolean, b: Int, c: Byte) extends T_B[T_A[CC_A, T_B[Char]]]

val v_a: T_A[T_A[T_B[Boolean], T_B[Byte]], ((Char,Byte),Char)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_B(_)) => 1 
  case CC_C(CC_D(_, _, _), _) => 2 
  case CC_C(CC_E(), _) => 3 
}
}