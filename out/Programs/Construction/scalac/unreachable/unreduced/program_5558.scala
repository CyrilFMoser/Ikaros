package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Char, Int], T_B[Int, Boolean]]) extends T_A[T_B[T_B[Int, Boolean], T_A[(Char,Byte)]]]
case class CC_B[E, D](a: CC_A) extends T_B[D, E]
case class CC_C[F](a: T_B[F, F], b: T_B[F, F]) extends T_B[F, Boolean]
case class CC_D[H, G](a: Char, b: T_A[G], c: T_B[G, Boolean]) extends T_B[H, G]

val v_a: T_B[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_B(_))) => 0 
  case CC_B(CC_A(CC_D(_, _, _))) => 1 
  case CC_C(_, _) => 2 
  case CC_D(_, _, CC_B(CC_A(_))) => 3 
  case CC_D(_, _, CC_C(CC_B(_), CC_B(_))) => 4 
  case CC_D(_, _, CC_C(CC_C(_, _), CC_B(_))) => 5 
  case CC_D(_, _, CC_C(CC_D(_, _, _), CC_B(_))) => 6 
  case CC_D(_, _, CC_C(CC_B(_), CC_C(_, _))) => 7 
  case CC_D(_, _, CC_C(CC_C(_, _), CC_C(_, _))) => 8 
  case CC_D(_, _, CC_C(CC_D(_, _, _), CC_C(_, _))) => 9 
  case CC_D(_, _, CC_C(CC_B(_), CC_D(_, _, _))) => 10 
  case CC_D(_, _, CC_C(CC_C(_, _), CC_D(_, _, _))) => 11 
  case CC_D(_, _, CC_C(CC_D(_, _, _), CC_D(_, _, _))) => 12 
  case CC_D(_, _, CC_D('x', _, CC_B(_))) => 13 
  case CC_D(_, _, CC_D('x', _, CC_C(_, _))) => 14 
  case CC_D(_, _, CC_D('x', _, CC_D(_, _, _))) => 15 
  case CC_D(_, _, CC_D(_, _, CC_B(_))) => 16 
  case CC_D(_, _, CC_D(_, _, CC_C(_, _))) => 17 
  case CC_D(_, _, CC_D(_, _, CC_D(_, _, _))) => 18 
}
}