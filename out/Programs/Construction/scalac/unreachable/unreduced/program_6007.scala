package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, F], b: T_A[F, F]) extends T_A[E, F]
case class CC_B[G](a: G, b: CC_A[G, G]) extends T_A[G, T_B[(Byte,Int), Boolean]]
case class CC_C(a: T_A[Byte, Boolean]) extends T_A[T_A[Int, T_B[Byte, Int]], T_B[(Byte,Int), Boolean]]
case class CC_D(a: CC_C, b: CC_C) extends T_B[T_A[((Char,Boolean),CC_C), T_B[Int, CC_C]], (T_A[CC_C, CC_C],T_A[CC_C, CC_C])]
case class CC_E(a: CC_A[CC_D, CC_C]) extends T_B[T_A[((Char,Boolean),CC_C), T_B[Int, CC_C]], (T_A[CC_C, CC_C],T_A[CC_C, CC_C])]
case class CC_F(a: T_A[((Boolean,Boolean),CC_D), CC_A[CC_E, CC_D]], b: CC_C) extends T_B[T_A[((Char,Boolean),CC_C), T_B[Int, CC_C]], (T_A[CC_C, CC_C],T_A[CC_C, CC_C])]

val v_a: T_A[T_A[Int, T_B[Byte, Int]], T_B[(Byte,Int), Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(_, _)) => 0 
  case CC_A(CC_A(CC_A(_, _), CC_B(_, _)), CC_A(_, _)) => 1 
  case CC_A(CC_A(CC_B(_, _), CC_A(_, _)), CC_A(_, _)) => 2 
  case CC_A(CC_A(CC_B(_, _), CC_B(_, _)), CC_A(_, _)) => 3 
  case CC_A(CC_A(CC_C(_), CC_A(_, _)), CC_A(_, _)) => 4 
  case CC_A(CC_A(CC_C(_), CC_B(_, _)), CC_A(_, _)) => 5 
  case CC_A(CC_B(_, _), CC_A(_, _)) => 6 
  case CC_A(CC_C(_), CC_A(_, _)) => 7 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_B(_, _)) => 8 
  case CC_A(CC_A(CC_A(_, _), CC_B(_, _)), CC_B(_, _)) => 9 
  case CC_A(CC_A(CC_B(_, _), CC_B(_, _)), CC_B(_, _)) => 10 
  case CC_A(CC_A(CC_C(_), CC_A(_, _)), CC_B(_, _)) => 11 
  case CC_A(CC_A(CC_C(_), CC_B(_, _)), CC_B(_, _)) => 12 
  case CC_A(CC_B(_, _), CC_B(_, _)) => 13 
  case CC_A(CC_C(_), CC_B(_, _)) => 14 
  case CC_B(_, _) => 15 
  case CC_C(CC_A(CC_A(_, _), CC_A(_, _))) => 16 
}
}
// This is not matched: CC_A(CC_A(CC_B(_, _), CC_A(_, _)), CC_B(_, _))