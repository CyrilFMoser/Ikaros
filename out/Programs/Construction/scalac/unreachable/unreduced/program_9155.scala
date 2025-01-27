package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, D], c: Int) extends T_A[D]
case class CC_B[E, F](a: T_B[T_A[F], E]) extends T_A[E]
case class CC_C[G](a: G, b: T_A[G]) extends T_A[G]
case class CC_D(a: T_A[Byte], b: Char, c: (Boolean,T_A[Byte])) extends T_B[T_A[T_A[(Int,Byte)]], T_B[CC_C[Boolean], Char]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A(CC_A(_, _, _), _, _), _, (_,CC_A(_, _, _))) => 0 
  case CC_D(CC_A(CC_A(_, _, _), _, _), _, (_,CC_B(_))) => 1 
  case CC_D(CC_A(CC_A(_, _, _), _, _), _, (_,CC_C(_, _))) => 2 
  case CC_D(CC_A(CC_B(_), _, _), _, (_,CC_A(_, _, _))) => 3 
  case CC_D(CC_A(CC_B(_), _, _), _, (_,CC_B(_))) => 4 
  case CC_D(CC_A(CC_B(_), _, _), _, (_,CC_C(_, _))) => 5 
  case CC_D(CC_A(CC_C(_, _), _, _), _, (_,CC_A(_, _, _))) => 6 
  case CC_D(CC_A(CC_C(_, _), _, _), _, (_,CC_B(_))) => 7 
  case CC_D(CC_A(CC_C(_, _), _, _), _, (_,CC_C(_, _))) => 8 
  case CC_D(CC_B(_), _, (_,CC_A(_, _, _))) => 9 
  case CC_D(CC_B(_), _, (_,CC_B(_))) => 10 
  case CC_D(CC_B(_), _, (_,CC_C(_, _))) => 11 
  case CC_D(CC_C(_, CC_A(_, _, _)), _, (_,CC_A(_, _, _))) => 12 
  case CC_D(CC_C(_, CC_A(_, _, _)), _, (_,CC_B(_))) => 13 
  case CC_D(CC_C(_, CC_A(_, _, _)), _, (_,CC_C(_, _))) => 14 
  case CC_D(CC_C(_, CC_B(_)), _, (_,CC_A(_, _, _))) => 15 
  case CC_D(CC_C(_, CC_B(_)), _, (_,CC_B(_))) => 16 
  case CC_D(CC_C(_, CC_B(_)), _, (_,CC_C(_, _))) => 17 
  case CC_D(CC_C(_, CC_C(_, _)), _, (_,CC_A(_, _, _))) => 18 
  case CC_D(CC_C(_, CC_C(_, _)), _, (_,CC_B(_))) => 19 
  case CC_D(CC_C(_, CC_C(_, _)), _, (_,CC_C(_, _))) => 20 
}
}