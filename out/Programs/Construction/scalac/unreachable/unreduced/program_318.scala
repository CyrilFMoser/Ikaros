package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: (Boolean,Byte), c: T_A[Byte]) extends T_A[D]
case class CC_B(a: CC_A[Char], b: T_A[T_A[Int]]) extends T_A[T_A[T_B[Byte, Byte]]]
case class CC_C[E](a: E, b: T_B[E, CC_A[E]]) extends T_B[E, CC_A[E]]
case class CC_D[F](a: T_B[F, CC_A[F]], b: T_B[F, CC_A[F]], c: T_B[T_B[F, F], CC_A[T_B[F, F]]]) extends T_B[F, CC_A[F]]

val v_a: T_B[Char, CC_A[Char]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_C(_, _), CC_C(_, _), CC_C(_, _)) => 1 
  case CC_D(CC_C(_, _), CC_C(_, _), CC_D(_, _, _)) => 2 
  case CC_D(CC_D(_, _, _), CC_C(_, _), CC_C(_, _)) => 3 
  case CC_D(CC_D(_, _, _), CC_C(_, _), CC_D(_, _, _)) => 4 
  case CC_D(CC_C(_, _), CC_D(_, _, _), CC_D(_, _, _)) => 5 
  case CC_D(CC_D(_, _, _), CC_D(_, _, _), CC_C(_, _)) => 6 
  case CC_D(CC_D(_, _, _), CC_D(_, _, _), CC_D(_, _, _)) => 7 
}
}
// This is not matched: CC_D(CC_C(_, _), CC_D(_, _, _), CC_C(_, _))